package hsma.uib.ss14.tpe08.p4.a2;

import java.util.concurrent.Callable;

/**
 * Ein von einem Thread ausfuehrebares Objekt, das eine Collatzfolge berechnet.
 * Ueber {@link #call() } wird das Ergebnis der Berechnung zurueck gegeben,
 * in dieser wird das ensprechende Collatz-Objekt erstellt.
 *
 * @see java.util.concurrent.Callable
 * @see java.util.concurrent.ExecutorService
 * @see java.util.concurrent.Future
 *
 * 
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 */
public class CollatzCall implements Callable<Collatz>{

    //Zwischenspeicher fuer den Startwert
    private long n;

    /**
     * Erstellt ein neues Ausfuehrbares CollatzCall-Objekt.
     * @param n der Startwert der Collatzfolge
     */
    public CollatzCall(long n) {
        this.n = n;
    }

    /**
    * Gibt das Collatz-Objekt nach der Berechnung/Erstellung zurueck.
     * @return das erstellte Collatz-Objekt
     * @throws Exception
     */
    public Collatz call() throws Exception {
        return new Collatz(this.n);
    }

}
