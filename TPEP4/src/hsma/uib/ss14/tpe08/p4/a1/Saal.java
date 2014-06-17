package hsma.uib.ss14.tpe08.p4.a1;

import java.util.HashMap;

/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * 
 */
public class Saal extends HashMap<Saal, String>{
	private String name;
	private int anzahlSitze;

	public Saal(String name, int anzahlSitze) {
		this.name = name;
		this.anzahlSitze = anzahlSitze;
	}

	public HashMap<Saal, String> getSaal(){
		return this.getSaal();
	}
	public String getName() {
		return this.name;

	}

	public int getAnzahlSitze() {
		return this.anzahlSitze;
	}
	
	public String toString(){
		return "Saal " + "'"+ name + "'" + "(" + anzahlSitze +" Plaetze" +  ")";
	}
}
