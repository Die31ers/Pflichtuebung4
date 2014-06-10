package hsma.uib.ss14.tpe08.p4.a1;

import java.util.ArrayList;
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
	public boolean equals(Object o) {
		Film m = (Film) o;
		return m.titel.equals(this.titel) && m.laufzeit == this.laufzeit
				&& m.altersFreigabe == this.altersFreigabe;
	}

	@Override
	public int hashCode() {
		return (int) (titel.hashCode() + laufzeit);
	}

	static enum Sort {
		BYNAME, BYLAUFZEIT, BYFSK
	}

	public static void sortiere(ArrayList<Film> list, Sort sort) {
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

	static class sortName implements Comparator<Film> {
		@Override
		public int compare(Film o1, Film o2) {
			return o1.titel.compareTo(o2.titel);
		}
	}

	static class sortAltersFreigabe implements Comparator<Film> {
		@Override
		public int compare(Film o1, Film o2) {
			return o1.getFilmFreigabe().compareTo(o2.getFilmFreigabe());
		}
	}

	static class sortLaufzeit implements Comparator<Film> {
		@Override
		public int compare(Film o1, Film o2) {
			if (o1.getLaufzeit() == o2.getLaufzeit()) {
				return 0;
			} else if (o1.getLaufzeit() > o2.getLaufzeit()) {
				return -1;
			} else {
				return 1;
			}
		}
	}
}