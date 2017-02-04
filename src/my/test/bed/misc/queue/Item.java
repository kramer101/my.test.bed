package my.test.bed.misc.queue;



public class Item implements Comparable<Item> {

	
	private Priority priority;
	private long timestamp;
	
	public Item(final Priority priorityParam) {
		timestamp = System.currentTimeMillis();
		priority = priorityParam;
	}
	
	public enum Priority {
		LOW(2),
		MEDIUM(1),
		HIGH(0);
	
		private int value;
		Priority(final int priorityParam) {
			value = priorityParam;
		}
		
		public int getValue() {
			return value;
		}
	}

	@Override
	public final int compareTo(final Item o) {
		int timestampDiff = Long.compare(getTimestamp(), o.getTimestamp());
		if(timestampDiff == 0) {
			return Integer.compare(getPriority().getValue(), o.getPriority().getValue());
			
		} else {
			return timestampDiff;
			
		}
		
	}

	public final Priority getPriority() {
		return priority;
	}

	
	public final long getTimestamp() {
		return timestamp;
	}

	@Override
	public String toString() {
		
		return timestamp + ", " + getPriority();
	}
	
}
