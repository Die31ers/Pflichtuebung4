package hsma.uib.ss14.tpe08.p4.a1;

import java.util.HashMap;

/**
 * Diese Klasse modelliert eine Vorstellung. Diese umfasst: - den Kinosaal, in
 * dem die Vorstellung l�uft - den Film, welcher in der Vorstellung gezeigt wird
 * - eine Anfangszeit
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 */
public class Vorstellung extends HashMap<Zeit, Film> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Film film;
	private Zeit zeit;

	public Vorstellung(Zeit zeit, Film film) {

		this.film = film;
		this.zeit = zeit;
	}

	public Film getFilm() {
		return film;
	}

	public Zeit getZeit() {
		return zeit;
	}
	
	public String toString(){
		return zeit.toString() + " "+ film.toString();
	}

}
