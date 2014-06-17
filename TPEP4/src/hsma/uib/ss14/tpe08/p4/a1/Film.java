package hsma.uib.ss14.tpe08.p4.a1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
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

	public Film(String titel, double laufzeit, FilmFreigabe altersFreigabe) {
		this.titel = titel;
		this.laufzeit = laufzeit;
		this.altersFreigabe = altersFreigabe;
	}

	public String getTitel() {
		return titel;
	}

	public double getLaufzeit() {
		return laufzeit;
	}

	public FilmFreigabe getFilmFreigabe() {
		return altersFreigabe;
	}

	public String toString() {
		return titel + " " + "[" + altersFreigabe + "] " + laufzeit + " min";
	}



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



	static enum Sort {
		BYNAME, BYLAUFZEIT, BYFSK
	}

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

	static class sortName implements Comparator<Filmvorfuehrung> {
		@Override
		public int compare(Filmvorfuehrung o1, Filmvorfuehrung o2) {
			return o1.film.titel.compareTo(o2.film.titel);
		}
	}

	static class sortAltersFreigabe implements Comparator<Filmvorfuehrung> {
		@Override
		public int compare(Filmvorfuehrung o1, Filmvorfuehrung o2) {
			return o1.film.getFilmFreigabe().compareTo(o2.film.getFilmFreigabe());
		}
	}

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