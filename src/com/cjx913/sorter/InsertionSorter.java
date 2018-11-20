package com.cjx913.sorter;

import java.util.Comparator;

public class InsertionSorter implements Sorter {

	@Override
	public <T extends Comparable<T>> void sort(T[] list) {
		int j;
		for (int i = 1; i < list.length; i++) {
			T temp = list[i];
			for (j = i; j > 0 && temp.compareTo(list[j - 1]) < 0; j--)
				list[j] = list[j - 1];
			list[j] = temp;

		}

	}

	@Override
	public <T> void sort(T[] list, Comparator<T> comparator) {
		int j;
		for (int i = 1; i < list.length; i++) {
			T temp = list[i];
			for (j = i; j > 0 && comparator.compare(temp,list[j - 1]) < 0; j--)
				list[j] = list[j - 1];
			list[j] = temp;

		}

	}

}
