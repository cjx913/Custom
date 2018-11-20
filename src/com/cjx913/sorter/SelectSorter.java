package com.cjx913.sorter;

import java.util.Comparator;

public class SelectSorter implements Sorter {

	@Override
	public <T extends Comparable<T>> void sort(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex].compareTo(arr[j]) > 0) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				T temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}

	}

	@Override
	public <T> void sort(T[] arr, Comparator<T> comparator) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (comparator.compare(arr[minIndex],arr[j]) > 0) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				T temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}

	}

}
