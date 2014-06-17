package hsma.uib.ss14.tpe08.p4.a2;
import java.util.HashMap;
import java.util.Map;

public class Collatz2Main {
	private static void laengsteFolge() throws InterruptedException {

		Collatz2 col = new Collatz2(13);
		Thread th1 = new Thread(col);
		Thread th2 = new Thread(col);
		th1.start();
		th2.join();
		
	}

	private static final Map<Long, Long> previousResults = new HashMap<>();

	private static long collatz(long n) {
		int result = 1;
		if (previousResults.containsKey(n)) {
			return previousResults.get(n);
		} else {
			if (n == 1)
				result = 1;
			else if (n % 2 == 0)
				result += collatz(n / 2);
			else
				result += collatz(3 * n + 1);
			previousResults.put(n, (long) result);
			return result;
		}
	}

	public static void main(String[] args) throws InterruptedException {

		long N = 1000000;
		long maxn = 0, maxSize = 0;
		for (long n = N; n > 0; n--) {
			long size = collatz(n);
			if (size > maxSize) {
				maxn = n;
				maxSize = size;
			}
		}
		System.out.println(maxn + " - " + maxSize);
	}
}
