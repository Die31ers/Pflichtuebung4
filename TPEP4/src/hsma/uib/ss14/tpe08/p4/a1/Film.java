package hsma.uib.ss14.tpe08.p4.a1;

public class Film {
	private String titel;
	private double laufzeit;
	private FilmFreigabe altersBegrenzung;

	public Film(String titel, double laufzeit, FilmFreigabe altersBegrenzung) {
		this.titel = titel;
		this.laufzeit = laufzeit;
		this.altersBegrenzung = altersBegrenzung;
	}

	// So versteh ich es aus dem Text. 3 Klassen für die Sortierreiehenfolge
	static class sortiereNachName {

	}

	static class sortiereNachAlter {

	}

	static class sortiereNachLaufzeit {

	}
}
