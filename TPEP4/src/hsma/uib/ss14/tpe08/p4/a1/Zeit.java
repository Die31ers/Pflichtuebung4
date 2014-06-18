package hsma.uib.ss14.tpe08.p4.a1;

import java.util.StringTokenizer;

/**
 * Wir definieren uns eine eigene Klasse <code>Zeit</code> 
 * für die Startzeit, da die von Java mitgelieferten Klassen
 * Date und Calender sehr unhandlich in der Benutzung sind
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * 
 */
public class Zeit {
	private int stunden;
	private int minuten;
	private String alsString;

	/**
	 * Konstruktor <code>Zeit</code>
	 * 
	 * @param zeit
	 */
	public Zeit(String zeit) {
		fromString(zeit);
	}

	/**
	 * Die Zeit wird aus einem String im Format HH:MM erzeugt
	 * (parse) und wieder in einen solchen wieder konvertiert
	 * 
	 * @param alsString
	 */
	public void fromString(String alsString) {
		StringTokenizer tok = new StringTokenizer(alsString, ":");
		String hh = tok.nextToken();
		String mm = tok.nextToken();
		this.stunden = Integer.parseInt(hh);
		this.minuten = Integer.parseInt(mm);
	}

	/**
	 *Die Zeit wird hier durch die Methode <code>toString</code> 
	 *wiederum in ein String umgewandelt und als String wieder ausgegeben
	 */
	public String toString() {
		if (alsString == null) {
			StringBuffer buf = new StringBuffer();
			buf.append(stunden);
			buf.append(':');
			if (minuten < 10) {
				buf.append('0');
			}
			buf.append(minuten);
			alsString = buf.toString();
		}
		return alsString;
	}
}
