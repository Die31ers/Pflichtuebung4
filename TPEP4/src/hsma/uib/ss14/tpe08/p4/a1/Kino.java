package hsma.uib.ss14.tpe08.p4.a1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * 
 */
public class Kino implements Iterator<Filmvorfuehrung> {
	private String name;
	private String stadt;
	Map<Saal, List<Filmvorfuehrung>> map;

	public Kino(String name, String stadt, Saal... saele) { // 1 oder mehrere
		this.name = name;
		this.stadt = stadt;
		this.map = new LinkedHashMap<Saal, List<Filmvorfuehrung>>();

		for (Saal saal : saele) {
			addSaal(saal);
		}
	}

	public void addFilmvorfuehrung(Film f, Zeit t, Saal s) {
		Filmvorfuehrung tmp = new Filmvorfuehrung(f, t);
		List<Filmvorfuehrung> list = map.get(s);
		list.add(tmp);
		map.put(s, list);

	}

	private void addSaal(Saal saal) {
		map.put(saal, new ArrayList<Filmvorfuehrung>());
	}

	public String getName() {
		return this.name;
	}

	public String getStadt() {
		return this.stadt;
	}

	public List<Filmvorfuehrung> sortiereListe() {
		return null;
	}

	public List<Filmvorfuehrung> getAlleFilmeMitZeiten() {
		List<Filmvorfuehrung> liste = new ArrayList<>();

		for (Map.Entry<Saal, List<Filmvorfuehrung>> entry : map.entrySet()) {
			for (Filmvorfuehrung filmvorfuehrung : entry.getValue()) {
				liste.add(filmvorfuehrung);

			}
		}
		return liste;
	}

	public List<Filmvorfuehrung> getFilmeFuerSaalMitZeiten(Saal s) {
		List<Filmvorfuehrung> liste1 = new ArrayList<>();
		for (Map.Entry<Saal, List<Filmvorfuehrung>> entry : map.entrySet()) {

			for (Filmvorfuehrung film : entry.getValue()) {
				liste1.add(film);

			}

		}
		return liste1;
	}
	

	/**
	 * Die Methode <code>getAlleFilme()</code> gibt alle Filme zurück die im
	 * Kino laufen (keine Duplikate)
	 * 
	 * @return
	 */
	public Set<Film> getAlleFilme() {
		Set<Film> result = new HashSet<>();

		for (Map.Entry<Saal, List<Filmvorfuehrung>> entry : map.entrySet()) {

			for (Filmvorfuehrung filmvorfuehrung : entry.getValue()) {

				if (!result.contains(filmvorfuehrung.film)) {
					result.add(filmvorfuehrung.film);
				}
			}

		}
		return result;
	}

	@Override
	public String toString() {
		return name + " in " + stadt + " "; // + kinoprogramm
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Filmvorfuehrung next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

}
