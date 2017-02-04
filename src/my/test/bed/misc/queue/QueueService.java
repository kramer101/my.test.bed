package my.test.bed.misc.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

import my.test.bed.misc.queue.Item.Priority;

public class QueueService {

	private PriorityQueue<Item> queue = new PriorityQueue<>();
	
	public void add(final Item itemParam) {
		
		if (itemParam == null) {
			throw new IllegalArgumentException("Item cannot be null");
		}
		
		if (itemParam.getPriority() == null || itemParam.getTimestamp() == 0) {
			throw new IllegalArgumentException("Prioriity and timestamp must be set in item");
		}
		
		queue.add(itemParam);
	}
	
	public List<Item> getItems() {
		List<Item> items = new LinkedList<>();
		PriorityQueue<Item> temp = new PriorityQueue<>(queue);
		
		while (temp.size() > 0) {
			items.add(temp.poll());
			
		}
		
		return items;
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		QueueService service = new QueueService();
		
		Item item1 = new Item(Priority.HIGH);
		Thread.sleep(5000);
		service.add(item1);
		
		Item item2 = new Item(Priority.LOW);
		Thread.sleep(5000);
		service.add(item2);
		
		Item item3 = new Item(Priority.MEDIUM);
		Item item4 = new Item(Priority.HIGH);
		
		Thread.sleep(5000);
		service.add(item3);
		service.add(item4);
		
		for (Item item : service.getItems()) {
			System.out.println(item);
		}
		
		
		
	}
}
