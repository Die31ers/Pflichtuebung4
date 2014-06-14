package hsma.uib.ss14.tpe08.p4.a1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import hsma.uib.ss14.tpe08.p4.a1.Film.Sort;

public class NurZumTesten {

	public static void ausgabe(ArrayList<Film> lischt) {
		for (int i = 0; i < lischt.size(); i++) {
			System.out.println(lischt.get(i));
		}
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Saal s1 = new Saal("Blauer Saal", 250);
		Saal s2 = new Saal("Grüner Saal", 200);
		Saal s3 = new Saal("Studio", 150);
		Saal s4 = new Saal("Kellerloch", 30);

		Kino cinmax = new Kino("Cinemaxx", "Mannheim", s2, s3);
		System.out.println(cinmax);

		Film m = new Film("Batman Begins", 134, FilmFreigabe.FSK12);
		Film m1 = new Film("Barbie - Die Prinzessinnen-Akademie", 81,
				FilmFreigabe.FSK0);
		Film m2 = new Film("Ice Age 3", 90, FilmFreigabe.FSK0);
		Film m3 = new Film("Machete", 100, FilmFreigabe.FSK18);

		Film m4 = new Film("Pulp Fiction", 148, FilmFreigabe.FSK16);

		Zeit z1 = new Zeit("14:9");
		Zeit z2 = new Zeit("17:0");

		ArrayList<Film> liste = new ArrayList<Film>();

		liste.add(m);
		liste.add(m3);
		liste.add(m2);
		liste.add(m1);
		liste.add(m4);

		System.out.println(liste);
		Film.sortiere(liste, Sort.BYFSK);
		System.out.println(liste);
		Film.sortiere(liste, Sort.BYLAUFZEIT);
		System.out.println(liste);
		Film.sortiere(liste, Sort.BYNAME);
		System.out.println(liste);

		System.out.println();
		cinmax.addFilmvorfuehrung(m, z1, s1);
		cinmax.addFilmvorfuehrung(m, z2, s1);
		cinmax.addFilmvorfuehrung(m2, z2, s1);
		cinmax.addFilmvorfuehrung(m1, z1, s2);
		cinmax.addFilmvorfuehrung(m3, z1, s4);

		List<Filmvorfuehrung> tmp = cinmax.getAlleFilmeMitZeiten();

		List<Filmvorfuehrung> tmp1 = cinmax.getFilmeFuerSaalMitZeiten(s1);

		System.out.println("\n" + tmp1);
	}
}
