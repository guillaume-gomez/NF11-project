package logoparsing;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import logogui.Log;
import logogui.Traceur;
import logoparsing.LogoParser.AvContext;
import logoparsing.LogoParser.BcContext;
import logoparsing.LogoParser.BlocContext;
import logoparsing.LogoParser.EgalContext;
import logoparsing.LogoParser.ExecProcedContext;
import logoparsing.LogoParser.Exec_foncContext;
import logoparsing.LogoParser.ExecfoncContext;
import logoparsing.LogoParser.ExpContext;
import logoparsing.LogoParser.ExprContext;
import logoparsing.LogoParser.FccContext;
import logoparsing.LogoParser.FoncContext;
import logoparsing.LogoParser.FposContext;
import logoparsing.LogoParser.HasardContext;
import logoparsing.LogoParser.InfContext;
import logoparsing.LogoParser.InfzeroContext;
import logoparsing.LogoParser.InstructionContext;
import logoparsing.LogoParser.IntContext;
import logoparsing.LogoParser.LcContext;
import logoparsing.LogoParser.LoopContext;
import logoparsing.LogoParser.MultContext;
import logoparsing.LogoParser.NotEgalContext;
import logoparsing.LogoParser.ParentContext;
import logoparsing.LogoParser.ProcedContext;
import logoparsing.LogoParser.ReContext;
import logoparsing.LogoParser.RepeteContext;
import logoparsing.LogoParser.ResVarContext;
import logoparsing.LogoParser.SiContext;
import logoparsing.LogoParser.SumContext;
import logoparsing.LogoParser.SupContext;
import logoparsing.LogoParser.SupzeroContext;
import logoparsing.LogoParser.TantqueContext;
import logoparsing.LogoParser.TdContext;
import logoparsing.LogoParser.TgContext;
import logoparsing.LogoParser.VariContext;
import logoparsing.LogoParser.VariableContext;
import logoparsing.LogoParser.VeContext;
import myPackage.ContextApplication;
import myPackage.Fonction;
import myPackage.ListeProcedure;
import myPackage.PileLoop;
import myPackage.Procedure;
import myPackage.TableSymboles;

import java.lang.Math;
import java.util.ArrayList;



public class LogoTreeVisitor extends LogoBaseVisitor<Integer> {
	
	Traceur traceur;
	TableSymboles tableSymbole;
	PileLoop pileLoop;
	ListeProcedure listeProc;
	
	ParseTreeProperty<Integer> atts = new ParseTreeProperty<Integer>();
	
	
	public LogoTreeVisitor() {
		super();		
	}
	public void initialize(java.awt.Graphics g) {
	      traceur = new Traceur();
	      traceur.setGraphics(g);
	    
	      tableSymbole = ContextApplication.getMyContext().getTableSymbole();
	      pileLoop = ContextApplication.getMyContext().getPileLoop();
	      listeProc =  ContextApplication.getMyContext().getListeProc();
    }
	
	public void setAttValue(ParseTree node, int value) { 
		atts.put(node, value);
	}
	
	public int getAttValue(ParseTree node) { return atts.get(node); }
	
	
	public Integer visitAv(AvContext ctx) {
		visitChildren(ctx);
		traceur.avance(getAttValue(ctx.expr()));
		return 0;
	}
	
	
	public Integer visitTg(TgContext ctx) {
		visitChildren(ctx);
		traceur.tg(getAttValue(ctx.expr()));
		return 0;
	}
	
	
	
	public Integer visitTd(TdContext ctx) {
		visitChildren(ctx);
		traceur.td(getAttValue(ctx.expr()));
		return 0;
	}
	
	
	public Integer visitRe(ReContext ctx) {
		visitChildren(ctx);
		traceur.re(getAttValue(ctx.expr()));
		return 0;
	}


	
	public Integer visitLc(LcContext ctx) {
		traceur.lc();
		return 0;
	}
	
	public Integer visitBc(BcContext ctx) {
		traceur.bc();
		return 0;
	}
	
	
	public Integer visitFpos(FposContext ctx) {
		visitChildren(ctx);
		traceur.fpos(getAttValue(ctx.expr(0)), getAttValue(ctx.expr(1)));
		return 0;
	}
	
	
	public Integer visitFcc(FccContext ctx) {
		visitChildren(ctx);
		traceur.fcc(getAttValue(ctx.expr()));
		return 0;
	}
	
	
	public Integer visitVe(VeContext ctx) {
		traceur.ve();
		return 0;
	}
	
	
	public Integer visitHasard(HasardContext ctx) {
		visit(ctx.expr());
		int valeur  = getAttValue(ctx.expr());
		int result = (int)(Math.random() * (valeur-1)) + 1;
		setAttValue(ctx, result);
		return 0;
	}
	
	
	public Integer visitExp(ExpContext ctx) {
		visit(ctx.expr(0));
		visit(ctx.expr(1));
		int left = getAttValue(ctx.expr(0));
		int right = getAttValue(ctx.expr(1));
		int result = (int)Math.pow((double) left, (double) right);
		setAttValue(ctx, result);
		return 0;
	}
	
