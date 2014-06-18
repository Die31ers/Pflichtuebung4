package hsma.uib.ss14.tpe08.p4.a1;

import java.util.HashMap;

/**
 * Diese Klasse modelliert eine Vorstellung. Diese umfasst: - den Kinosaal, in
 * dem die Vorstellung läuft - den Film, welcher in der Vorstellung gezeigt wird mit
 * - eine Anfangszeit
 * Außerdem erbt sie von der Klasse <code>Hashmap<Zeit, Filme></code> die 
 * Zeiten und die Filme
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

	/** 
	 * Konstruktor <code>Vorstellung</code> mit dem 
	 * verweis auf die Variablen der Klasse <code>Vorstellung</code>
	 * @param zeit
	 * @param film
	 */
	public Vorstellung(Zeit zeit, Film film) {

		this.film = film;
		this.zeit = zeit;
	}

	/**
	 * Die Methode <code>getFilme()</code> liefert uns die Filme zurück
	 * @return
	 */
	public Film getFilm() {
		return film;
	}

	/**
	 * Die Methode <code>getZeit()</code>
	 * liefert uns die Zeit zurück
	 * @return
	 */
	public Zeit getZeit() {
		return zeit;
	}
	
	/**
	 * Die Methode <code>toString</code> wandelt die <code>zeit</code> 
	 * und die <code>filme</code> in Strings um und gibt sie anschließend
	 * wieder aus
	 */
	public String toString(){
		return zeit.toString() + " "+ film.toString();
	}

}
