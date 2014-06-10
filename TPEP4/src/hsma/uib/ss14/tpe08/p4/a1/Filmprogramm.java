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
/*public class Filmprogramm<K,V> extends AbstractMap<Saal,Film> implements Map<Saal,Film> {

	HashMap<Saal, Film> map = new HashMap<Saal, Film>();
	
	Saal saal1 = new Saal("Blauer Saal", 250);
	Film film1 = new Film("Batman", FilmFreigabe.FSK_16, 134);
	
	Saal saal2 = new Saal("Studio", 150);
	Film film2 = new Film("Barbie", FilmFreigabe.FSK_0, 90);
	
	Saal saal3 = new Saal("Kellerloch" , 30);
	Film film3 = new Film("Ice Age", FilmFreigabe.FSK_12, 95);
	
	Saal saal4 = new Saal("Gelber Studio", 300);
	Film film4 = new Film("Undisputed 3", FilmFreigabe.FSK_18, 90);
	
	public void speichereFilm(Saal key,Film value) {

	map.put(saal1, film1);
	map.put(saal2, film2);
	map.put(saal3, film3);
	map.put(saal4, film4);
	
	
	System.out.println(map.get(film1));
	}
	 
	/**
	 * Es müssen <code>equals()</code> und die <code>hashcode()</code> 
	 * noch geschrieben werden. Sinnvolle
	 */
	/*
	//Noch nicht implementiert
	public String toString(){
		return null;
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
	
	/*
	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}
}
*/