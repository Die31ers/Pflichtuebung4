package hsma.uib.ss14.tpe08.p4.a1;
import static org.junit.Assert.*;

import java.util.List;

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

	Film m = new Film("Batman Begins", 134, FilmFreigabe.FSK12);
	Film m1 = new Film("Barbie - Die Prinzessinnen-Akademie", 81,
			FilmFreigabe.FSK0);
	Film m2 = new Film("Ice Age 3", 90, FilmFreigabe.FSK0);
	Film m3 = new Film("Machete", 100, FilmFreigabe.FSK18);

	Film m4 = new Film("Pulp Fiction", 148, FilmFreigabe.FSK16);

	Zeit z1 = new Zeit("14:00");
	Zeit z2 = new Zeit("17:00");
	
    @Before
    public void initialize() {
		cinmax.addFilmvorfuehrung(m, z1, s1);
		cinmax.addFilmvorfuehrung(m, z2, s1);
		cinmax.addFilmvorfuehrung(m1, z1, s2);
		cinmax.addFilmvorfuehrung(m1, z1, s3);
		List<Filmvorfuehrung> tmp = cinmax.getAlleFilmeMitZeiten();
        
    }
    @Test
    public void nameSaal1(){
    	assertEquals("Blauer Saal", s1.getName());
    }
    
    @Test
    public void nameSaal2(){
    	assertEquals("Grüner Saal", s2.getName());
    }
    
    @Test
    public void nameSaal3(){
    	assertEquals("Studio", s3.getName());
    }
    
    @Test
    public void nameSaal4(){
    	assertEquals("Kellerloch", s4.getName());
    }
    
    @Test
    public void testMap(){
    	assertEquals(true, cinmax.map.containsKey(s1));
    	assertEquals(true, cinmax.map.containsKey(s2));
    	assertEquals(true, cinmax.map.containsKey(s3));
    }
    
    @Test
    public void testFilmvorf1(){
    }
    
    @Test
    public void testAusnahme(){
    	try{
		cinmax.addFilmvorfuehrung(m, z1, s1);
    	} catch (IllegalTimeException ex){
    		assertTrue(true);
    	}
    }
}
