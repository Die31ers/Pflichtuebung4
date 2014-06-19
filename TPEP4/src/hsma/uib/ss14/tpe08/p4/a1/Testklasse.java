package hsma.uib.ss14.tpe08.p4.a1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * 
 */
public class Testklasse {

	Saal s1 = new Saal("Blauer Saal", 250);
	Saal s2 = new Saal("Grüner Saal", 200);
	Saal s3 = new Saal("Studio", 150);
	Saal s4 = new Saal("Kellerloch", 30);

	Kino cinmax = new Kino("Cinemaxx", "Mannheim", s1, s2, s3, s4);

	Film m1 = new Film("Batman Begins", 134, FilmFreigabe.FSK12);
	Film m2 = new Film("Barbie - Die Prinzessinnen-Akademie", 81,
			FilmFreigabe.FSK0);
	Film m3 = new Film("Ice Age 3", 90, FilmFreigabe.FSK0);
	Film m4 = new Film("Machete", 100, FilmFreigabe.FSK18);
	Film m5 = new Film("Pulp Fiction", 148, FilmFreigabe.FSK16);
	Film m6 = new Film("Chocolat", 121, FilmFreigabe.FSK6);
	Film m7 = new Film("Trainspotting", 89, FilmFreigabe.FSK18);
	Film m8 = new Film("From Dusk till Dawn", 87, FilmFreigabe.FSK16);

	Zeit z1 = new Zeit("14:00");
	Zeit z2 = new Zeit("15:00");
	Zeit z3 = new Zeit("17:00");
	Zeit z4 = new Zeit("19:00");
	Zeit z5 = new Zeit("20:00");
	Zeit z6 = new Zeit("21:00");
	Zeit z7 = new Zeit("23:00");

	@Before
	public void initialize() {
		cinmax.addFilmvorfuehrung(m1, z1, s1);
		cinmax.addFilmvorfuehrung(m1, z3, s1);
		cinmax.addFilmvorfuehrung(m1, z5, s1);
		cinmax.addFilmvorfuehrung(m1, z7, s1);

		cinmax.addFilmvorfuehrung(m2, z2, s2);
		cinmax.addFilmvorfuehrung(m3, z3, s2);
		cinmax.addFilmvorfuehrung(m3, z4, s2);
		cinmax.addFilmvorfuehrung(m4, z6, s2);

		cinmax.addFilmvorfuehrung(m3, z2, s3);
		cinmax.addFilmvorfuehrung(m7, z3, s3);
		cinmax.addFilmvorfuehrung(m5, z5, s3);
		cinmax.addFilmvorfuehrung(m8, z7, s3);

		cinmax.addFilmvorfuehrung(m6, z5, s4);
		cinmax.addFilmvorfuehrung(m7, z7, s4);
	}

	@Test
	public void nameSaal1() {
		assertEquals("Blauer Saal", s1.getName());
	}

	@Test
	public void nameSaal2() {
		assertEquals("Grüner Saal", s2.getName());
	}

	@Test
	public void nameSaal3() {
		assertEquals("Studio", s3.getName());
	}

	@Test
	public void nameSaal4() {
		assertEquals("Kellerloch", s4.getName());
	}

	@Test
	public void nameFilm1() {
		assertEquals("Batman Begins", m1.getTitel());
	}

	@Test
	public void nameFilm2() {
		assertEquals("Barbie - Die Prinzessinnen-Akademie", m2.getTitel());
	}

	@Test
	public void nameFilm3() {
		assertEquals("Ice Age 3", m3.getTitel());
	}

	@Test
	public void nameFilm4() {
		assertEquals("Machete", m4.getTitel());
	}

	@Test
	public void laufzeitFilm1() {
		assertEquals(134, m1.getLaufzeit(), 0);
	}

	@Test
	public void laufzeitFilm2() {
		assertEquals(81, m2.getLaufzeit(), 0);
	}

	@Test
	public void laufzeitFilm3() {
		assertEquals(90, m3.getLaufzeit(), 0);
	}

	@Test
	public void laufzeitFilm4() {
		assertEquals(100, m4.getLaufzeit(), 0);
	}

	@Test
	public void fskFilm1() {
		assertEquals(FilmFreigabe.FSK12, m1.getFilmFreigabe());
	}

	@Test
	public void fskFilm2() {
		assertEquals(FilmFreigabe.FSK0, m2.getFilmFreigabe());
	}

	@Test
	public void fskFilm3() {
		assertEquals(FilmFreigabe.FSK0, m3.getFilmFreigabe());
	}

	@Test
	public void fskFilm4() {
		assertEquals(FilmFreigabe.FSK18, m4.getFilmFreigabe());
	}

	@Test
	public void testMap1() {
		assertEquals(true, cinmax.map.containsKey(s1));
	}

	@Test
	public void testMap2() {
		assertEquals(true, cinmax.map.containsKey(s2));
	}

	@Test
	public void testMap3() {
		assertEquals(true, cinmax.map.containsKey(s3));
	}

	@Test
	public void testMap4() {
		assertEquals(true, cinmax.map.containsKey(s4));
	}

	@Test
	public void testAusnahme() {
		try {
			cinmax.addFilmvorfuehrung(m1, z1, s1);
		} catch (IllegalTimeException ex) {
			assertTrue(true);
		}
	}
}
