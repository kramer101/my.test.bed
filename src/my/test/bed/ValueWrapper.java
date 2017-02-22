package my.test.bed;

public class ValueWrapper<V> {

	private V value;
	public V getValue() {
		return value;
	}
	
	public void setValue(final V valueParam) {
		value = valueParam;
	}
}
