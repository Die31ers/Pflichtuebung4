package hsma.uib.ss14.tpe08.p4.a1;
/**
 * 
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 *
 */
public class Filmvorfuehrung {

	Film film;
	Zeit zeit;
	/**
	 * Konstruktor <code>Filmvorfuehrung</code> mit den parametern
	 * @param film
	 * @param zeit
	 */
	public Filmvorfuehrung(Film film, Zeit zeit) {
		this.film = film;
		this.zeit = zeit;
	}

	/**
	 * Die Methode <code>hashcode()</code> wird für unsere
	 * Klasse neu definiert bzw. überschrieben
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((film == null) ? 0 : film.hashCode());
		result = prime * result + ((zeit == null) ? 0 : zeit.hashCode());
		return result;
	}

	/**
	 * Ebenfalls wird natürlich die Methode <code>equals(Object obj)</code>
	 * überschrieben
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filmvorfuehrung other = (Filmvorfuehrung) obj;
		if (film == null) {
			if (other.film != null)
				return false;
		} else if (!film.equals(other.film))
			return false;
		if (zeit == null) {
			if (other.zeit != null)
				return false;
		} else if (!zeit.equals(other.zeit))
			return false;
		return true;
	}

	/**
	 * Die <code>toString()</code> Methode wandelt <code>zeit</code> und
	 * <code>film</code> in String um
	 */
	public String toString(){
		return zeit.toString() + " " + film.toString();
	}

}
