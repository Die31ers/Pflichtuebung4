package hsma.uib.ss14.tpe08.p4.a1;

import java.util.StringTokenizer;

/**
 * Die Klasse Zeit, die die Zeit regelt.
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
	 * Der Konstruktor der Klasse Zeit.
	 * 
	 * @param zeit
	 */
	public Zeit(String zeit) {
		fromString(zeit);
	}

	public int getStunden() {
		return stunden;
	}

	public int getMinuten() {
		return minuten;
	}

	/**
	 * Parst aus einem String(Zeichenkette) die int Werte heraus und speichert
	 * diese Zahlen intern.
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
	 * Die überschriebene <code>toString()</code> Methode, die die Uhrzeiten
	 * anpasst. Durch den StringBuffer kann man "die 0 ranhängen", also dass
	 * z.B. bei HH = 14, MM = 9 => 14.09.
	 */
	@Override
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
