package hsma.uib.ss14.tpe08.p4.a1;

/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * 
 */
public class Kino extends Saal {
	private String kinoName;
	private String stadt;

	public Kino(String name, String stadt) {
		super(name, anzahlSitze);
		this.kinoName = name;
		this.stadt = stadt;
	}

	public String getName() {
		return this.kinoName;
	}

	public String getStadt() {
		return this.stadt;
	}
	
	
	/*
	 * Muss noch Implementiert werden !
	 * public String toString(){
	 * 
	 * }
	 */
}
