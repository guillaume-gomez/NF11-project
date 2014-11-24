package myPackage;

import logogui.Traceur;

/**
 * 
 * @author guillaume gomez
 *
 */
public class ContextApplication {
	
	private static ContextApplication myContext = new ContextApplication();
	
	TableSymboles tableSymbole;
	PileLoop pileLoop;
	ListeProcedure listeProc;
	
	private ContextApplication() {

		  System.out.println("Contruction du context");
		  tableSymbole = new TableSymboles();
	      pileLoop = new PileLoop();
	      listeProc = new ListeProcedure();
	}
	


	public static ContextApplication getMyContext() {
		return  myContext;
	}

	public TableSymboles getTableSymbole() {
		return tableSymbole;
	}

	public void setTableSymbole(TableSymboles tableSymbole) {
		this.tableSymbole = tableSymbole;
	}
	
	public void clear() {
		tableSymbole.clear();
		pileLoop.clear();
		listeProc.clear();
	}

	public PileLoop getPileLoop() {
		return pileLoop;
	}

	public void setPileLoop(PileLoop pileLoop) {
		this.pileLoop = pileLoop;
	}

	public ListeProcedure getListeProc() {
		return listeProc;
	}

	public void setListeProc(ListeProcedure listeProc) {
		this.listeProc = listeProc;
	}
	

	
}
