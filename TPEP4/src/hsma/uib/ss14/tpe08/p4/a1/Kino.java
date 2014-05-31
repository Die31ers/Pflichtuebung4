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
	private String kinoName;
	private String stadt;
	private int aSaaele ; 

	public Kino(String name, String stadt, int aSaaele) {
		this.kinoName = name;
		this.stadt = stadt;
		this.aSaaele = aSaaele;
	}

	public String getName() {
		return this.kinoName;
	}

	public String getStadt() {
		return this.stadt;
	}
	
	/**
	 *  Muss noch Implementiert werden !
	 *  public void getFilmeFuerSaalMitZeiten(){
	 *  
	 *  }
	 */
	
	/**
	 * Muss noch Implementiert werden !
	 * private void getAlleFilmeMitZeiten(){
	 * 
	 * }
	 */
	 
	/**
	 * Muss noch Implementiert werden ! 
	 * public void getAlleFilme(){
	 * 				Angabe des Sortierkriteriums als Enumeration
	 * }
	 */
	
	
	
	 public String toString(){
	 		return kinoName + " in " + stadt + " "; //+ kinoprogramm

	 }
	 
}
