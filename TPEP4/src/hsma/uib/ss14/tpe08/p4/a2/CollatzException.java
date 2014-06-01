package hsma.uib.ss14.tpe08.p4.a2;

/**
 * Eine Ausnahmeklasse fuer Collatz. Wird geworfen falls z.B. ein Startwert
 * kleiner 0 angegeben wird.
 * 
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 */
public class CollatzException extends RuntimeException{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Erstellt eine Ausnahme fuer Collatzfolgenberechungen mit angegebener
     * Ausloesender Exception.
     * @param cause Grund der Exception
     */
    public CollatzException(Throwable cause) {
        super(cause);
    }

    /**
     * Erstellt eine Ausnahme fuer Collatzfolgenberechungen mit angegebener
     * Ausloesender Exception und einer Nachricht an Ausloesende.
     * @param message Textmessage
     * @param cause Grund der Exception
     */
    public CollatzException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Erstellt eine Ausnahme fuer Collatzfolgenberechungen mit einer
     * Nachricht an Ausloesende.
     * @param message Textmessage
     */
    public CollatzException(String message) {
        super(message);
    }

    /**
     *Erstellt eine Ausnahme fuer Collatzfolgenberechungen.
     */
    public CollatzException() {
    }

}
