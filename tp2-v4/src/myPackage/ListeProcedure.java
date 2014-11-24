package myPackage;

import java.util.ArrayList;

import logogui.Log;

public class ListeProcedure {
	public ArrayList<Procedure> listeProcedure;
	private int error;
	
	public ListeProcedure() {
		listeProcedure = new ArrayList<Procedure>();
		//System.out.println("Nothing to do in ListeProcedure");
	}
	
	public void clear() {
		error = 0;
		listeProcedure.clear();
	}
	
	public void addProcedure( Procedure proced) {	
		
		for(Procedure proc : listeProcedure) {
			//si il ont le meme nom et qu'il possede le meme nom de params
			if(proc.getNom().equals(proced.getNom()) && proc.getNbParam() == proced.getNbParam()) {
				error = -2;
				System.out.println("la structure existe deja sous ce nom avec ce nombre de parametre");
			}
		}
		
		
		if(error != -2)
		{
			listeProcedure.add(proced);
		}
		
		System.out.println("Ajout de la procedure '"+proced.getNom()+"' dans la classe ListeProcedure");
		
		
	}
	
	
	public Procedure getProcedure(String nomFonction) {
		for(Procedure proc : listeProcedure) {
			if(proc.getNom().equals(nomFonction)) {
				return proc;
			}
		}
		Log.appendnl("Impossible de trouver '"+nomFonction+"'");
		return null;
	}
	
	public Fonction getFonction(String nomFonction) {
		return (Fonction) getProcedure(nomFonction);
	}

	public int getError() {
		return error;
	}
	

}
