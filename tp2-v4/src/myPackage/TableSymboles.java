package myPackage;

import java.util.Stack;

import logogui.Log;

public class TableSymboles {

	private Stack<Symbole> dictSymbole;
	private int error;
	
	
	
	public int getError() {
		return error;
	}

	public void setError(int error) {
		this.error = error;
	}

	public TableSymboles() {
		dictSymbole = new Stack<Symbole>();
		//on creer un contexte principal (le main)
		Symbole main = new Symbole();
		dictSymbole.push(main);
		error = 0;
	}
	
	public void clear() {
		dictSymbole.clear();
		Symbole main = new Symbole();
		dictSymbole.push(main);
		
	}
	
	public int getSymbole(String symbole) {
		int valeur = 0;
		if(dictSymbole.isEmpty()) {
			System.out.println("Erreur dans la classe TablesSymbole::getSymbole la pile est vide");
		}
		else{
			Symbole courrant = dictSymbole.pop();
			//on le remet dans la pile
			dictSymbole.push(courrant);
			valeur = courrant.getSymbole(symbole);
			if(courrant.getError() != 0) {
				error = -3;
			}
		}
		return valeur;
	}
	
	public void ajouterSymbole(String symbole, int valeur) {
		if(dictSymbole.isEmpty()) {
			Log.appendnl("Erreur dans la classe TablesSymbole::ajouterSymbole la pile est vide");
			error = -1;
		}
		else 
			{
			Symbole courrant = dictSymbole.pop();
			courrant.ajouterSymbole(symbole, valeur);
			//on le remet dans la pile
			dictSymbole.push(courrant);
		}
	}
	
	
	public void ajouterNouveauxSymboles(Symbole sym) {
		dictSymbole.push(sym);
	}
	
	public void creerNouveauSymbole() {
		System.out.println("Ajout d'une liste de symboles");
		if(dictSymbole.size() < dictSymbole.capacity()) {
			System.out.println(dictSymbole.capacity());
			Symbole nouveau = new Symbole();
			dictSymbole.push(nouveau);
		}
		else
		{
			Log.appendnl("La pile de symbole est pleine, limiter votre recursivitité");
			error = -2;
		}
	}
	
	public void depilerSymbolesProcedure() {
		if(!dictSymbole.isEmpty()) {
		dictSymbole.pop();
		}
		System.out.println("taille de la table des symboles "+dictSymbole.size());
		
	}

	

}
