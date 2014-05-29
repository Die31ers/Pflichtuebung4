package hsma.uib.ss14.tpe08.p4.a1;

/**
 * Die Klasse FilmFreigabe ist dafür gedacht, um mit der Altersfreigabe zu
 * arbeiten, also das hier die Freigabestufen festgehalten werden und die dann
 * nurnoch durch einen Aufruf abgerufen werden.
 * 
 * @author Joshua Barsoum
 * @author Giang Pham
 * @author Hunar Mawlod
 * 
 */

public enum FilmFreigabe {

	USK_0(0), // Freigegeben ohne Altersbeschränkung
				// gemäß § 14 JuSchG.
	USK_6(6), // Freigegeben ab 6 Jahren gemäß § 14 JuSchG.
	USK_12(12), // Freigegeben ab 12 Jahren gemäß § 14 JuSchG.
	USK_16(16), // Freigegeben ab 16 Jahren gemäß § 14 JuSchG.
	USK_18(18); // Keine Jugendfreigabe gemäß § 14 JuSchG.

	public int alter;

	FilmFreigabe(int alter) {
		this.alter = alter;
	}

	public String getUSK(FilmFreigabe usk) {
		switch (usk) {
		case USK_0:
			return "ohne Altersbeschränkung";
		case USK_6:
			return "ab 6 Jahre";
		case USK_12:
			return "ab 12 Jahre";
		case USK_16:
			return "ab 16 Jahre";
		case USK_18:
			return "ab 18 Jahre";
		default:
			break;

		}
		return null;

	}
}