	public Integer visitMult(MultContext ctx) {
		visit(ctx.expr(0));
		visit(ctx.expr(1));
		int left = getAttValue(ctx.expr(0));
		int right = getAttValue(ctx.expr(1));
		/*if(right == 0 && ctx.getChild(1).getText().equals("/")) {
			Log.append("Division par zero impossible\n");
			return  -1;
		}*/

		int result = ctx.getChild(1).getText().equals("*") ? left * right : left / right;
		setAttValue(ctx, result);
		return 0;
	}
	
	public Integer visitSum(SumContext ctx) {
		visit(ctx.expr(0));
		visit(ctx.expr(1));
		int left = getAttValue(ctx.expr(0));
		int right = getAttValue(ctx.expr(1));
		int result = ctx.getChild(1).getText().equals("+") ? left + right : left - right;
		setAttValue(ctx, result);
		return 0;
	}
	
	
	
	public Integer visitBloc(BlocContext ctx) {
		for(InstructionContext context : ctx.instruction()) {
			visit(context);
		}
		return 0;
	}
	
	public Integer visitSi(SiContext ctx) {
		visit(ctx.condition());
		int resultCondition = getAttValue(ctx.condition());
		if(resultCondition == 1) {
				visit(ctx.bloc(0));
		}
		else {
			if(ctx.bloc().size() > 1) {
				visit(ctx.bloc(1));
			}
		}
		return 0;
	}
	
	public Integer visitRepete(RepeteContext ctx) {
		visit(ctx.expr());
		//ajoute le compteur de la boucle accessible au loop
		pileLoop.ajouter(0);
		int repet = getAttValue(ctx.expr());
		for (int i = 0; i < repet ; i++) {
			pileLoop.mettreAJour(i);
			visit(ctx.bloc());
		}
		pileLoop.depiler();
		return 0;
	}
	
	
	public Integer visitTantque(TantqueContext ctx) {
		visit(ctx.condition());
		int condition = getAttValue(ctx.condition());
		 while (condition == 1) {
			visit(ctx.bloc());
			visit(ctx.condition());
			condition = getAttValue(ctx.condition());
		}
		return 0;
	}
	
	
	public Integer visitInt(IntContext ctx) {
		setAttValue(ctx, Integer.valueOf(ctx.getText()));
		return 0;
	}
	
	
	public Integer visitLoop(LoopContext ctx) {
		if(!pileLoop.isVide()) {
			System.out.println("Valeur de la pile "+ pileLoop.getValeur());
			setAttValue(ctx, pileLoop.getValeur());
		}
		else
		{
			Log.append("Erreur loop ne pas etre appelée dans ces conditions\n");
			System.out.println("Erreur loop ne pas etre appelée dans ces conditions\n");
		}
		return 0;
	}
	
	
	
	public Integer visitResVar(ResVarContext ctx) {
		int valeurVar = tableSymbole.getSymbole(ctx.getChild(1).getText());
		setAttValue(ctx, valeurVar);
		return 0;
	}
	
	/**
	 * Met Ã  jour une variable ou la crÃ©e
	 */
	
	public Integer visitVari(VariContext ctx) {
		visit(ctx.expr());
		String key = ctx.variable().getText();
		int valeur  = getAttValue(ctx.expr());
		tableSymbole.ajouterSymbole(key, valeur);
		return 0;
	}
	

	public Integer visitSupzero(SupzeroContext ctx) {
		visit(ctx.expr(0));
		visit(ctx.expr(1));
		int gauche = getAttValue(ctx.expr(0));
		int droite = getAttValue(ctx.expr(1));
		int result = (gauche >= droite)? 1 : 0;
		setAttValue(ctx, result);
		return 0;
	}
	
	public Integer visitSup(SupContext ctx) {
		visit(ctx.expr(0));
		visit(ctx.expr(1));
		int gauche = getAttValue(ctx.expr(0));
		int droite = getAttValue(ctx.expr(1));
		int result = (gauche > droite)? 1 : 0;
		setAttValue(ctx, result);
		return 0;
	}
	
	public Integer visitInf(InfContext ctx) {
		visit(ctx.expr(0));
		visit(ctx.expr(1));
		int gauche = getAttValue(ctx.expr(0));
		int droite = getAttValue(ctx.expr(1));
		int result = (gauche < droite)? 1 : 0;
		setAttValue(ctx, result);
		return 0;
	}
	
