package my.test.bed;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

/**
 * n-ary tree test with generics.
 * @author Vadim Yakovlev (vadym_yakovlev@icloud.com)
 *
 */
public class NAryTreeTest {

	
	
	private static class NAryTree<T extends Comparable<T>> {
		

		private TreeNode<T> root;
		private int size;
		
	
		public NAryTree(T rootValue) {
			root = new TreeNode<T>(rootValue, null);
		}
		
		
		/**
		 * Adding new child to the specified parent.
		 * @param childValue
		 * @param parentValue
		 * @return
		 */
		public boolean add(final T childValue, final T parentValue) {
		
		
			ValueWrapper<Boolean> result = new ValueWrapper<>();
			result.setValue(false);
			iterateTree((nodeParam) -> {
				
				if (parentValue.equals(nodeParam.getValue())) {
					if (!childValue.equals(nodeParam.getValue())) {
						TreeNode<T> child = new TreeNode<T>(childValue, nodeParam);
						if (nodeParam.addChild(child)) {
							size++;
							result.setValue(true);
						}
					}
				}
				
			});
			
			
			return result.getValue();
			
		}
		
		public int size() {
			return size;
		}
		
		private void iterateTree(TreeIteration<T> iterator) {
			
		
			Queue<TreeNode<T>> queue = new PriorityQueue<>();
			
			queue.add(root);
			
			while (!queue.isEmpty()) {
				TreeNode<T> node = queue.poll();
				iterator.next(node);
				node.getChildren().forEach((child) -> {
					queue.add(child);
				});
			}
			
		}
		
		public void printTree() {
			iterateTree((nodeParam) -> {
				System.out.println(nodeParam + " children:" + nodeParam.getChildren());
			
			});
			
		}
		
	}
	
	private class Test2 implements Comparable<Test2> {

		@Override
		public int compareTo(Test2 oParam) {
			
			int[][] a = new int[2][2];
			
			a[1][1] = 6;
			
			// TODO Auto-generated method stub
			return 0;
		}

		
		
	}
	
	private static class TreeNode<T extends Comparable<T>> implements Comparable<T>  {
		private T value;
		private TreeNode<T> parent;
		
		public TreeNode(T valueParam, final TreeNode<T> parentParam) {
			value = valueParam;
			parent = parentParam;
		}
		private Set<TreeNode<T>> children = new TreeSet<TreeNode<T>>();;

		
		public T getValue() {
			return value;
		}


		public Set<TreeNode<T>> getChildren() {
			
			return children;
		}


		public boolean addChild(final TreeNode<T> child) {
			
			return children.add(child);
		}


		@Override
		public int compareTo(T oParam) {

			return oParam.compareTo(this.getValue());
		}
		
		@Override
		public String toString() {
			
			return value.toString();
		}


		public TreeNode<T> getParent() {
			return parent;
		}
		

	}
	
	
	
	@FunctionalInterface
	private static interface TreeIteration<T extends Comparable<T>> {
		void next(TreeNode<T> node);
		
	}
	
	
	
	public static void main(String[] args) {
		
		NAryTree<String> tree = new NAryTree<String>("USA");
		tree.add("California", "USA");
		//tree.add("California", "USA");
		tree.add("New York", "USA");
		
		tree.add("New York City", "New York");
		
		tree.add("San Francisco", "California");
		tree.add("Los Angeles", "California");
		
		
		System.out.println(tree.size());
		tree.printTree();
		
	}
}
