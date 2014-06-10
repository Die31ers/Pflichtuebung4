package hsma.uib.ss14.tpe08.p4.a1;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Set;

/**
 * Die Klasse <code>Speicherverwaltung</code> beeinhaltet eine Map die zur
 * internen Speicherung der Kinofilme dient.
 * 
 * @author Joshua Barsoum
 * @author Giang Pham
 * @author Hunar Mawlod
 * 
 */



/**
 * 
 * HIER DRAUF GEHEN !! ICH glaub das ist sehr hilfreich. 
 * http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/6-b14/java/util/HashMap.java#HashMap.%3Cinit%3E%28%29
 * 
 * @author Joshua Barsoum	
 * @author Giang Pham
 * @author Hunar Mawlod
 *
 */
public class Speicherverwaltung extends AbstractMap<Saal, String> {

	HashMap<Saal, Film> map = new HashMap<Saal, Film>();

	public HashMap<Saal, Film> speichereDaten(Saal saal, Film film) {
		map.put(saal, film);
		return map;
	}

	@Override
	public Set<java.util.Map.Entry<Saal, String>> entrySet() {

		return null;
	}

}
