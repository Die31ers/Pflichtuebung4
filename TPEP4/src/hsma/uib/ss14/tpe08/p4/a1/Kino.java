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
 * Die ist die Klasse Kino.
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

	/**
	 * Konstruktor der Klasse Kino, um ein Objekt mit Name, Stadt und Saal
	 * festzulegen
	 * 
	 * @param name
	 * @param stadt
	 * @param saele
	 */
	public Kino(String name, String stadt, Saal... saele) { // 1 oder mehrere
		this.name = name;
		this.stadt = stadt;
		this.map = new LinkedHashMap<Saal, List<Filmvorfuehrung>>();

		for (Saal saal : saele) {
			addSaal(saal);
		}
	}

	/**
	 * Mit der Methode <code>addFilmvorfuehrung(Film f, Zeit t , Saal s</code>
	 * werden Filme, zu gegebenen Zeiten zu den passenden Sälen zugeordnet.
	 * 
	 * @param f
	 * @param t
	 * @param s
	 */

	public void addFilmvorfuehrung(Film f, Zeit t, Saal s) {
		Filmvorfuehrung tmp = new Filmvorfuehrung(f, t);
		List<Filmvorfuehrung> list = map.get(s);
		try {
			if (map.get(s).contains(tmp) ^ map.get(s).contains(t)) {
				throw new IllegalTimeException("Fehler bei " + tmp.toString()
						+ " Vorführung zur selben Startzeit nicht möglich");
			} else {
				list.add(tmp);
				map.put(s, list);
			}
		} catch (IllegalTimeException ex) {
			System.out.println(ex.getMessage());
		}
	}

	/**
	 * Die Methode <code>addSaal(Saal saal)</code> tut die Säle hinzufügen.
	 * 
	 * @param saal
	 */
	private void addSaal(Saal saal) {
		map.put(saal, new ArrayList<Filmvorfuehrung>());
	}

	/**
	 * Die Methode <code>getName()</code> gibt den Namen zurück
	 * 
	 * @return
	 */

	public String getName() {
		return this.name;
	}

	/**
	 * Die Methode <code>getStadt()</code> gibt die Stadt zurück
	 * 
	 * @return
	 */
	public String getStadt() {
		return this.stadt;
	}

	/**
	 * Die Methode <code>List<Filmvorfuehrung>sortierteListe(Sort sort)</code>
	 * bekommt ein Sortierkriterium, mitder es die Filme sortiert, je nach dem
	 * was angegeben wird (Startzeit, Altersbeschränkung etc.)
	 * 
	 * @param sort
	 * @return
	 */

	public List<Filmvorfuehrung> sortiereListe(Sort sort) {
		List<Filmvorfuehrung> liste = getAlleFilmeMitZeiten();
		Film.sortiere(liste, sort);
		return liste;
	}

	/**
	 * In der Methode <code>List<Filmvorfuehrung> getAlleFilmeMitZeiten()</code>
	 * werden alle Filme mit Zeiten gespeichert
	 * 
	 * @return
	 */

	public List<Filmvorfuehrung> getAlleFilmeMitZeiten() {
		List<Filmvorfuehrung> liste = new ArrayList<>();
		for (Map.Entry<Saal, List<Filmvorfuehrung>> entry : map.entrySet()) {
			for (Filmvorfuehrung filmvorfuehrung : entry.getValue()) {
				liste.add(filmvorfuehrung);
			}
		}
		return liste;
	}

	/**
	 * Die Methode <code> getFilmeFuerSaalMitZeiten(Saal saal)</code> werden
	 * Filme von genau einem Saal ausgegeben
	 * 
	 * @param saal
	 * @return
	 */
	public List<Filmvorfuehrung> getFilmeFuerSaalMitZeiten(Saal saal) {
		return this.map.get(saal);
	}

	/**
	 * Die Methode <code>Set<Film> getAlleFilme()</code> gibt alle Filme zurück
	 * die im Kino laufen.
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

	/**
	 * Ausgabe als String
	 */

	@Override
	public String toString() {
		return name + " in " + stadt + " " + "\n" + ausgabeKinoprogramm();
	}

	/**
	 * In dieser Methode wird die ganze Ausgabe angepasst.
	 * 
	 * @return
	 */
	public String ausgabeKinoprogramm() {
		String s = "";
		for (Saal sohalt : map.keySet()) {
			s += sohalt.toString() + "\n";
			s += ausgabeFilme(getFilmeFuerSaalMitZeiten(sohalt)) + "\n";
		}
		return s;
	}

	/**
	 * Mit dieser Methode werden Filme ausgegeben
	 * 
	 * @param tmp
	 * @return
	 */
	public String ausgabeFilme(List<Filmvorfuehrung> tmp) {
		String s = "";
		for (int i = 0; i < tmp.size(); i++) {
			s += tmp.get(i).toString() + "\n";
		}
		return s;
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
