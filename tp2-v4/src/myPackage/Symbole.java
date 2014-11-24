package myPackage;

import java.util.HashMap;
import java.util.Map;

import logogui.Log;

public class Symbole {
	private Map<String, Integer> tabSymbole;
	private int error;
	
	public Symbole() {
		tabSymbole = new HashMap<String, Integer>();
		error = 0;
		//temporaire le Integer car par la suite on devra stocker des fonctions
		//pileSymbole = new Stack<Integer>();
	}
	
	/**
	 * 
	 * @param symbole
	 * @return retourne le symbole sinon 0 (car n'influe en rien). Mais on pourrait renvoyer une erreur 
	 */
	public int getSymbole(String symbole) {
		
		if(!tabSymbole.containsKey(symbole)) {
			Log.append("Erreur la variable \"" + symbole + "\" n'existe pas \n");
			error = -1;
			return -1;
		}
		int valeur = tabSymbole.get(symbole);
		return valeur;
	}
	
	public void ajouterSymbole(String symbole, int valeur) {
		System.out.println("Ajout de symboles ---> " +symbole + " : "+valeur);
		tabSymbole.put(symbole, valeur);
	}

	public int getError() {
		return error;
	}

	public void setError(int error) {
		this.error = error;
	}
	
	
	
	
}
