package my.test.bed.bst;


/**
 * 
 * @author Vadim Yakovlev (vadym_yakovlev@icloud.com)
 *
 */
public class TreeNode  implements Comparable<TreeNode> {
	private int value;
	private TreeNode left;
	private TreeNode right;
	private TreeNode parent;
	
	TreeNode(final int valueParam) {
		value = valueParam;
	}

	TreeNode getLeft() {
		return left;
	}

	void setLeft(TreeNode left) {
		this.left = left;
	}

	TreeNode getRight() {
		return right;
	}

	void setRight(TreeNode right) {
		this.right = right;
	}

	int getValue() {
		return value;
	}
	
	
	
	void setValue(int value) {
		this.value = value;
	}

	TreeNode getParent() {
		return parent;
	}

	void setParent(TreeNode parent) {
		this.parent = parent;
	}
	
	boolean isLeaf() {
		return getLeft() == null && getRight() == null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append("Value: ");
		sb.append(getValue()); 
		sb.append(" (");
		sb.append("Left : ");
		sb.append(getLeft() == null ? "null" : getLeft().getValue());
		sb.append(", Right: "); 
		sb.append(getRight() == null ? "null" : getRight().getValue());
		sb.append(")");
		sb.append(isLeaf() ? ", *LEAF*" : "");
		sb.append("]");
		return sb.toString();
	}

	@Override
	public int compareTo(TreeNode o) {
		return getValue() - o.getValue();
	}
	
	
}