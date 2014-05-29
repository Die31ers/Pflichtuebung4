package hsma.uib.ss14.tpe08.p4.a2;

/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * 
 */
public class Collatz {
	
	//Programm aus dem Internet. Lösung ist ohne iterator!

	public static void collatz(int n) {
		System.out.print(n + " ");
		if (n == 1) {
			return;
		} else if (n % 2 == 0) {
			collatz(n / 2);
		} else {
			collatz(3 * n + 1);
		}
	}

	private class Iterator {
		
	}

}
