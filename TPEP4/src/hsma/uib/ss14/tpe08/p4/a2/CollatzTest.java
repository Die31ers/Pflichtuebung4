package hsma.uib.ss14.tpe08.p4.a2;

import java.util.Iterator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 */
public class CollatzTest {

    private Collatz bsp;
    private Iterator<Long> iter;

    @Before
    public void initialize() {
        bsp = new Collatz(13l);
    }

    @Test
    public void testFolge() {
    	iter = bsp.iterator();
        long[] testwerte = {13l, 40l, 20l, 10l, 5l, 16l, 8l, 4l, 2l, 1l};
        int i = 0;

        while(iter.hasNext()){
            long l = (Long) iter.next(); //Autounboxing
            assertEquals(testwerte[i++], l);
        }
    }
}
