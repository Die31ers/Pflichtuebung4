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

	FSK_0(0), FSK_6(6), FSK_12(12), FSK_16(16), FSK_18(18);

	public int alter;

	FilmFreigabe(int alter) {
		this.alter = alter;
	}

	public String getFSK(FilmFreigabe usk) {
		switch (usk) {
		case FSK_0:
			return "ohne Altersbeschränkung";
		case FSK_6:
			return "ab 6 Jahre";
		case FSK_12:
			return "ab 12 Jahre";
		case FSK_16:
			return "ab 16 Jahre";
		case FSK_18:
			return "ab 18 Jahre";
		default:
			break;

		}
		return null;

	}
}