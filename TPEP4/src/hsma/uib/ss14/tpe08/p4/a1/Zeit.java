package hsma.uib.ss14.tpe08.p4.a1;

import java.util.StringTokenizer;

/**
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

	public Zeit(String zeit) {
		fromString(zeit);
	}

	public void fromString(String alsString) {
		StringTokenizer tok = new StringTokenizer(alsString, ":");
		String hh = tok.nextToken();
		String mm = tok.nextToken();
		this.stunden = Integer.parseInt(hh);
		this.minuten = Integer.parseInt(mm);
	}

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
