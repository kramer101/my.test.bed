package my.test.bed.bst;

public abstract class TreeNodeIteration<T> {
	boolean stop = false;
	private T value;
	private TreeNode next;
	
	abstract void iterate(final TreeNode node, final TreeNode startNode);
	
	boolean stop() {
		return stop;
	}
	
	void setStop() {
		stop = true;
	}
	
	T getValue() {
		return value;
	}
	
	
	
	public TreeNode getNext() {
		return next;
	}

	void setNext(final TreeNode nextParam) {
		next = nextParam;
	}

	/**
	 * Set return value.
	 * @param valueParam
	 */
	void setValue(final T valueParam) {
		value = valueParam;
	}
	
}