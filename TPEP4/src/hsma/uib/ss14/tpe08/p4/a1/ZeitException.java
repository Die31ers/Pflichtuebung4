package hsma.uib.ss14.tpe08.p4.a1;

/**
 * Die Klasse soll die Startzeiten regeln, bei ungueltigen Startzeiten soll eine
 * Exception geworfen werden.
 * 
 * @author Joshua Barsoum
 * @author Giang Pham
 * @author Hunar Mawlod
 * 
 */
public class ZeitException extends Exception {

	public ZeitException() {
		super();
	}

	public ZeitException(String message) {
		super(message);
	}

	public void message() {
		try {
			throw new ZeitException("ungueltig");
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void werfer() {

	}
}
