package my.test.bed.misc;

public class MyHashMap<K extends Comparable<K>, V> {

	int initSize = 10;
	
	private Entry<K, V>[] table = new Entry[initSize];
	private int size = 0;
	
	public int size() {
		return size;
	}
	
	private void putToTable(final Entry<K, V> entry, final int hashValue) {
		table[hashValue] =  entry;
		size++;
	}
	
	public void put(final K keyParam, final V valueParam) {
		int hash = hash(keyParam);
		Entry<K, V> entry = table[hash];
		
		if (entry == null) {
			entry = new Entry<K, V>(keyParam, valueParam);
			
			
			if (hash <= table.length - 1) {
				putToTable(entry, hash); //replace
			} else {
				//insert new (add new)
				Entry<K, V>[] temp = new Entry[table.length + 1];
				
				for (int i = 0; i < table.length; i++) {
					temp[i] = table[i];
				}
				putToTable(entry, hash);
				table = temp;
			}
			
		} else {
			while (true) {
				if (entry.getKey() == keyParam) {
					entry.setValue(valueParam);
					return;
				}
				
				Entry<K, V> next = entry.getNext();
				
				if (next == null) {
					
					next = addNewNext(entry, keyParam, valueParam);  
					
					break;
				}
				entry = entry.getNext();
			}
		}
		
	}
	
	private Entry<K, V> addNewNext(final Entry<K, V> entry, final K nextKey, final V nextValue) {
		Entry<K, V> next = new Entry<K, V>(nextKey, nextValue);
		entry.setNext(next);
		size++;
		return next;
	}
	
	public V get(final K keyParam) {
		int hash = hash(keyParam);
		if (hash > table.length - 1 || hash < 0) {
			return null;
		}
		
		Entry<K, V> entry = find(keyParam);
		
		if (entry == null) {
			return null;
		}
		
		
		
		return entry.getValue();
	}
	
	private Entry<K, V> find(final K keyParam) {
		
		Entry<K, V> entry = getEntryFromTable(keyParam);
		
		if (entry == null) {
			return null;
		}
		
		if (entry.getKey().equals(keyParam)) {
			return entry;
		}
		
		Entry<K, V> next = entry.getNext();
		
		while (next != null) {
			if (next.getKey().equals(keyParam)) {
				return next;
			}
			next = next.getNext();
		}
		
		return null;
	}
	
	/**
	 * @param keyParam
	 * @return first item in the bucket.
	 */
	private Entry<K, V> getEntryFromTable(final K keyParam) {
		int hash = hash(keyParam);
		if (hash > table.length - 1 || hash < 0) {
			return null;
		}
		return table[hash];
	}
	
	private void removeEntry(Entry<K, V> entry) {
		entry = null;
		size--;
	}
	
	private void removeNextEntry(Entry<K, V> entry) {
		entry.setNext(null);
		size--;
	}
	
	public boolean remove(final K keyToRemove) {
		Entry<K, V> entry = getEntryFromTable(keyToRemove);
		if (entry == null) {
			return false;
		}
		
		
		while (entry != null) {
			if (entry.getNext() == null) {
				removeEntry(entry);
				return true;
			}
			
			Entry<K, V> next = entry.getNext();
			
			if (next.getKey().equals(keyToRemove)) {
				Entry<K, V> afterNext = next.getNext();
				
				if (afterNext == null) {
					removeEntry(next);
					removeNextEntry(entry);
					return true;
					
				} else {
					removeEntry(next);
					entry.setNext(afterNext);
					return true;
				}
			}
			
			entry = entry.getNext();
			
		}
		
		return false;
		
	}
	
	private int hash(final K keyParam) {
		return Math.abs(keyParam.hashCode()) % table.length;
	}
	
	private class Entry<K, V> {
		
		public Entry(final K keyParam, final V valueParam) {
			key = keyParam;
			value = valueParam;
					
		}
		private K key;
		private V value;
		private Entry<K, V> next;
		
		
		K getKey() {
			return key;
		}
		
		V getValue() {
			return value;
		}
		
		
		Entry<K, V> getNext() {
			return next;
		}
		void setNext(final Entry<K, V> nextParam) {
			this.next = nextParam;
		}
		
		void setValue(final V value) {
			this.value = value;
		}
		
		
		

	}
	
	

	
	
	
}
