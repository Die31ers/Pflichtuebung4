package hsma.uib.ss14.tpe08.p4.a2;

import java.util.Iterator;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Die Testklasse für Collatz
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 */
public class CollatzTest {

	private Collatz bsp;
	private Iterator<Long> iter;

	@Test
	public void testFolge1() {
		bsp = new Collatz(13l);
		iter = bsp.iterator();
		long[] testwerte = { 13l, 40l, 20l, 10l, 5l, 16l, 8l, 4l, 2l, 1l };
		int i = 0;

		while (iter.hasNext()) {
			long l = (Long) iter.next(); // Autounboxing
			assertEquals(testwerte[i++], l);
		}
	}

	@Test
	public void testFolge2() {
		bsp = new Collatz(40l);
		iter = bsp.iterator();
		long[] testwerte = { 40l, 20l, 10l, 5l, 16l, 8l, 4l, 2l, 1l };
		int i = 0;

		while (iter.hasNext()) {
			long l = (Long) iter.next(); // Autounboxing
			assertEquals(testwerte[i++], l);
		}
	}

	@Test
	public void testFolge3() {
		bsp = new Collatz(20l);
		iter = bsp.iterator();
		long[] testwerte = { 20l, 10l, 5l, 16l, 8l, 4l, 2l, 1l };
		int i = 0;

		while (iter.hasNext()) {
			long l = (Long) iter.next(); // Autounboxing
			assertEquals(testwerte[i++], l);
		}
	}

	@Test
	public void testFolge4() {
		bsp = new Collatz(10l);
		iter = bsp.iterator();
		long[] testwerte = { 10l, 5l, 16l, 8l, 4l, 2l, 1l };
		int i = 0;

		while (iter.hasNext()) {
			long l = (Long) iter.next(); // Autounboxing
			assertEquals(testwerte[i++], l);
		}
	}

	@Test
	public void testFolge5() {
		bsp = new Collatz(5l);
		iter = bsp.iterator();
		long[] testwerte = { 5l, 16l, 8l, 4l, 2l, 1l };
		int i = 0;

		while (iter.hasNext()) {
			long l = (Long) iter.next(); // Autounboxing
			assertEquals(testwerte[i++], l);
		}
	}

}
