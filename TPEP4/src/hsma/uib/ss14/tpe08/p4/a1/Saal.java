package hsma.uib.ss14.tpe08.p4.a1;

/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * 
 */
public  class Saal {
	private static String name ; 
	private static int anzahlSitze;

	private Saal(String name, int anzahlSitze) {
		this.name = name;
		this.anzahlSitze = anzahlSitze;
	}
	
	private String getName(){
		return this.name;
		
	}
	protected int getAnzahlSitze() {
		return this.anzahlSitze;
	}
}
