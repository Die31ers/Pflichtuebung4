package hsma.uib.ss14.tpe08.p4.a2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Collatz2 implements Runnable {

	private long n;
	Collection<Long> folgenGlieder;

	public Collatz2(long n) {
		this.n = n;
		folgenGlieder = new ArrayList<Long>();
	}

	public void laengsteFolge() {
		long N = 1000000;
		long maxn = 0, maxSize = 0;
		for (long n = N; n > 0; n--) {
			long size = rechne(n);
			if (size > maxSize) {
				maxn = n;
				maxSize = size;
			}
		}
	}

	private static final Map<Long, Long> previousResults = new HashMap<>();

	private static long rechne(long n) {
		int result = 1;
		if (previousResults.containsKey(n)) {
			return previousResults.get(n);
		} else {
			if (n == 1)
				result = 1;
			else if (n % 2 == 0)
				result += rechne(n / 2);
			else
				result += rechne(3 * n + 1);
			previousResults.put(n, (long) result);
			return result;
		}
	}

	@Override
	public void run() {
		rechne(n);
	}

	public Iterator<Long> iterator() {
		return new CollatzIterator();
	}

	class CollatzIterator implements Iterator<Long> {

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Long next() {
			return null;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub

		}

	}
}
