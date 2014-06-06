package hsma.uib.ss14.tpe08.p4.a1;
import java.util.ArrayList;
import java.util.Collections;
/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * 
 */
public class Kino {
	private String name;
	private String stadt;
	private Saal saal;
	private ArrayList<Saal> saale;

	public Kino(String name, String stadt, Saal saal) {
		this.name = name;
		this.stadt = stadt;
		this.saal = saal;
	}
	
	public Kino(String name, String stadt, Saal... saaleee) { //1 oder mehrere
		this.name = name;
		this.stadt = stadt;
		Collections.addAll(this.saale, saaleee);
	}

	public String getName() {
		return this.name;
	}

	public String getStadt() {
		return this.stadt;
	}

	public Saal getSaal() {
		return this.saal;
	}
	
	public Film[] getAlleFilmeMitZeiten(Film[] array){
		
		return array;
	}
	
	public Film[] getFilmeFuerSaalMitZeiten(Film[] array){
		return array;
	}
	
	public Film[] getAlleFilme(Film[] array){
		
		return array;
	}
	
	@Override
	public String toString(){
		return name + " in " + stadt + " " + saale; //+ kinoprogramm
	}
}
