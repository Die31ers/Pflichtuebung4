package hsma.uib.ss14.tpe08.p4.a1;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * 
 */
public class Film {
	private String titel;
	private double laufzeit;
	private FilmFreigabe altersFreigabe;

	public Film(String titel, double laufzeit, FilmFreigabe altersFreigabe) {
		this.titel = titel;
		this.laufzeit = laufzeit;
		this.altersFreigabe = altersFreigabe;
	}

	List<Film> FilmList = new ArrayList<Film>();


	class sortName {
		
	}

	class sortAltersFreigabe {

	}

	class sortLaufzeit {

	}
}
