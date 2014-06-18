package hsma.uib.ss14.tpe08.p4.a1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Filme sollen nach allen drei Attributen 
 * (Name bzw. Titel, Altersfreigabe, Laufzeit) sortiert werden können
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
	 * Konstruktor <code>Film</code> mit folgenden Parametern
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
	 * Die Methode <code>getTitel()</code> liefert uns den Namen bzw. Titel
	 * des Films zurück
	 * @return
	 */
	public String getTitel() {
		return titel;
	}

	/**
	 * Die Methode <code>getLaufzeit()</code> liefert uns die Laufzeit
	 * des Films zurück
	 * @return
	 */
	public double getLaufzeit() {
		return laufzeit;
	}

	/**
	 * Die Methode <code>getFilmFreigabe()</code> liefert uns die Altersfreigabe
	 * des Films zurück
	 * @return
	 */
	public FilmFreigabe getFilmFreigabe() {
		return altersFreigabe;
	}

	/**
	 * Die Methode <code>toString()</code> wandelt den Titel, die Altersfreigabe
	 * und die Laufzeit des Films als String zurück
	 * @return
	 */
	public String toString() {
		return titel + " " + "[" + altersFreigabe + "] " + laufzeit + " min";
	}


	/**
	 * Die Methode <code>hashcode()</code> wird für unsere
	 * Klasse neu definiert bzw. überschrieben
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
	 * Ebenfalls wird natürlich die Methode <code>equals(Object obj)</code>
	 * überschrieben
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
	 * 
	 * Es wird eine statische enumeration Sort erstellt, welches die
	 * Variablen BYNAME, BYLAUFZEIT, BYFSK hat, die für das Sortierkriterium
	 * stehen
	 *
	 */
	static enum Sort {
		BYNAME, BYLAUFZEIT, BYFSK
	}

	/**
	 * Je nachdem welches Sortierkriterium ausgewählt worden ist, switchen wir
	 * in den case und rufen dort die Sortiermethode auf und
	 * falls keine Sortierkriterium ausgwählt worden ist, wird die natürliche Sortierreihenfolge
	 * von Filmen aufgerufen, die nach dem Namen bzw. Titel sortiert
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
	 * 
	 * Die statisch geschachtelte Klasse <code>sortName</code> implementiert die 
	 * vordefinierte Klasse <code>Comparator</code>, die nach
	 * dem Namen des Films sortiert
	 *
	 */
	static class sortName implements Comparator<Filmvorfuehrung> {
		@Override
		public int compare(Filmvorfuehrung o1, Filmvorfuehrung o2) {
			return o1.film.titel.compareTo(o2.film.titel);
		}
	}

	/**
	 * 
	 * Die statisch geschachtelte Klasse <code>sortAltersFreigabe</code>
	 * implementiert die vordefinierte Klasse <code>Comparator</code>, die nach
	 * dem AlterFreigabe Kriterium des Films sortiert
	 * 
	 */
	static class sortAltersFreigabe implements Comparator<Filmvorfuehrung> {
		@Override
		public int compare(Filmvorfuehrung o1, Filmvorfuehrung o2) {
			return o1.film.getFilmFreigabe().compareTo(o2.film.getFilmFreigabe());
		}
	}

	/**
	 * 
	 * Die statisch geschachtelte Klasse <code>sortLaufzeit</code>
	 * implementiert ebenfalls die vordefinierte Klasse <code>Comparator</code>, 
	 * die nach dem Laufzeit Kriterium des Films sortiert
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