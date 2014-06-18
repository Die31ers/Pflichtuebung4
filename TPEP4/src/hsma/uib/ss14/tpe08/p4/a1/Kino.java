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
 * 
 * Unser Programm hat eine beliebige Anzahl von Kinos
 * Diese haben alle einen Namen und liegen in einer Stadt
 * Die Kinos haben ein oder mehrere Säle
 * Außerdem implementiert unsere Klasse <code>Kino</code> 
 * die generische KLasse <code>Iterator</code> mit dem 
 * generischen Typ <code>Filmvorfuehrung</code>
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
	 * Wie schon oben erwähnt kann unsere Klasse <code>Kino</code>
	 * einen Namen einen Ort bzw. eine Stadt und einen Saal oder ... mehrere Säle haben
	 * Dies realisieren wir mit einem Konstruktor dem wir diese Eigenschaften als Parameter übergeben
	 * Mit der foreach-schleife können wir erzeugte Objekte der Klasse verwenden und
	 * über das Gesamte Programm iterieren
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
	 * Mit der Methode <code>addFilmvorfuehrung(Film f, Zeit t, Saal s)</code> 
	 * übergeben wir die Filme, die Startzeiten und Säle die hingefügt werden müssen
	 * Falls die Filme die selbe Startzeit haben soll ein 
	 * Exception geworfen werden <code>IllegalTimeException</code>, sonst
	 * übergeben wir sie der Liste
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
						+ " VorfÃ¼hrung zur selben Startzeit nicht mÃ¶glich");
			} else {
				list.add(tmp);
				map.put(s, list);
			}
		} catch (IllegalTimeException ex) {
			System.out.println(ex.getMessage());
		}
	}
	/**
	 * Mit der Methode <code>addSaal(Saal saal)</code>
	 * fügen wir einen Saal hinzu die wiederum in eine ArrayList gespeichert wird
	 * @param saal
	 */
	private void addSaal(Saal saal) {
		map.put(saal, new ArrayList<Filmvorfuehrung>());
	}
	
	/**
	 * Die Methode <code>getName()</code> 
	 * erhalten wir den Namen als String zurück
	 * @return
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Die Methode <code>getStadt()</code> 
	 * erhalten wir die Stadt als String zurück
	 * @return
	 */
	public String getStadt() {
		return this.stadt;
	}

	/** Hier werden die ganzen Filme in eine Liste
	 * sortiert und anschließend wieder ausgegeben
	 * Die filme sind alle nach der Anfangszeit sortiert, auch bei doppelten Filmen,
	 * falls sie unterschiedliche Start bzw. Anfangszeiten haben
	 *  
	 * @param sort
	 * @return liste
	 */
	public List<Filmvorfuehrung> sortiereListe(Sort sort) {
		List<Filmvorfuehrung> liste = getAlleFilmeMitZeiten();
		Film.sortiere(liste, sort);
		return liste;
	}
	/**
	 * Die Methode <code>getAlleFilmeMitZeiten</code> liefert und  
	 * alle Filme mit den Anfangszeiten, auch bei Doppelte Filme mit 
	 * unterschiedliche Anfangszeiten
	 * Die Anfangszeiten werden alle in eine ArrayList gespeichert
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
	 * Hier werden alle Filme aus einem bestimmten Saal 
	 * mit den entsprechenden Anfangszeiten ausgegeben  
	 * @param saal
	 * @return
	 */
	public List<Filmvorfuehrung> getFilmeFuerSaalMitZeiten(Saal saal) {
		return this.map.get(saal);
	}

	/**
	 * Hier werden alle Filme ausgegeben, die im Kino laufen
	 * Hierbei achten darauf das der Film nur einmal auftauchen sollte und 
	 * nicht zweimal ausgegeben werden soll
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
	 *Hier überschreiben wir die <code>toString()</code> Methode
	 * für die Augabe später auf der Konsole
	 */
	@Override
	public String toString() {
		return name + " in " + stadt + " " + "\n" + ausgabeKinoprogramm();
	}

	/**
	 * Durch die Methode <code>ausgabeKinoprogramm()</code>
	 * geben wir den ganzen Programm aus der im Kino läuft
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
	 * Die Filme werden in diese Methode ausgegeben
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
	/**
	 * Die Methode <code>hasNext()</code> wird 
	 * überschrieben
	 */
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Die Methode <code>next()</code> wird 
	 * überschrieben
	 */
	@Override
	public Filmvorfuehrung next() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Die Methode <code>remove()</code> wird 
	 * überschrieben
	 */
	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

}
