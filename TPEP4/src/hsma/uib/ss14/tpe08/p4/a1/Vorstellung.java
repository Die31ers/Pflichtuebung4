package hsma.uib.ss14.tpe08.p4.a1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Diese Klasse modelliert eine Vorstellung. Diese umfasst: - den Kinosaal, in
 * dem die Vorstellung l�uft - den Film, welcher in der Vorstellung gezeigt wird
 * - eine Anfangszeit
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 */
public class Vorstellung extends HashMap<Saal, Film> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Saal saal;
	private Film film;
	private Zeit zeit;

	public Vorstellung(Saal saal, Film film, Zeit zeit) {
		this.saal = saal;
		this.film = film;
		this.zeit = zeit;
	}

	public Saal getSaal() {
		return saal;
	}

	public Film getFilm() {
		return film;
	}

	public Zeit getZeit() {
		return zeit;
	}


}
