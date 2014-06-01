package hsma.uib.ss14.tpe08.p4.a1;

public class NurZumTesten {

	public static void main(String[] args) {
		Saal s1 = new Saal("Blauer Saal", 250);
		Saal s2 = new Saal("Grüner Saal", 200);
		Saal s3 = new Saal("Studio", 150);
		Saal s4 = new Saal("Kellerloch", 30);
		
		Kino cinmax = new Kino("Cinemaxx", "Mannheim", s1, s2, s3, s4);
		System.out.println(cinmax);
	}

}
