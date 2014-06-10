package hsma.uib.ss14.tpe08.p4.a1;
/*
public class Zeit {
	private String stunden;
	private String minuten;

	public Zeit(String stunden, String minuten) {
		this.stunden = stunden;
		this.minuten = minuten;
	}

	public String getStunden(){
		return this.stunden ;
	}
	
	public String getMinuten(){
		return this.minuten;
	}
	
	public String toString(){
		return null ;
	}
}
*/import java.util.StringTokenizer;

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

	public Zeit(int stunden, int minuten) {
		if (stunden < 24) {
			this.stunden = stunden;
		}
		if (minuten < 60) {
			this.minuten = minuten;
		}
	}

	public static Zeit fromString(String alsString) {

		StringTokenizer tok = new StringTokenizer(alsString, ":");

		String hh = tok.nextToken();
		String mm = tok.nextToken();

		int stunden = 0, minuten = 0;

	try {
			stunden = Integer.parseInt(hh);
			minuten = Integer.parseInt(mm);
		} catch (IllegalTimeException ex) {

		}

		return new Zeit(stunden, minuten);
	}

	public int getStunden() {
		return stunden;
	}

	public int getMinuten() {
		return minuten;
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