package hsma.uib.ss14.tpe08.p4.a1;

/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * 
 */
public class Kino {
	private String name;
	private String stadt;
	private Saal saal;

	public Kino(String name, String stadt, Saal saal) {
		this.name = name;
		this.stadt = stadt;
		this.saal = saal;
	}

	public String getName() {
		return this.name;
	}

	public String getStadt() {
		return this.stadt;
	}

	public Saal getSaal() {
		return this.saal;
	}
}
