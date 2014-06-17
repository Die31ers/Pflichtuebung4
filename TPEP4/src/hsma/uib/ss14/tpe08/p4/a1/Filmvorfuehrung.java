package hsma.uib.ss14.tpe08.p4.a1;

public class Filmvorfuehrung {

	Film film;
	Zeit zeit;
	
	public Filmvorfuehrung(Film film, Zeit zeit) {
		this.film = film;
		this.zeit = zeit;
	}

	public Film getFilm(){
		return this.film;
	}
	
	public Zeit getZeit(){
		return this.zeit;
	}
	public String toString(){
		return zeit.toString() + " " + film.toString();
	}

	
}
