package hsma.uib.ss14.tpe08.p4.a2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * Berechet die mximalste Folgenlaenge fuer alle n kleiner 1000000.
 * 
 * 
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * 
 */
public class Main {

	public static void beispiel() {
		// Bsp vom Aufgabenblatt
		Collatz meinCol = new Collatz(13);
		for (Long i : meinCol.folgenGlieder) {
			System.out.printf(" %d", i.intValue());
		}
		System.out.printf("%nDie Laenge der Folge ist: %d%n",
				meinCol.getGetFolgenLaenge());

	}

	/**
	 * Berechet die mximalste Folgenlaenge fuer alle n kleiner 1000000. Nimmt
	 * die Berechung der maximalen Folgenlaenge mit Hilfe von Threads vor.
	 * 
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	public static void laengsteFolge() throws InterruptedException, ExecutionException {
		long n = 1;
		// Das maximale
		Collatz maxCol = new Collatz(1);
		// 4 Collatz-Objekte als Ergebnisse der Threads
		Collatz einCol = new Collatz(1);
		Collatz zweiCol = new Collatz(1);
		Collatz dreiCol = new Collatz(1);
		Collatz vierCol = new Collatz(1);
		// Threadpool ertstellen
		ExecutorService executor = Executors.newFixedThreadPool(4);

		do {
			// Die tasks (Callables) uebergeben und ergebnisse zuweisen
			Future<Collatz> f = executor.submit(new CollatzCall(n++));
			Future<Collatz> f2 = executor.submit(new CollatzCall(n++));
			Future<Collatz> f3 = executor.submit(new CollatzCall(n++));
			Future<Collatz> f4 = executor.submit(new CollatzCall(n++));


				// Die Ergebnisse auslesen
				einCol = f.get();
				zweiCol = f2.get();
				dreiCol = f3.get();
				vierCol = f4.get();

			// Den mit der miximalen Folgenlaenge bestimmen
			maxCol = maxCol.getGetFolgenLaenge() < einCol.getGetFolgenLaenge() ? einCol
					: maxCol;
			maxCol = maxCol.getGetFolgenLaenge() < zweiCol.getGetFolgenLaenge() ? zweiCol
					: maxCol;
			maxCol = maxCol.getGetFolgenLaenge() < dreiCol.getGetFolgenLaenge() ? dreiCol
					: maxCol;
			maxCol = maxCol.getGetFolgenLaenge() < vierCol.getGetFolgenLaenge() ? vierCol
					: maxCol;
		} while (n < 1000000);
		// executoer 'beenden', fuer weitere tasks schliessen
		executor.shutdownNow();
		System.out.printf(
				"Die maximale Laenge der Folge ist: %d; bei n = %d%n",
				maxCol.getGetFolgenLaenge(), maxCol.getN());
		for (Long i : maxCol.folgenGlieder) {
			System.out.printf(" %d", i.intValue());
		}
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		beispiel();
		laengsteFolge();
	}

}