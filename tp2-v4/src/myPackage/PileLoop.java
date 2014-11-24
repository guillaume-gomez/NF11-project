package myPackage;
import java.util.Stack;

import logogui.Log;


public class PileLoop {
	private Stack<Integer> pile;
	
	public PileLoop (){
		pile = new Stack<Integer>();
	}
	
	public void clear() {
		pile.clear();
	}
	
	public void mettreAJour (int Nvaleur) {
		if(pile.isEmpty()) {
			Log.append("La pile est vide pas de mise à jour possible"); 
		}
		else
		{
			System.out.println("Mise à jour PileLoop " + Nvaleur);
			pile.pop();
			pile.push(Nvaleur);
		}
	}
	
	public void ajouter (int valeur) {
		System.out.println("Ajout PileLoop " + valeur);
		pile.push(valeur);
	}
	
	public int depiler() {
		return pile.pop();
	}
	
	public int getValeur (){
		if(!pile.isEmpty()) {
			int valeur = pile.pop();
			pile.push(valeur);
			return valeur;
		}
		else {
			Log.append("Erreur la pile est vide PileLoop.getValeur()");	
			return -1;
		}
		
	}
	
	public boolean isVide() {
		return pile.isEmpty();
	}
	

}
