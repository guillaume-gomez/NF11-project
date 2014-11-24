package myPackage;

import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import logogui.Log;
import logoparsing.LogoBaseVisitor;
import logoparsing.LogoParser.ExecProcedContext;
import logoparsing.LogoParser.Exec_foncContext;
import logoparsing.LogoParser.FoncContext;
import logoparsing.LogoParser.InstructionContext;
import logoparsing.LogoParser.LoopContext;
import logoparsing.LogoParser.ProcedContext;
import logoparsing.LogoParser.ResVarContext;
import logoparsing.LogoParser.VariContext;
import logoparsing.LogoParser.VariableContext;


public class LogoSemanticVisitor extends LogoBaseVisitor<Integer> {
	private boolean isExecutable;
	
	
	TableSymboles tableSymbole;
	PileLoop pileLoop;
	ListeProcedure listeProc;
	
	
	
	ParseTreeProperty<Integer> atts = new ParseTreeProperty<Integer>();
	
	public LogoSemanticVisitor() {
		super();
		System.out.println("Construction de SemanticVisitor");
		isExecutable = true;	
		
		  tableSymbole = ContextApplication.getMyContext().getTableSymbole();
	      pileLoop = ContextApplication.getMyContext().getPileLoop();
	      listeProc =  ContextApplication.getMyContext().getListeProc();
	}

	public boolean isExecutable() {
		return isExecutable;
	}

	public Integer visitResVar(ResVarContext ctx) {
		int valeurVar = tableSymbole.getSymbole(ctx.getChild(1).getText());
		if( tableSymbole.getError() != 0) {
			//Log.appendnl("Erreur variable '"+ctx.getChild(1).getText()+"' non défini");
			isExecutable = false;
			tableSymbole.setError(0);
		}
		return 0;
	}
	
	
	public Integer visitVari(VariContext ctx) {
		visit(ctx.expr());
		String key = ctx.variable().getText();
		tableSymbole.ajouterSymbole(key, 0);
		return 0;
	}
	
	@Override
	public Integer visitExecProced(ExecProcedContext ctx) {
		
		Procedure procedure = listeProc.getProcedure(ctx.CHAR().getText());
		
		if( procedure == null) {
			isExecutable = false;
			return -1;
		}
		
		
		if( procedure.getNbParam() != ctx.expr().size()) {
			Log.append("Erreur --> le nombre de parametres ne correspondent pas pour la procedure \""+procedure.getNom()+"\"\n");
			Log.append("nombre de param attendus : "+ procedure.getNbParam() + "\n");
			Log.append("nombre de param lus : "+ ctx.expr().size() + "\n");
			
			isExecutable = false;
		}
		return 0;
	}
	@Override
	public Integer visitProced(ProcedContext ctx) {
		Procedure proc = new Procedure(ctx.CHAR().toString(), ctx.instruction());
		
		String patternString = "donne\"([a-zA-Z]+)\\d+";
		Pattern p = Pattern.compile(patternString);
		for (InstructionContext truc : ctx.instruction()) {
			String text = truc.getText();
			Matcher m = p.matcher(text);
			if(m.find()) {
				for(VariableContext var : ctx.variable()) {
					if(m.group(1).equals(var.getText())) {
						
						isExecutable = false;
						Log.appendnl("Une variable locale possèdent le même nom qu'un parametres");
						Log.appendnl("parametre '"+var.getText()+"' et la variable locale '"+m.group(1)+"'");
					}
				}
			}
		}
		for(VariableContext var : ctx.variable()) {
			proc.ajouterParam(var.getText());
		}
		
		
		listeProc.addProcedure(proc);
		
		if (listeProc.getError()!= 0){
			Log.appendnl("Erreur : une methode ou une procedure existe deja avec ce nom '"+proc.getNom()+"' et avec le même nombre de paramêtre");
			Log.appendnl("Nombre de parametre --> " +proc.getNbParam());
		}
				
		return 0;
	}
	
	@Override
	public Integer visitFonc(FoncContext ctx) {
		Fonction fonc = new Fonction(ctx.CHAR().toString());
		
		String patternString = "donne\"([a-zA-Z]+)\\d+";
		Pattern p = Pattern.compile(patternString);
		for (InstructionContext truc : ctx.instruction()) {
			String text = truc.getText();
			Matcher m = p.matcher(text);
			if(m.find()) {
				for(VariableContext var : ctx.variable()) {
					if(m.group(1).equals(var.getText())) {
						
						isExecutable = false;
						Log.appendnl("Une variable locale possèdent le même nom qu'un parametres");
						Log.appendnl("parametre '"+var.getText()+"' et la variable locale '"+m.group(1)+"'");
					}
				}
			}
		}
		
		for(VariableContext var : ctx.variable()) {
			fonc.ajouterParam(var.getText());
		}
		listeProc.addProcedure(fonc);
		
		if (listeProc.getError()!= 0){
			Log.appendnl("Erreur : une methode ou une fonction existe deja avec ce nom '"+fonc.getNom()+"' et avec le même nombre de paramêtre");
			Log.appendnl("Nombre de parametre --> " +fonc.getNbParam());
		}
		fonc.setReturnInstr(ctx.expr());
				
		return 0;
	}
	

	@Override
	public Integer visitExec_fonc(Exec_foncContext ctx) {
		Fonction fonction = null;
		try {
			fonction = (Fonction) listeProc.getProcedure(ctx.CHAR().getText());
		}
		catch (Exception ex) {
			isExecutable = false;
			Log.appendnl("Erreur impossible de convertir une Procedure en Fonction");
			return -1;
		}
		// on recupere les variables en parametres et on les stockent
		if( fonction == null) {
			isExecutable = false;
			return -1;
		}
		
		if( fonction.getNbParam() != ctx.expr().size()) {
			Log.append("Erreur --> le nombre de parametres ne correspondent pas pour la fonction \""+fonction.getNom()+"\"\n");
			Log.append("nombre de param attendus : "+ fonction.getNbParam() + "\n");
			Log.append("nombre de param lus : "+ ctx.expr().size() + "\n");
			isExecutable = false;
		}


		return 0;
	}
	
	
	public void setExecutable(boolean isExecutable) {
		this.isExecutable = isExecutable;
	}
	/**
	 * @deprecated
	 */
	public Integer visitLoop(LoopContext ctx) {
		/*if(pileLoop.isVide()) 
		{
			Log.append("Erreur loop ne pas etre appelé dans ces conditions\n");
		}*/
		return 0;
	}
	
}
