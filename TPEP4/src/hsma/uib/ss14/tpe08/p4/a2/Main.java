package hsma.uib.ss14.tpe08.p4.a2;

/**
 * Aufgabenteil a)
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

	public static void main(String[] args) {
		beispiel();
	}

}