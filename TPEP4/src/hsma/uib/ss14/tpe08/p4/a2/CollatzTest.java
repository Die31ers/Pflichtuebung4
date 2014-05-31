package hsma.uib.ss14.tpe08.p4.a2;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Collection;
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
    Collatz.Iterator iter;

    @Before
    public void initialize() {
        bsp = new Collatz(13l);
        iter = (Collatz.Iterator) bsp.folgenGlieder;
    }

    @Test
    public void testFolge() {
    	
        long[] testwerte = {13l, 40l, 20l, 10l, 5l, 16l, 8l, 4l, 2l, 1l};
        int i = 0;

        while(iter.hasNext()){
            long l = (Long) iter.next(); //Autounboxing
            assertEquals(testwerte[i++], l);
        }
    }
}
