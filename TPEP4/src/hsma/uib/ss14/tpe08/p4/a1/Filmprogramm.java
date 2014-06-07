package hsma.uib.ss14.tpe08.p4.a1;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 
 * 
 * @author Joshua Barsoum
 * @author Giang Pham
 * @author Hunar Mawlod
 * 
 */
public class Filmprogramm extends AbstractMap<Saal,Film> implements Map<Saal,Film> {

	HashMap<Saal, Film> map = new HashMap<Saal, Film>();

	
	public void speichereFilm(Saal key,Film value) {

	map.put(key, value);
	}

	/*
	 * So wird die toString() - Methode überschrieben, dass der Inhalt der Map 
	 * im Format schlüssel = wert ausgegeben wird. 
	 *
	 * Hier sieht man die Implementierung
	 *
	 * Set <Map.Entry<String, String>> entrySet= map.entrySet;
	 * for(Map.Entry<String,String> entry: entrySet) {
	 * String key = entry.getKey();
	 * String value = entry.getValue();
	 * System.out.printf("5s engl. fuer %s%n", key, value);
	 */
	
	
	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}
}
