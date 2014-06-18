package hsma.uib.ss14.tpe08.p4.a1;

/**
 * Die Klasse Saal. Ein Saal hat ein bestimmten Namen und eine gewisse Anzahl
 * von Sitzen.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * 
 */
public class Saal {
	private String name;
	private int anzahlSitze;

	/**
	 * Konstruktor der Klasse Saal
	 * 
	 * @param name
	 * @param anzahlSitze
	 */
	public Saal(String name, int anzahlSitze) {
		this.name = name;
		this.anzahlSitze = anzahlSitze;
	}

	/**
	 * Gibt den Namen des Saales zurück
	 * 
	 * @return
	 */
	public String getName() {
		return this.name;

	}

	/**
	 * Gibt die Anzahl der Sitze im Saal zurück
	 * 
	 * @return
	 */

	public int getAnzahlSitze() {
		return this.anzahlSitze;
	}

	/**
	 * Die <code>toString()</code> Methode gibt die passende Ausgabe zurück
	 */
	public String toString() {
		return "Saal " + "'" + name + "'" + "(" + anzahlSitze + " Plaetze"
				+ ")";
	}
}
