package hsma.uib.ss14.tpe08.p4.a1;

public class Film {
	private String titel;
	private double laufzeit;
	private FilmFreigabe altersBegrenzung;
	private Saal saal;

	public Film(String titel, double laufzeit, Saal saal,
			FilmFreigabe altersBegrenzung) {
		this.titel = titel;
		this.laufzeit = laufzeit;
		this.altersBegrenzung = altersBegrenzung;
		this.saal = saal;
	}

}