	public Integer visitEgal(EgalContext ctx) {
		visit(ctx.expr(0));
		visit(ctx.expr(1));
		int gauche = getAttValue(ctx.expr(0));
		int droite = getAttValue(ctx.expr(1));
		int result = (gauche == droite)? 1 : 0;
		setAttValue(ctx, result);
		return 0;
	}
	
	public Integer visitInfzero(InfzeroContext ctx) {
		visit(ctx.expr(0));
		visit(ctx.expr(1));
		int gauche = getAttValue(ctx.expr(0));
		int droite = getAttValue(ctx.expr(1));
		int result = (gauche <= droite)? 1 : 0;
		setAttValue(ctx, result);
		return 0;
	}
	
	
	public Integer visitNotEgal(NotEgalContext ctx) {
		visit(ctx.expr(0));
		visit(ctx.expr(1));
		int gauche = getAttValue(ctx.expr(0));
		int droite = getAttValue(ctx.expr(1));
		int result = (gauche != droite)? 1 : 0;
		setAttValue(ctx, result);
		return 0;
	}
	
	
	public Integer visitParent(ParentContext ctx) {
		visit(ctx.expr());
		setAttValue(ctx, getAttValue(ctx.expr()));
		return 0;
	}
	
	
	@Override
	public Integer visitExecProced(ExecProcedContext ctx) {
		
		Procedure procedure = listeProc.getProcedure(ctx.CHAR().getText());
		// on recupere les variables en parametres et on les stockent
		ArrayList<Integer> valueParam  = new ArrayList<Integer>();
			for (ExprContext expr : ctx.expr()) {
				visit(expr);
				int valeur = getAttValue(expr);
				valueParam.add(valeur);
			}
		//if( procedure.getNbParam() == ctx.expr().size()) {
			tableSymbole.creerNouveauSymbole();
			if(procedure.iscontainsParam()) {
				for( int i = 0 ; i < procedure.getParams().size(); i++) {
					if( i < valueParam.size()) {
						tableSymbole.ajouterSymbole(procedure.getParam(i), valueParam.get(i));
					}
				}
			}
			procedure.execute(this);
			tableSymbole.depilerSymbolesProcedure();
		/*}
		else
		{
			Log.append("LOGOTREEVISITOR Erreur --> le nombre de parametres ne correspondent pas pour la procedure \""+procedure.getNom()+"\"\n");
			Log.append("nombre de param attendus : "+ procedure.getNbParam() + "\n");
			Log.append("nombre de param lus : "+ ctx.expr().size() + "\n");
		}*/
		return 0;
	}
	@Override
	public Integer visitProced(ProcedContext ctx) {
		System.out.println("Ajout procedure");
		Procedure proc = new Procedure(ctx.CHAR().toString(), ctx.instruction());
		
		for(VariableContext var : ctx.variable()) {
			proc.ajouterParam(var.getText());
		}
		
		listeProc.addProcedure(proc);
				
		return 0;
	}
	
	@Override
	public Integer visitFonc(FoncContext ctx) {
		System.out.println("Ajout fonction");
		Fonction fonc = new Fonction(ctx.CHAR().toString(), ctx.instruction());
		
		for(VariableContext var : ctx.variable()) {
			fonc.ajouterParam(var.getText());
		}
		
		fonc.setReturnInstr(ctx.expr());
		listeProc.addProcedure(fonc);
					
		return 0;
	}
	

	@Override
	public Integer visitExec_fonc(Exec_foncContext ctx) {
		Fonction fonction = listeProc.getFonction(ctx.CHAR().getText());
		// on recupere les variables en parametres et on les stockent
		ArrayList<Integer> valueParam  = new ArrayList<Integer>();
			for (ExprContext expr : ctx.expr()) {
				visit(expr);
				int valeur = getAttValue(expr);
				System.out.println("Valeur "+valeur );
				System.out.println("--------------------------");
				valueParam.add(valeur);
				
			}
			System.out.println(fonction.getNbParam());
		//if( fonction.getNbParam() == ctx.expr().size()) {
			tableSymbole.creerNouveauSymbole();
			if(fonction.iscontainsParam()) {
				for( int i = 0 ; i < fonction.getParams().size(); i++) {
					if( i < valueParam.size()) {
						tableSymbole.ajouterSymbole(fonction.getParam(i), valueParam.get(i));
					}
				}
			}
			fonction.execute(this);
			tableSymbole.depilerSymbolesProcedure();
			setAttValue(ctx, fonction.getRetourFonction());
		/*}
		/else
		{
			Log.append("LOGOTREEVISITOR Erreur --> le nombre de parametres ne correspondent pas pour la fonction \""+fonction.getNom()+"\"\n");
			Log.append("nombre de param attendus : "+ fonction.getNbParam() + "\n");
			Log.append("nombre de param lus : "+ ctx.expr().size() + "\n");
			
		}*/
		return 0;
	}
		
}
