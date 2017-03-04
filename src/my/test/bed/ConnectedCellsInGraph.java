package my.test.bed;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class ConnectedCellsInGraph {

	private static class Coordinate implements Comparable<Coordinate> {
		private int x;
		private int y;

		public Coordinate(int xParam, int yParam) {
			x = xParam;
			y = yParam;
		}

		public int x() {
			return x;

		}

		public int y() {
			return y;
		}

		@Override
		public String toString() {
			return "x=" + x + " y=" + y;
		}

		@Override
		public int compareTo(Coordinate oParam) {

			if (oParam.x() == x()) {
				return oParam.y() - y();
			} else {
				return oParam.x() - x();
			}
		}

		@Override
		public boolean equals(Object objParam) {
			Coordinate c = (Coordinate) objParam;
			return x() == c.x() && y() == c.y();
		}

		@Override
		public int hashCode() {

			Integer i = new Integer(x() + y());
			return i.hashCode() % 2;
		}

	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // (y)
		int m = s.nextInt(); // (x)

		int[][] matrix = new int[m][n];
		int maxSize = 0;
		for (int y = 0; y < n; y++) {

			int x = 0;
			while (x < m) {
				int value = s.nextInt();
				matrix[x][y] = value;
				x++;
			}

		}

		Set<Coordinate> visited = new HashSet<>();

		Queue<Coordinate> queue = new LinkedList<>();
		queue.add(new Coordinate(0, 0));

		while (!queue.isEmpty()) {
			System.out.println(queue);
			Coordinate current = queue.poll();
			visited.add(current);

			int currentValue = matrix[current.x()][current.y()];

			int regionCount = 0;
			System.out.println("value=" + currentValue + " " + current);
			if (currentValue == 1) { // start a new region and traverse it

				Coordinate nextValueOne = current;
				while (nextValueOne != null) {
					regionCount++; // continue a region

					nextValueOne = getNextValueOne(nextValueOne, matrix, visited);
					if (nextValueOne != null) {
						visited.add(nextValueOne);
					}
					System.out.println("nextValueOne=" + nextValueOne);

				} // End of region reached

				if (maxSize < regionCount) {
					maxSize = regionCount;
				}
				System.out.println("RESET regionCount=" + regionCount);
				regionCount = 0;

			} 
			
			boolean isEndReached = false;
			int distance = 1;
			
			while (!isEndReached) {
				
				Coordinate next = getNext(current, matrix, visited, distance);
				if (next != null) {
					queue.add(next);
					break;
				} else {
					distance++;
				}
				
				isEndReached = (current.x() + distance >= matrix.length - 1)
						&& (current.y() + distance >= matrix[current.x()].length - 1);
				
			}
			
			
		}

		System.out.println(visited);
		System.out.println(maxSize);

	}

	private static Coordinate getNearestNotVisitedNeighbor(final int[][] matrixParam,
			final List<Coordinate> visitedParam, final int xLimit, final int yLimit) {

		for (Coordinate c : visitedParam) {

		}

		return null; // no more nodes to visit, all have been visited.
	}

	private static int getRegionSize(final Coordinate c, final int[][] matrix, final Set<Coordinate> visited) {
	
		int size = 1;
		Coordinate nextValueOne = c;
		while (nextValueOne != null) {
			//regionCount++; // continue a region

			nextValueOne = getNextValueOne(nextValueOne, matrix, visited);
			if (nextValueOne != null) {
				visited.add(nextValueOne);
			}
			System.out.println("nextValueOne=" + nextValueOne);

		} 
		return size;
	}
	
	private static Coordinate getNextValueOne(final Coordinate c, final int[][] matrix, final Set<Coordinate> visited) {

		Coordinate next = c;
		int value = 0;
		while (value != 1 && next != null) {

			next = getNext(c, matrix, visited, 1);
			if (next != null) {
				value = matrix[next.x()][next.y()];
			}

			if (value == 0 && next != null) {
				visited.add(next);
			}
		}

		return next;
	}

	private static Coordinate getNext(final Coordinate c, final int[][] matrix, final Set<Coordinate> visited, final int distance) {

		int x = c.x();
		int y = c.y();

		

		// right
		if (x < matrix.length - distance) {
			Coordinate next = new Coordinate(x + distance, y);
			if (!visited.contains(next)) {
				return next;
			}
		}

		// left
		if (x >= distance) {
			Coordinate next = new Coordinate(x - distance, y);
			if (!visited.contains(next)) {
				return next;
			}
		}

		// top
		if (y >= distance) {
			Coordinate next = new Coordinate(x, y - distance);
			if (!visited.contains(next)) {
				return next;
			}
		}

		// bottom
		if (y < matrix[x].length - distance) {
			Coordinate next = new Coordinate(x, y + distance);
			if (!visited.contains(next)) {
				return next;
			}
		}

		// top right
		if (x < matrix.length - distance && y >= distance) {
			Coordinate next = new Coordinate(x + distance, y - distance);
			if (!visited.contains(next)) {
				return next;
			}
		}

		// top left
		if (x >= distance && y >= distance) {
			Coordinate next = new Coordinate(x - distance, y - distance);
			if (!visited.contains(next)) {
				return next;
			}
		}

		// bottom right
		if (y < matrix[x].length - distance && x < matrix.length - distance) {

			Coordinate next = new Coordinate(x + distance, y + distance);
			if (!visited.contains(next)) {
				return next;
			}
		}

		// bottom left
		if (y < matrix[x].length - distance && x >= distance) {
			Coordinate next = new Coordinate(x - distance, y + distance);
			if (!visited.contains(next)) {
				return next;
			}
		}

		return null;

	}

}
