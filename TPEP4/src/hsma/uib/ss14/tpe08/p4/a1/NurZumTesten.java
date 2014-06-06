package hsma.uib.ss14.tpe08.p4.a1;

import java.util.HashMap;

public class NurZumTesten {

	public static void main(String[] args) {

		Saal s1 = new Saal("Blauer Saal", 250);
		Saal s2 = new Saal("Grüner Saal", 200);
		Saal s3 = new Saal("Studio", 150);
		Saal s4 = new Saal("Kellerloch", 30);

		Kino cinmax = new Kino("Cinemaxx", "Mannheim", s2);
		System.out.println(cinmax);

		Film m = new Film("Batman Begins", 134, FilmFreigabe.FSK12);
		Film m1 = new Film("Barbie - Die Prinzessinnen-Akademie", 81,
				FilmFreigabe.FSK0);
		Film m2 = new Film("Ice Age 3", 90, FilmFreigabe.FSK0);
		Film m3 = new Film("Machete", 100, FilmFreigabe.FSK18);

		Zeit z1 = new Zeit(14, 22);

		Vorstellung vors = new Vorstellung(s1, m, z1);
		vors.put(s1, m);
		vors.put(s1, m2); //????

		for (Saal mm : vors.keySet()) {
			System.out.println(vors);
		}
	}

}
