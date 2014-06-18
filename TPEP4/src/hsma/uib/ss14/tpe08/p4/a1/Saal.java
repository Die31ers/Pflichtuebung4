package hsma.uib.ss14.tpe08.p4.a1;

/**
 * Die Klasse <code>Saal</code> hat einen Namen und 
 * eine Anzahl von Sitzplätzen
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * 
 */
public class Saal{
	private String name;
	private int anzahlSitze;

	/**
	 * Konstruktor <code>Saal()</code> mit den Parametern
	 * @param name
	 * @param anzahlSitze
	 * verweißt auf die Variablen der Klasse Saal
	 */
	public Saal(String name, int anzahlSitze) {
		this.name = name;
		this.anzahlSitze = anzahlSitze;
	}

	/**
	 * Die Methode <code>getName()</code> liefert uns den Namen zurück
	 * @return
	 */
	public String getName() {
		return this.name;

	}

	/**
	 * Die Methode <code>getAnzahlSitze()</code> liefert uns
	 * die Anzahl der Sitze zurück
	 * @return
	 */
	public int getAnzahlSitze() {
		return this.anzahlSitze;
	}
	
	/**
	 * Die Methode <code>toString()</code> wandelt alles
	 * in einem String und gibt sie uns zurück
	 */
	public String toString(){
		return "Saal " + "'"+ name + "'" + "(" + anzahlSitze +" Plaetze" +  ")";
	}
}
