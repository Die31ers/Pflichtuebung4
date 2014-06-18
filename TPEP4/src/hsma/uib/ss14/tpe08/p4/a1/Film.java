package hsma.uib.ss14.tpe08.p4.a1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
public class Film {
	private String titel;
	private double laufzeit;
	private FilmFreigabe altersFreigabe;

	/**
	 * Der Konstruktor der Klasse Film.
	 * 
	 * @param titel
	 * @param laufzeit
	 * @param altersFreigabe
	 */
	public Film(String titel, double laufzeit, FilmFreigabe altersFreigabe) {
		this.titel = titel;
		this.laufzeit = laufzeit;
		this.altersFreigabe = altersFreigabe;
	}

	/**
	 * Gibt den Titel des Filmes zurück
	 * 
	 * @return
	 */

	public String getTitel() {
		return titel;
	}

	/**
	 * Gibt die Laufzeit zurück
	 * 
	 * @return
	 */
	public double getLaufzeit() {
		return laufzeit;
	}

	/**
	 * Gibt die Filmfreigabe zurück
	 * 
	 * @return
	 */
	public FilmFreigabe getFilmFreigabe() {
		return altersFreigabe;
	}

	/**
	 * Ausgaberegelung der Klasse Film
	 */
	public String toString() {
		return titel + " " + "[" + altersFreigabe + "] " + laufzeit + " min";
	}

	/**
	 * Die überschriebene <code>hashCode()</code> - Methode
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((altersFreigabe == null) ? 0 : altersFreigabe.hashCode());
		long temp;
		temp = Double.doubleToLongBits(laufzeit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((titel == null) ? 0 : titel.hashCode());
		return result;
	}

	/**
	 * Die überschriebene <code>equals()</code> Methode.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		if (altersFreigabe != other.altersFreigabe)
			return false;
		if (Double.doubleToLongBits(laufzeit) != Double
				.doubleToLongBits(other.laufzeit))
			return false;
		if (titel == null) {
			if (other.titel != null)
				return false;
		} else if (!titel.equals(other.titel))
			return false;
		return true;
	}

	/**
	 * Die statische innere enum Klasse <code>Sort</code>.
	 */
	static enum Sort {
		BYNAME, BYLAUFZEIT, BYFSK
	}

	/**
	 * Die Methode <code>sortiere(List<Filmvorfuehrung> list, Sort sort)</code>,
	 * welches die switch-case Funktion hat, um die Listse nach dem ausgewählten
	 * Sortierkriterium zu sortieren
	 * 
	 * @param list
	 * @param sort
	 */
	public static void sortiere(List<Filmvorfuehrung> list, Sort sort) {
		switch (sort) {
		case BYNAME:
			Collections.sort(list, new sortName());
			break;
		case BYLAUFZEIT:
			Collections.sort(list, new sortLaufzeit());
			break;
		case BYFSK:
			Collections.sort(list, new sortAltersFreigabe());
			break;
		default:
			Collections.sort(list, new sortName());
			break;
		}
	}

	/**
	 * Die statische innere Klasse <code>sortName</code> die das Interface
	 * <code>Comparator</code> implementiert.
	 * 
	 */
	static class sortName implements Comparator<Filmvorfuehrung> {
		@Override
		public int compare(Filmvorfuehrung o1, Filmvorfuehrung o2) {
			return o1.film.titel.compareTo(o2.film.titel);
		}
	}

	/**
	 * Die statische innere Klasse <code>sortAltersFreigabe</code> die das
	 * Interface <code>Comparator</code> implementiert.
	 * 
	 */
	static class sortAltersFreigabe implements Comparator<Filmvorfuehrung> {
		@Override
		public int compare(Filmvorfuehrung o1, Filmvorfuehrung o2) {
			return o1.film.getFilmFreigabe().compareTo(
					o2.film.getFilmFreigabe());
		}
	}

	/**
	 * Die statische Klasse <code>sortLaufzeit</code> die
	 * <code>Comparator</code> implementiert.
	 * 
	 */

	static class sortLaufzeit implements Comparator<Filmvorfuehrung> {
		@Override
		public int compare(Filmvorfuehrung o1, Filmvorfuehrung o2) {
			if (o1.film.getLaufzeit() == o2.film.getLaufzeit()) {
				return 0;
			} else if (o1.film.getLaufzeit() > o2.film.getLaufzeit()) {
				return -1;
			} else {
				return 1;
			}
		}
	}
}