package hsma.uib.ss14.tpe08.p4.a1;

import java.util.ArrayList;
import java.util.Collection;
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
	private Zeit anfangszeit;

	public Film(Zeit anfangszeit, String titel, FilmFreigabe altersFreigabe,
			double laufzeit) {
		this.anfangszeit = anfangszeit;
		this.titel = titel;
		this.altersFreigabe = altersFreigabe;
		this.laufzeit = laufzeit;

	}

	public String getTitel() {
		return titel;
	}

	public void getAlleFilmeMitZeiten(Film filme, Zeit anfangszeit) {
		ArrayList nase = new ArrayList();

		nase.addAll((Collection) filme);
		System.out.println(nase);
	}

	public void getAlleFilmeMitSaalMitZeit() {
		ArrayList pinguinflosse = new ArrayList();
	}

	public double getLaufzeit() {
		return laufzeit;
	}

	public FilmFreigabe getFilmFreigabe() {
		return altersFreigabe;
	}

	public String toString() {
		return anfangszeit + " --- " + titel + " " + "[" + altersFreigabe
				+ "] " + laufzeit + " min";
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

	public void sortiere(Sort sort) {
		switch (sort) {
		case BYNAME:
			new sortName();
		case BYLAUFZEIT:
			new sortAltersFreigabe();
		case BYFSK:
			new sortLaufzeit();
		}
	}

	static class sortName implements Comparator<Film> {

		@Override
		public int compare(Film a, Film b) {
			return a.getTitel().compareTo(b.getTitel());
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