package my.test.bed;

import java.util.Stack;

import org.junit.Test;

import junit.framework.TestCase;

public class MinimumStack extends TestCase {

	private Stack<Integer> main = new Stack<>();
	private Stack<Integer> minimum = new Stack<>();
	
	
	public int pop() {
		if (main.isEmpty()) {
			return -1;
		}
		
		int value = main.pop();
		
		if (minimum.peek() ==  value) {
			minimum.pop();
		}
		
		return value;
	}
	
	public void push(int value) {
		main.push(value);
		
		if (minimum.isEmpty()) {
			minimum.push(value);
		} else {
			if (minimum.peek() > value) {
				minimum.push(value);
			}
		}
		
	}
	
	
	
	public int getMinimumValue() {
		if (minimum.isEmpty()) {
			return -1;
		}
		return minimum.peek();
	}
	

	@Test
	public void testStack() {
		MinimumStack stack = new MinimumStack();
		
		assertTrue(stack != null);
		
		assertTrue(stack.getMinimumValue() == -1);
		
		stack.push(5);
		
		assertTrue(stack.getMinimumValue() == 5);
		
		stack.push(2);
		
		assertTrue(stack.getMinimumValue() == 2);
		
		stack.pop();
		assertTrue(stack.getMinimumValue() == 5);
		stack.push(40);
		
		assertTrue(stack.getMinimumValue() == 5);
	}
	
}
