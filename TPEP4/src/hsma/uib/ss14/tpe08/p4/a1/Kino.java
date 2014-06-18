package hsma.uib.ss14.tpe08.p4.a1;

import hsma.uib.ss14.tpe08.p4.a1.Film.Sort;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Die Klasse Film. Jeder Film hat einen Titel, eine laufzeit und eine
 * Altersbeschränkung. In dieser Klasse wird der Film definiert.
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
	Map<Saal, List<Filmvorfuehrung>> map;

	/**
	 * Konstruktor der Klasse Kino um ein Objekt mit Name, Stadt und Saal
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
	 * 
	 */
	private void addSaal(Saal saal) {
		map.put(saal, new ArrayList<Filmvorfuehrung>());
	}

	/**
	 * Die Methode <code>getName()</code> gibt den Namen des Kinos zurück.
	 * 
	 * @return
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Die Methode <code>getStadt()</code> gibt die Stadt des Kinos zurück
	 * 
	 * @return
	 */
	public String getStadt() {
		return this.stadt;
	}

	/**
	 * Die Methode <code>List<Filmvorfuehrung>sortierteListe(Sort sort)</code>
	 * bekommt ein Sortierkriterium, mit der es die Filme sortiert, je nach dem
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
	 * @return liste Eine Liste der Filmvoführungen, also Filme und jeweilige
	 *         Startzeit
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
	 * Mit diese Methode werden die konkreten Filme vom jeweiligen Saal
	 * ausgegeben.
	 * 
	 * @param saal
	 * @return Eine Liste der Filmvorführungen vom jeweiligen Saal.
	 */
	public List<Filmvorfuehrung> getFilmeFuerSaalMitZeiten(Saal saal) {
		return this.map.get(saal);
	}

	/**
	 * Diese Methode gibt alle im Kino verfügbaren Filme zurück.
	 * 
	 * @return result Ein Menge von Kinofilmen
	 * 
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
	 * Die überschriebene <code>toString()</code> Methode.
	 */
	@Override
	public String toString() {
		return name + " in " + stadt + "\n" + ausgabeKinoprogramm();
	}

	/**
	 * Hängt Strings aneinander und gibt das Kinoprogramm als String aus. Diese
	 * Methode wird von <code>toString()</code> aufgerufen.
	 * 
	 * @return s String aus Saal und die jeweiligen Filmvorführungen
	 */
	private String ausgabeKinoprogramm() {
		String s = "";
		for (Saal saal : map.keySet()) {
			s += saal.toString() + "\n";
			s += ausgabeFilme(getFilmeFuerSaalMitZeiten(saal)) + "\n";
		}
		return s;
	}

	/**
	 * Hängt Strings aneinander aus einer Liste von Filmvorführungen und gibt
	 * einen String zurück.
	 * 
	 * @param tmp
	 *            die Liste
	 * @return s String aus Filmvorführungen
	 * 
	 */
	private String ausgabeFilme(List<Filmvorfuehrung> tmp) {
		String s = "";
		for (int i = 0; i < tmp.size(); i++) {
			s += tmp.get(i).toString() + "\n";
		}
		return s;
	}

}
