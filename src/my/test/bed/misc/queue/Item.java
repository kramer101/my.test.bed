package my.test.bed.misc.queue;



public class Item implements Comparable<Item> {

	
	private Priority priority;
	private long timestamp;
	
	public Item(final Priority priorityParam) {
		timestamp = System.currentTimeMillis();
		priority = priorityParam;
	}
	
	public enum Priority {
		LOW(0),
		MEDIUM(1),
		HIGH(2);
	
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
		if(o.getTimestamp() == getTimestamp()) {
			return o.getPriority().getValue() - getPriority().getValue();
		} else {
			return  new Long(o.getTimestamp() - getTimestamp()).intValue();
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
