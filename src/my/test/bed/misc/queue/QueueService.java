package my.test.bed.misc.queue;

import java.util.Arrays;
import java.util.PriorityQueue;

import my.test.bed.misc.queue.Item.Priority;

public class QueueService {

	private PriorityQueue<Item> queue = new PriorityQueue<>();
	
	public void add(final Item itemParam) {
		queue.add(itemParam);
	}
	
	public Item[] getItems() {
		return  queue.toArray(new Item[]{});
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
		
		
		System.out.println(Arrays.toString(service.getItems()));
		
		
	}
}
