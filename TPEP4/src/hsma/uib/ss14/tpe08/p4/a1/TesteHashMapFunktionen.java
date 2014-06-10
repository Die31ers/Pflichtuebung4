package hsma.uib.ss14.tpe08.p4.a1;

import java.util.Map;

/**
 * Nur zum testen ob das "put" funktioniert
 * 
 * @author Joshua Barsoum
 * @author Giang Pham
 * @author Hunar Mawlod
 * 
 */
public class TesteHashMapFunktionen {

	public static void main(String[] args) {
		Saal saal1 = new Saal("Blauer Saal", 250);
		Kino kino1 = new Kino("Cinemaxx", "Mannheim", saal1);
		Film batman = new Film(Zeit.fromString("14:00"), "Batman Begins",
				FilmFreigabe.FSK_16, 134);

		Saal saal2 = new Saal("Grüner Saal", 200);
		Film barbie = new Film(Zeit.fromString("15:00"),
				"Barbie - Die Prinzessinnen-Akademie", FilmFreigabe.FSK_0, 81);

		Saal saal3 = new Saal("Studio", 150);
		Film iceage = new Film(Zeit.fromString("15:00"), "Ice-Age 3",
				FilmFreigabe.FSK_0, 89);
		
		Saal saal4 = new Saal("Kellerloch", 150);
		Film chocolat = new Film(Zeit.fromString("20:00"),"Chocolat", FilmFreigabe.FSK_6, 121);
		

		System.out.printf("\n" + kino1 + "\n" + saal1 + "\n" + batman + "\n");
		System.out.printf("\n" + kino1 + "\n" + saal2 + "\n" + barbie + "\n");
		System.out.printf("\n" + kino1 + "\n" + saal3 + "\n" + iceage + "\n");
		System.out.printf("\n" + kino1 + "\n" + saal4 + "\n" + chocolat);

	}
}
