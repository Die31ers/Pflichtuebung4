package hsma.uib.ss14.tpe08.p4.a1;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Die Klasse Filmvorfuehrung. Die Klasse kennt die Namen und die Zeit des
 * jeweiligen Filmes.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 */
public class Filmvorfuehrung {

	Film film;
	Zeit zeit;

	/**
	 * Der Konstruktor der Klasse Filmvorfuehrung
	 * 
	 * @param film
	 * @param zeit
	 */
	public Filmvorfuehrung(Film film, Zeit zeit) {
		this.film = film;
		this.zeit = zeit;
	}

	/**
	 * Sortiert die Filmvorführungen nach Zeiten.
	 * @param list
	 */
	public static void sortiere(List<Filmvorfuehrung> list) {
		Collections.sort(list, new sortStartzeit());
	}
	
	/**
	 * Die statische innere Klasse <code>sortStartzeit</code> die das Interface
	 * <code>Comparator</code> implementiert.
	 * 
	 */
	static class sortStartzeit implements Comparator<Filmvorfuehrung> {
		@Override
		public int compare(Filmvorfuehrung o1, Filmvorfuehrung o2) {
			if (o1.zeit.toString().equals(o2.zeit.toString())) {
				return 0;
			} else if (o1.zeit.getStunden() > o2.zeit.getStunden()) {
				return 1;
			} else {
				return -1;
			}
		}
		/*
		@Override
		
		public int compare(Filmvorfuehrung o1, Filmvorfuehrung o2) {
			if (o1.zeit.toString().equals(o2.zeit.toString())) {
				return 0;
			} else if (o1.zeit.getStunden() > o2.zeit.getStunden()) {
				if(o1.zeit.getStunden() == o2.zeit.getStunden()){
					if (o1.zeit.getMinuten() > o2.zeit.getMinuten()){
						return -1;
					}
					else{
						return 1;
					}
				}
				return -1;
			} else {
				return 1;
			}
		}
		*/
	}

	/**
	 * Die überschriebene <code>hashCode()</code> - Methode
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((film == null) ? 0 : film.hashCode());
		result = prime * result + ((zeit == null) ? 0 : zeit.hashCode());
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
		Filmvorfuehrung other = (Filmvorfuehrung) obj;
		if (film == null) {
			if (other.film != null)
				return false;
		} else if (!film.equals(other.film))
			return false;
		if (zeit == null) {
			if (other.zeit != null)
				return false;
		} else if (!zeit.equals(other.zeit))
			return false;
		return true;
	}

	/**
	 * Die überschriebene <code>toString()</code> Methode.
	 */
	@Override
	public String toString() {
		return zeit.toString() + " -- " + film.toString();
	}

}
