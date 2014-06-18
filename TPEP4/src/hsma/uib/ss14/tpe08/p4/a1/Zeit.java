package hsma.uib.ss14.tpe08.p4.a1;

import java.util.StringTokenizer;

/**
 * Die Klasse Zeit, die die Zeit regelt. Da die mitgegebenen Klassen aus Java.
 * Die Zeit soll als String angegeben werden bzw mit parse machbar sein können.
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
	 * Konstruktor der Klasse Zeit
	 * 
	 * @param zeit
	 */
	public Zeit(String zeit) {
		fromString(zeit);
	}

	/**
	 * In dieser Methode wird die, laut dem Text vorgegebene Methode,
	 * <code>parse</code> genutzt.
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
	 * Die <code>toString()</code> - Methode, die die Uhrzeiten anpasst. Durch
	 * den StringBUffer kann man "die 0 ranhängen", also das z.B. bei 14.09 <-
	 * wird.
	 * 
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
