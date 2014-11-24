package myPackage;

import java.util.ArrayList;
import java.util.List;

import logogui.Log;
import logoparsing.LogoParser.InstructionContext;
import logoparsing.LogoParser.VariableContext;
import logoparsing.LogoTreeVisitor;

public class Procedure {
	protected PileLoop pile;
	protected ArrayList<String> parametres;
	protected String nom;
	protected ArrayList<InstructionContext> instructions;
	
	public Procedure(String nom) {
		parametres = new ArrayList<String>();
		pile = new PileLoop();
		this.nom = nom;
		parametres = new ArrayList<String>();
		instructions = new ArrayList<InstructionContext>();
	}
	
	
	public Procedure(String nom, List<InstructionContext> ctx) {
		System.out.println("Constructeur de procedure");
		parametres = new ArrayList<String>();
		this.nom = nom;
		pile = new PileLoop();
		instructions = new ArrayList<InstructionContext>();
		
		for(InstructionContext ct : ctx) {
			addInstruction(ct);
		}
		
	}
	
	public Procedure(String nom2, ArrayList<InstructionContext> ctx) {
		parametres = new ArrayList<String>();
		this.nom = nom;
		pile = new PileLoop();
		instructions = new ArrayList<InstructionContext>();
		
		for(InstructionContext ct : ctx) {
			addInstruction(ct);
		}
	}


	public ArrayList<String> getParams() {
		return parametres;
	}
	
	public String getNom() {
		return nom;
	}

	public boolean iscontainsParam() {
		return (parametres.size() > 0);
	}
	
	public void ajouterParam(String name) {
		parametres.add(name);
	}
	
	public int getNbParam() {
		return parametres.size();
	}
	
	public String getParam(int index) {
		if (index < 0 || index > parametres.size()) {
			Log.append("Impossible d'acceder a un parametre contenu dans la procedure\n");
		}
		return parametres.get(index);
	}
	
	public List<InstructionContext> getInstructions () {
		return instructions;
	}
	
	public void addInstruction(InstructionContext ctx) {
		instructions.add(ctx);
	}
		
	public void execute(LogoTreeVisitor treeVisitor) {
		System.out.println("Execution de  : '"+nom+"'");
		if(!instructions.isEmpty()) {
			for( InstructionContext context : instructions) {
				treeVisitor.visit(context);
			}
		}
		else
		{
			System.out.println("Pas d'instructions");
		}
	}
	
	
	
	
}
