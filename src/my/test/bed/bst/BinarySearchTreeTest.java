package my.test.bed.bst;

import java.util.PriorityQueue;
import java.util.Queue;

public class BinarySearchTreeTest {

	private TreeNode root;
	
	
	public void add(final int valueToBeAdded) {
		
		TreeNode newNode = new TreeNode(valueToBeAdded);
		if (root == null) {
			root = newNode;
		} else {
			TreeNode parent = findParent(root, valueToBeAdded);
			if (parent == null) {
				return;
			}
			if (valueToBeAdded < parent.getValue()) {
				parent.setLeft(newNode);
			} else if (valueToBeAdded > parent.getValue()) {
				parent.setRight(newNode);
			}
			newNode.setParent(parent);
 		}
	}
	
	
	public boolean delete(final int valueToBeDeleted) {
		
		
		TreeNodeIteration<TreeNode> findNodeToBeDeletedIterator = new TreeNodeIteration<TreeNode>() {

			@Override
			void iterate(TreeNode node, TreeNode startNode) {
				if (node.getValue() == valueToBeDeleted) {
					setValue(node);
					setStop();
				}
			}
		};
		
		iterateDfsPreOrder(findNodeToBeDeletedIterator, null);
		TreeNode nodeToBeDeleted = findNodeToBeDeletedIterator.getValue();
		if (nodeToBeDeleted == null) {
			return false;
		}
		
		if (nodeToBeDeleted.isLeaf()) { //leaf deletion
			TreeNode parent = nodeToBeDeleted.getParent();
			if (nodeToBeDeleted.getValue() > parent.getValue()) {
				parent.setRight(null);
				return true;
			} else if (nodeToBeDeleted.getValue() < parent.getValue()) {
				parent.setLeft(null);
				return true;
			}
		}
		
		if (nodeToBeDeleted.getLeft() == null || nodeToBeDeleted.getRight() == null) {//simple delete
			TreeNode parent = nodeToBeDeleted.getParent();
			if (parent != null) {
				if (nodeToBeDeleted.getValue() > parent.getValue()) {
					parent.setRight(nodeToBeDeleted.getRight());
					return true;
				} else if (nodeToBeDeleted.getValue() < parent.getValue()) {
					parent.setLeft(nodeToBeDeleted.getLeft());
					return true;
				}
			}
			
		} else { //complex deletion where node to be deleted has two child nodes
			
			TreeNode largestLeftBelow = findLargestNodeInLeftSubtree(nodeToBeDeleted);
			
			if (largestLeftBelow != null) {
				
				delete(largestLeftBelow.getValue());
				nodeToBeDeleted.setValue(largestLeftBelow.getValue());
				if (root.getValue() == nodeToBeDeleted.getValue()) {
					root = nodeToBeDeleted;
				}
				
				return true;
			}
			
		}
		
		return false;
	}
	
	
	private TreeNode findLargestNodeInLeftSubtree(final TreeNode startNode) {
		if (startNode == null) {
			return null;
		}
		TreeNodeIteration<TreeNode> findLargestLeftIterator = new TreeNodeIteration<TreeNode>() {

			private TreeNode largest;
			@Override
			void iterate(final TreeNode node, final TreeNode startNode) {
				
				if (node.getValue() == startNode.getValue()) {
					setNext(node.getLeft()); //move left first
				} else {
					setNext(null);
					if (largest == null) {
						largest = node;
					} else {
						if (node.getValue() > largest.getValue()) {
							largest = node;
							setValue(largest);
						}	
					}
				}
			}
		};
		
		
		iterateDfsPreOrder(findLargestLeftIterator, startNode);
		return findLargestLeftIterator.getValue();
	}
	
	private TreeNode findParent(final TreeNode start, final int valueToFind) {
		if (root == null) {
			return null;
		}
		TreeNode startLocal = start;
		
		if (startLocal == null) {
			startLocal = root;
		}
		
		if (startLocal.getLeft() == null && startLocal.getRight() == null) {
			return startLocal;
		}
		
		if (valueToFind < startLocal.getValue()) {
			if (startLocal.getLeft() != null) {
				return findParent(startLocal.getLeft(), valueToFind);
			} else {
				return startLocal;
			}
			
		} else if (valueToFind > startLocal.getValue()) {
			if (startLocal.getRight()!= null) {
				return findParent(startLocal.getRight(), valueToFind);
			} else {
				return startLocal;
			}
		}
		return null;
	}
	
	
	private <T> void iterateDfsPreOrder(final TreeNodeIteration<T> iteration, final TreeNode start) {
		
		TreeNode localStart = start;
		if (localStart == null) {
			localStart = root;
		}
		if (localStart == null) {
			return;
		}
		
		Queue<TreeNode> queue = new PriorityQueue<>();
		queue.add(localStart);
		
		while (!queue.isEmpty()) {
			TreeNode current = queue.poll();
			
			if (current != null) {
				iteration.iterate(current, localStart);
				if (iteration.stop()) {
					break;
				}
				
				if (iteration.getNext() != null) {
					queue.add(iteration.getNext());
				} else {
					if (current.getLeft() != null) {
						queue.add(current.getLeft());
					}
					
					if (current.getRight() != null) {
						queue.add(current.getRight());
					}	
				}
				
			}
			
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int[] tree = new int[]{11, 6, 8, 19, 4, 10, 5, 17, 43, 49, 31};
		
		BinarySearchTreeTest bst  = new BinarySearchTreeTest();
		
		for (int  node : tree) {
			bst.add(node);
		}
		
		bst.iterateDfsPreOrder(new TreeNodeIteration<Void>() {
			
			@Override
			public void iterate(TreeNode node, TreeNode startNode) {
				System.out.println(node);	
			}
		}, null);

		boolean removed = bst.delete(11);
		System.out.println("removed " + removed);
		
		bst.iterateDfsPreOrder(new TreeNodeIteration<Void>() {
			
			@Override
			public void iterate(TreeNode node, TreeNode startNode) {
				System.out.println(node);	
			}
		}, null);
		
		
	}
}
