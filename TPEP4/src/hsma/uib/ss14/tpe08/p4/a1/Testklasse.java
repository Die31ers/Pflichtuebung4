package hsma.uib.ss14.tpe08.p4.a1;
import static org.junit.Assert.*;

import java.util.Map;

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
	Saal s2 = new Saal("Blauer Saal", 250);
	Saal s1 = new Saal("Grüner Saal", 200);
	Saal s3 = new Saal("Studio", 150);
	Saal s4 = new Saal("Kellerloch", 30);
	Kino cinmax = new Kino("Cinemaxx", "Mannheim", s2, s3);

	Film m = new Film("Batman Begins", 134, FilmFreigabe.FSK12);
	Film m1 = new Film("Barbie - Die Prinzessinnen-Akademie", 81,
			FilmFreigabe.FSK0);
	Film m2 = new Film("Ice Age 3", 90, FilmFreigabe.FSK0);
	Film m3 = new Film("Machete", 100, FilmFreigabe.FSK18);

	Film m4 = new Film("Pulp Fiction", 148, FilmFreigabe.FSK16);

	Zeit z1 = new Zeit("14:00");
	Zeit z2 = new Zeit("17:00");
	
	@Test
	public void testeNamen(){
		assertEquals("Studio", s3.getName());
		}

	@Test
	public void testeNamen1(){
		assertEquals("Kellerloch" , s4.getName());
	}
		
	@Test
	public void testeVorhanden(){
		assertEquals("Blauer Saal", cinmax.getAlleFilmeMitZeiten()); 
		}
}


