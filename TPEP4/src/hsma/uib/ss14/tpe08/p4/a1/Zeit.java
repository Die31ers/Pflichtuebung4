package hsma.uib.ss14.tpe08.p4.a1;

import java.util.StringTokenizer;

/**
 * 
 * Die Klasse Zeit soll sich um die Zeit kümmern.
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
	 * Konstruktor für die Zeit, String eingabe
	 * 
	 * @param zeit
	 */
	public Zeit(String zeit) {
		fromString(zeit);
	}

	/**
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
	 * Die <code>toString()</code>Methode so angepasst, dass es bei Zeiten
	 * beidenen die 0 eine Rolle spielt, wie z.B. 14:09 <- die passende Ausgabe
	 * gibt
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
