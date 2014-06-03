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
		Film m1 = new Film("Barbie - Die Prinzessinnen-Akademie", 81, FilmFreigabe.FSK0);
		Film m2 = new Film("Ice Age 3", 90, FilmFreigabe.FSK0);
		Film m3 = new Film("Machete", 100, FilmFreigabe.FSK18);

		
		System.out.println(m2);
		
		HashMap<Film, Saal> map = new HashMap<Film, Saal>();
		map.put(m, s1);
		map.put(m1, s2);
		map.put(m2, s3);
		map.put(m3, s4);

		
		for (Film mm : map.keySet()) {
			System.out.println(map.get(mm).toString());
		}
		
		HashMap<Saal, Film> map2 = new HashMap<Saal, Film>();
		map2.put(s1, m);
		map2.put(s2, m1);
		map2.put(s3, m2);
		map2.put(s4, m3);
		for (Saal mm : map2.keySet()) {
			System.out.println(map2.get(mm).toString());
		}
	}
		
		
		
		
		
	

}
