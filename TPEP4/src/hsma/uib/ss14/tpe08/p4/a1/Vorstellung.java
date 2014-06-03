package hsma.uib.ss14.tpe08.p4.a1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Diese Klasse modelliert eine Vorstellung. Diese umfasst: - den Kinosaal, in
 * dem die Vorstellung l�uft - den Film, welcher in der Vorstellung gezeigt wird
 * - eine Anfangszeit
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 */
public class Vorstellung extends HashMap<Film, Saal> {
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		super.clear();
	}

	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return super.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return super.containsValue(value);
	}

	@Override
	public Set<Entry<Film, Saal>> entrySet() {
		// TODO Auto-generated method stub
		return super.entrySet();
	}

	@Override
	public Saal get(Object key) {
		// TODO Auto-generated method stub
		return super.get(key);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return super.isEmpty();
	}

	@Override
	public Set<Film> keySet() {
		// TODO Auto-generated method stub
		return super.keySet();
	}

	@Override
	public Saal put(Film key, Saal value) {
		// TODO Auto-generated method stub
		return super.put(key, value);
	}

	@Override
	public void putAll(Map<? extends Film, ? extends Saal> m) {
		// TODO Auto-generated method stub
		super.putAll(m);
	}

	@Override
	public Saal remove(Object key) {
		// TODO Auto-generated method stub
		return super.remove(key);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return super.size();
	}

	@Override
	public Collection<Saal> values() {
		// TODO Auto-generated method stub
		return super.values();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Saal saal;
	private Film film;
	private Zeit zeit;

	public Vorstellung(Saal saal, Film film, Zeit zeit) {
		this.saal = saal;
		this.film = film;
		this.zeit = zeit;
	}

	public Saal getSaal() {
		return saal;
	}

	public Film getFilm() {
		return film;
	}

	public Zeit getZeit() {
		return zeit;
	}


}
