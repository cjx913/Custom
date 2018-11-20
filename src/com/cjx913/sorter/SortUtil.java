package com.cjx913.sorter;

import java.util.Comparator;

public class SortUtil {
	public static <T extends Comparable<T>> void sort(T[] list,Sorter sorter) {
		sorter.sort(list);
	}
	
	public static <T> void sort(T[] list, Comparator<T> comparator,Sorter sorter) {
		sorter.sort(list, comparator);
	}
}
