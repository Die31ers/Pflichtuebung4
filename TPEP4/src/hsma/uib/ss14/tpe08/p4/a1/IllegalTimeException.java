package hsma.uib.ss14.tpe08.p4.a1;

/**
 * Eine Ausnahmeklasse für Film. Wird geworfen bei ungültiger Startzeit
 * (außerhalb des möglichen Bereiches)
 * 
 * @author Joshua Barsoum
 * @author Giang Pham
 * @author Hunar Mawlod
 * 
 */
public class IllegalTimeException extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Erstellt eine Ausnahme mit angegebener Ausloesender Exception.
	 * 
	 * @param cause
	 *            Grund der Exception
	 */
	public IllegalTimeException(Throwable cause) {
		super(cause);
	}

	/**
	 * Erstellt eine Ausnahme mit angegebener Ausloesender Exception und einer
	 * Nachricht an Ausloesende.
	 * 
	 * @param message
	 *            Textmessage
	 * @param cause
	 *            Grund der Exception
	 */
	public IllegalTimeException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Erstellt eine Ausnahme mit einer Nachricht an Ausloesende.
	 * 
	 * @param message
	 *            Textmessage
	 */
	public IllegalTimeException(String message) {
		super(message);
	}

	/**
	 * Erstellt eine Ausnahme fuer Collatzfolgenberechungen.
	 */
	public IllegalTimeException() {
	}
}
