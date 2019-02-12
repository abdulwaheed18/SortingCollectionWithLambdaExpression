package com.waheedtechblog.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Sorting element of ArrayList using Lambda Expression
 * 
 * @author Abdul Waheed
 *
 */
public class ArrayListSorting {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(35);
		list.add(20);
		list.add(0);
		list.add(10);
		list.add(50);

		System.out.println("ArrayList before sorting\n " + list);

		Collections.sort(list);
		System.out.println("\nNatural Sorting of Arraylist using Collections sort\n" + list);

		Collections.sort(list, new DescComparator());
		System.out.println("\nSorting using Comparator in DESC order\n" + list);

		Collections.sort(list);
		System.out.println("\nReverting back to natural sorting order\n" + list);

		Collections.sort(list, (integer1, integer2) -> (integer1 > integer2) ? -1 : (integer1 < integer2) ? 1 : 0);
		System.out.println("\nSorting using Lambda Expression in DESC order\n" + list);
	}
}

class DescComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer integer1, Integer integer2) {
		return (integer1 > integer2) ? -1 : (integer1 < integer2) ? 1 : 0; // Java ternary Operator
	}
}
