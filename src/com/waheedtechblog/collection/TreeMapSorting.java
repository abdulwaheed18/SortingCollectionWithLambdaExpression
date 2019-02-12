package com.waheedtechblog.collection;

import java.util.TreeMap;

/**
 * Sorting of TreeMap using lambda Expression. ByDeault, TreeMap sorts object
 * based on natural sorting order of KEY object.
 * 
 * @author Abdul
 *
 */
public class TreeMapSorting {

	public static void main(String[] args) {

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(205, "java");
		treeMap.put(300, "Python");
		treeMap.put(102, "Spring FrameWork");
		treeMap.put(503, "Hibernate");
		treeMap.put(410, "Docker");

		System.out.println("Natural Sorting order of treeMap\n " + treeMap);

		TreeMap<Integer, String> treeMap1 = new TreeMap<Integer, String>(
				(integer1, integer2) -> (integer1 > integer2) ? -1 : (integer1 < integer2) ? 1 : 0);
		treeMap1.put(205, "java");
		treeMap1.put(300, "Python");
		treeMap1.put(102, "Spring FrameWork");
		treeMap1.put(503, "Hibernate");
		treeMap1.put(410, "Docker");
		
		System.out.println("Sorting using Lambda Expression in DESC order\n " + treeMap1);

	}

}
