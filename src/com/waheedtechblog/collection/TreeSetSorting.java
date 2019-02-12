package com.waheedtechblog.collection;

import java.util.TreeSet;

/**
 * Sorting of TreeSet using lambda Expression. ByDeault, TreeSet sorts object
 * based on natural sorting order.
 * 
 * @author Abdul Waheed
 *
 */
public class TreeSetSorting {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(35);
		treeSet.add(20);
		treeSet.add(0);
		treeSet.add(10);
		treeSet.add(50);

		System.out.println("TreeSet Natural Sorting\n " + treeSet);

		// Pass lambda expression instead of Comparator Object in constructor
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>(
				(integer1, integer2) -> (integer1 > integer2) ? -1 : (integer1 < integer2) ? 1 : 0);
		treeSet1.add(35);
		treeSet1.add(20);
		treeSet1.add(1);
		treeSet1.add(10);
		treeSet1.add(50);

		System.out.println("\nSorting using Lambda Expression in DESC order\n" + treeSet1);
	}

}
