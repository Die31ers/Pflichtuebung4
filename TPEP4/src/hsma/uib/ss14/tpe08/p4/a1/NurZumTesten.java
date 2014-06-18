package hsma.uib.ss14.tpe08.p4.a1;

import hsma.uib.ss14.tpe08.p4.a1.Film.Sort;

import java.util.List;

public class NurZumTesten {

	public static void ausgabe(List<Filmvorfuehrung> tmp) {
		for (int i = 0; i < tmp.size(); i++) {
			System.out.println(tmp.get(i));
		}
	}

	public static void main(String[] args) {

		Saal s1 = new Saal("Blauer Saal", 250);
		Saal s2 = new Saal("Grüner Saal", 200);
		Saal s3 = new Saal("Studio", 150);
		Saal s4 = new Saal("Kellerloch", 30);

		Kino cinmax = new Kino("Cinemaxx", "Mannheim", s1, s2, s3, s4);
		System.out.println(cinmax);

		Film m = new Film("Batman Begins", 134, FilmFreigabe.FSK12);
		Film m1 = new Film("Barbie - Die Prinzessinnen-Akademie", 81,
				FilmFreigabe.FSK0);
		Film m2 = new Film("Ice Age 3", 90, FilmFreigabe.FSK0);
		Film m3 = new Film("Machete", 100, FilmFreigabe.FSK18);

		Film m4 = new Film("Pulp Fiction", 148, FilmFreigabe.FSK16);

		Zeit z1 = new Zeit("14:00");
		Zeit z2 = new Zeit("17:00");

		System.out.println();
		cinmax.addFilmvorfuehrung(m, z1, s1);
		cinmax.addFilmvorfuehrung(m, z1, s1); // doppelt, wird auch ausgegeben,
												// sollte aber vermieden werden
		cinmax.addFilmvorfuehrung(m, z2, s1);
		cinmax.addFilmvorfuehrung(m1, z1, s2);
		cinmax.addFilmvorfuehrung(m1, z1, s3);
		cinmax.addFilmvorfuehrung(m2, z1, s3);
		cinmax.addFilmvorfuehrung(m3, z1, s3);
		cinmax.addFilmvorfuehrung(m4, z1, s4);
		List<Filmvorfuehrung> tmp = cinmax.getAlleFilmeMitZeiten();
		System.out.println();
		System.out.println("Sortiere nach Namen:");
		ausgabe(cinmax.sortiereListe(Sort.BYNAME));
		System.out.println();
		System.out.println("Sortiere nach FSK:");
		ausgabe(cinmax.sortiereListe(Sort.BYFSK));
		System.out.println();
		System.out.println("Sortiere nach Laufzeit:");
		ausgabe(cinmax.sortiereListe(Sort.BYLAUFZEIT));
		System.out.println();
		System.out.println("Alle Filme mit Zeiten");
		ausgabe(tmp);
		System.out.println();
		//List<Filmvorfuehrung> tmp2 = cinmax.getFilmeFuerSaalMitZeiten(s1);
		System.out.println("Für Saal mit Zeiten");
		//ausgabe(tmp2);
		System.out.println(cinmax.getFilmeFuerSaalMitZeiten(s1));
		System.out.println();
		//System.out.println(cinmax.getAlleFilme().toString());
	}
}
