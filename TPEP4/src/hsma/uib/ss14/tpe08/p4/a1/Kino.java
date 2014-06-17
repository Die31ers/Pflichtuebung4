package hsma.uib.ss14.tpe08.p4.a1;

import hsma.uib.ss14.tpe08.p4.a1.Film.Sort;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
		try {
			list.add(tmp);
			map.put(s, list);
		} catch (IllegalTimeException ex) {
			System.out.println("Warnung: Du huso arbeite gescheit!");

		}
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

	public List<Filmvorfuehrung> sortiereListe(Sort sort) {
		List<Filmvorfuehrung> liste = getAlleFilmeMitZeiten();
		Film.sortiere(liste, sort);
		return liste;
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

	public List<Filmvorfuehrung> getFilmeFuerSaalMitZeiten(Saal saal) {
		return map.get(saal);
	}

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
		return name + " in " + stadt + " " + getAlleFilme(); // + kinoprogramm
	}
	
	public static void ausgabe(List<Filmvorfuehrung> tmp) {
		for (int i = 0; i < tmp.size(); i++) {
			System.out.println(tmp.get(i));
		}
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
