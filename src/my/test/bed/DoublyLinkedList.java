package my.test.bed;

public class DoublyLinkedList<T> {
	
	private ListNode<T> head;
	private int size = 0;

	/**
	 * Add value to the end of the list.
	 * @param value
	 */
	public void add(final T value) {
		ListNode<T> node = new ListNode<T>(value);
		if (head == null) {
			head = node;
		} else {
			
			ListNode<T> lastNode = head;
			while (lastNode.getNext() != null) {
				lastNode = lastNode.getNext();
			}
			
			lastNode.setNext(node);
			node.setPrevious(lastNode);
		}
		size++;
	}
	
	
	/**
	 * remove first occurrence of the specified value.
	 * @param value value to remove from list
	 * @return
	 */
	public boolean remove(final T value) {
		
		ListNode<T> lastNode = head;
		while (lastNode.getNext() != null) {
			
			if (lastNode.getValue().equals(value)) {
				if (lastNode.getPrevious() != null) {
					lastNode.getPrevious().setNext(lastNode.getNext());
				}
				
				if (lastNode.getNext() != null) {
					lastNode.getNext().setPrevious(lastNode.getPrevious());
				}
				size--;
				return true; //breaking here because we only need to remove the first occurrence.
			}
			
			lastNode = lastNode.getNext();
		}
		
		
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Size:" + size());
		sb.append(", ");
		sb.append("[");
		
		ListNode<T> lastNode = head;
		if (lastNode != null) {
			while (lastNode.getNext() != null) {
				sb.append(lastNode.getValue());
				sb.append(", ");
				lastNode = lastNode.getNext();
			}
			
			sb.append(lastNode.getValue());
		}
		
		
		
		sb.append("]");
		
		return sb.toString();
	}
	
	public int size() {
		return size;
	}
	
	
	public static void main(String[] args) {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
		System.out.println(list);
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(10);
		list.add(10);
		
		System.out.println(list);
		
		list.remove(4);
		
		System.out.println(list);
	}
	
	
	private static class ListNode<T> {
		private T value;
		private ListNode<T> next;
		private ListNode<T> previous;
		
		public ListNode(final T valueParam) {
			value = valueParam;
		}
		
		public T getValue() {
			return value;
		}
		
		public void setValue(T value) {
			this.value = value;
		}
		
		ListNode<T> getNext() {
			return next;
		}
		
		void setNext(ListNode<T> next) {
			this.next = next;
		}
		
		ListNode<T> getPrevious() {
			return previous;
		}
		
		void setPrevious(ListNode<T> previous) {
			this.previous = previous;
		}
		
		@Override
		public String toString() {
			return value.toString();
		}
		
	}
	
}
