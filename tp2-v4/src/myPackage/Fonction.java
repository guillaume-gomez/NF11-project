package myPackage;

import java.util.ArrayList;
import java.util.List;

import logoparsing.LogoTreeVisitor;
import logoparsing.LogoParser.ExprContext;
import logoparsing.LogoParser.InstructionContext;

public class Fonction extends Procedure {
	private int retourFonction;
	private ExprContext returnInstr;
	
	public Fonction(String nom) {
		super(nom);
		retourFonction = 0;
		// TODO Auto-generated constructor stub
	}
	
	public Fonction(String nom, ArrayList<InstructionContext> ctx) {
		super(nom, ctx);
		retourFonction = 0;
	}
	
	public Fonction(String nom , List<InstructionContext> ctx) {
		super(nom, ctx);
		retourFonction = 0;
	}

	public void setReturnInstr (ExprContext ctx) {
		returnInstr = ctx;
	}
	
	public ExprContext getReturnInstr () {
		return returnInstr;
	}
	
	public int getRetourFonction() {
		return retourFonction;
	}

	public void setRetourFonction(int retourFonction) {
		this.retourFonction = retourFonction;
	}
	
	@Override
	public void execute(LogoTreeVisitor treeVisitor) {
		super.execute(treeVisitor);
		treeVisitor.visit(this.getReturnInstr());
		retourFonction = treeVisitor.getAttValue(this.getReturnInstr());
		System.out.println("Valeur renvoyée -->" +retourFonction);
		
	}
	
	

}
