package hsma.uib.ss14.tpe08.p4.a1;

import java.util.ArrayList;
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
	private static String titel;
	private double laufzeit;
	private FilmFreigabe altersFreigabe;

	public Film(String titel, double laufzeit, FilmFreigabe altersFreigabe) {
		this.titel = titel;
		this.laufzeit = laufzeit;
		this.altersFreigabe = altersFreigabe;
	}

	public static String getTitel() {
		return titel;
	}

	public double getLaufzeit() {
		return laufzeit;
	}

	public FilmFreigabe getFilmFreigabe() {
		return altersFreigabe;
	}

	List<Film> FilmList = new ArrayList<Film>();

	static class sortName implements Comparable<Film> {

		@Override
		public int compareTo(Film b) {
			if (b.getTitel() == null && getTitel() == null) {
				return 0;
			}
			if (getTitel() == null) {
				return 1;
			}
			if (b.getTitel() == null) {
				return -1;
			}
			return getTitel().compareTo(b.getTitel());

		}
	}

	static class sortAltersFreigabe implements Comparator<Film> {

		@Override
		public int compare(Film o1, Film o2) {
			// TODO Auto-generated method stub
			return 0;
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