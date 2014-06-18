package hsma.uib.ss14.tpe08.p4.a1;

/**
 * Die Klasse Saal. Ein Saal hat ein bestimmten Namen und eine gewisse Anzahl
 * von Sitzen.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
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
	 * 
	 */
	public Saal(String name, int anzahlSitze) {
		this.name = name;
		this.anzahlSitze = anzahlSitze;
	}

	/**
	 * Gibt den Namen des Saals zurück.
	 * 
	 * @return name
	 */
	public String getName() {
		return this.name;

	}

	/**
	 * Gibt die Anzahl der Sitze des Saals zurück.
	 * 
	 * @return anzahlSitze
	 */
	public int getAnzahlSitze() {
		return this.anzahlSitze;
	}

	/**
	 * Die überschriebene <code>toString()</code> Methode.
	 */
	@Override
	public String toString() {
		return "Saal " + "'" + name + "'" + " (" + anzahlSitze + " Plaetze"
				+ ")";
	}
}
