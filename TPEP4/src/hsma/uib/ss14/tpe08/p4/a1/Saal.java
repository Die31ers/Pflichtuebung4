package hsma.uib.ss14.tpe08.p4.a1;

/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * 
 */
public abstract class Saal {
	protected static String name ; 
	protected static int anzahlSitze;

	protected Saal(String name, int anzahlSitze) {
		this.name = name;
		this.anzahlSitze = anzahlSitze;
	}
	
	protected String getName(){
		return this.name;
		
	}
	protected int getAnzahlSitze() {
		return this.anzahlSitze;
	}
}
