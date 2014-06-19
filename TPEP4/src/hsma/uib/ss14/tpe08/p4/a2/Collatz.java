package hsma.uib.ss14.tpe08.p4.a2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/**
 * Die Klasse Collatz berechnet die Collatzfolge fuer ein gegebenes n. Die
 * Collatzfolge ist rekursiv wie folgt definiert:<br/>
 * n/2 fuer gerade n;<br/>
 * 3*n+1 fuer ungerade n;<br/>
 * Es laesst sich mit einem Iterator ueber die einzelnen Folgenglieder
 * iterieren, oder die erweiterte for-schleife nutzen.
 * 
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * 
 */
public final class Collatz {

	Collection<Long> folgenGlieder;

	private long n;

	/**
	 * Erstellt ein Collatzobjekt mit dem Startwert 'n' der Folge.
	 * 
	 * @param n
	 *            Startwert der Folge
	 */
	public Collatz(long n) {
		this.n = n;
		folgenGlieder = new ArrayList<Long>();
		berechne(n);
	}

	private void berechne(long n) {
		while (n > 1) {
			folgenGlieder.add(n);
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = (3 * n) + 1;
			}
		}
		folgenGlieder.add(1l);
	}

	/**
	 * Gibt den Startwert der Folge zurueck.
	 * 
	 * @return Startwert 'n'
	 */
	public long getN() {
		return this.n;
	}

	/**
	 * Gibt die Laenge der Collatzfolge bzw. des Objekt mit gegebenen 'n'
	 * zurueck.
	 * 
	 * @return Laenge der Folge
	 */
	public long getGetFolgenLaenge() {
		return folgenGlieder.size();
	}

	/**
	 * Gibt einen Iterator zurueck, mit dem man die einzelnen Folgenglieder
	 * auslesen kann.
	 * 
	 * @return Iterator ueber die Collatzfolge
	 * 
	 *         public Iterator<Long> iterator() { return
	 *         folgenGlieder.iterator(); }
	 */

	/**
	 * Gibt einen Iterator zurueck, mit dem man die einzelnen Folgenglieder
	 * auslesen kann.
	 * 
	 * @return Iterator ueber die Collatzfolge
	 */
	class CollatzIterator implements Iterable<Long> {
		int k = 0;

		public boolean hasNext() {
			return k < folgenGlieder.size();
		}

		public Long next() {
			return ((ArrayList<Long>) folgenGlieder).get(k++);
		}

		@Override
		public Iterator<Long> iterator() {
			return folgenGlieder.iterator();
		}
	}

	/**
	 * Methode um die iterator Methode von der anonymen Klasse Iterators
	 * 
	 * @return iterator
	 */
	public Iterator<Long> iterator() {
		return new CollatzIterator().iterator();
	}
}
