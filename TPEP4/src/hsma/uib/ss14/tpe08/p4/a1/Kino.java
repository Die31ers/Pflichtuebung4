package hsma.uib.ss14.tpe08.p4.a1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * 
 */
public class Kino {
	private String kinoName;
	private String stadt;
	private Saal saal;
	private ArrayList<Saal> saale;
	private int aSaaele;

	public Kino(String name, String stadt, Saal saal) {
		this.kinoName = kinoName;
		this.stadt = stadt;
		this.saal = saal;
	}

	public Kino(String kinoName, String stadt, Saal... saaleee) {
		this.kinoName = kinoName;
		this.stadt = stadt;
		this.saale = saale;
	}

	public String getName() {
		return this.kinoName;
	}

	public String getStadt() {
		return this.stadt;
	}

	/**
	 * Muss noch Implementiert werden ! public void getFilmeFuerSaalMitZeiten(){
	 * 
	 * }
	 */

	/**
	 * Muss noch Implementiert werden ! private void getAlleFilmeMitZeiten(){
	 * 
	 * }
	 */

	/**
	 * Muss noch Implementiert werden ! public void getAlleFilme() { Angabe des
	 * Sortierkriteriums als Enumeration }
	 */

	public String toString() {
		return kinoName + " in " + stadt;

	}

}
