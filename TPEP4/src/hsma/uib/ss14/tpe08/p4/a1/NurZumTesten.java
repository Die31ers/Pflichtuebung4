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
		
		Film m = new Film("Batman Begins", 134, FilmFreigabe.FSK12);
		Film m1 = new Film("Barbie - Die Prinzessinnen-Akademie", 81,
				FilmFreigabe.FSK0);
		Film m2 = new Film("Ice Age 3", 90, FilmFreigabe.FSK0);
		Film m3 = new Film("Machete", 100, FilmFreigabe.FSK18);
		Film m4 = new Film("Pulp Fiction", 148, FilmFreigabe.FSK16);
		Film m5 = new Film("Chocolat", 121, FilmFreigabe.FSK6);
		Film m6 = new Film("Trainspotting", 89, FilmFreigabe.FSK18);
		Film m7 = new Film("From Dusk till Dawn", 87, FilmFreigabe.FSK16);

		Zeit z1 = new Zeit("14:00");
		Zeit z2 = new Zeit("15:00");
		Zeit z3 = new Zeit("17:00");
		Zeit z4 = new Zeit("19:00");
		Zeit z5 = new Zeit("20:00");
		Zeit z6 = new Zeit("21:00");
		Zeit z7 = new Zeit("23:00");
		
		System.out.println();
		cinmax.addFilmvorfuehrung(m, z1, s1);
		cinmax.addFilmvorfuehrung(m, z3, s1);
		cinmax.addFilmvorfuehrung(m, z5, s1);
		cinmax.addFilmvorfuehrung(m, z7, s1);
		
		cinmax.addFilmvorfuehrung(m1, z2, s2);
		cinmax.addFilmvorfuehrung(m2, z3, s2);
		cinmax.addFilmvorfuehrung(m2, z4, s2);
		cinmax.addFilmvorfuehrung(m3, z6, s2);
		
		cinmax.addFilmvorfuehrung(m2, z2, s3);
		cinmax.addFilmvorfuehrung(m6, z3, s3);
		cinmax.addFilmvorfuehrung(m4, z5, s3);
		cinmax.addFilmvorfuehrung(m7, z7, s3);
		
		cinmax.addFilmvorfuehrung(m5, z5, s4);
		cinmax.addFilmvorfuehrung(m6, z7, s4);
		
		System.out.println(cinmax);
		/*
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
		*/
	}
}
