package com.cjx913.sorter;

import java.util.Comparator;

public class QuickSorter implements Sorter {

	@Override
	public <T extends Comparable<T>> void sort(T[] list) {
		quickSort(list, 0, list.length - 1);
	}

	@Override
	public <T> void sort(T[] list, Comparator<T> comparator) {
		quickSort(list, 0, list.length - 1, comparator);
	}

	private <T extends Comparable<T>> void quickSort(T[] arr, int start, int end) {
		if (start >= end)
			return;

		int low = start;
		int high = end;
		T standard = arr[start];

		while (low < high) {
			while (low < high && standard.compareTo(arr[high]) <= 0) {
				high--;
			}
			arr[low] = arr[high];
			while (low < high && standard.compareTo(arr[low]) >= 0) {
				low++;
			}
			arr[high] = arr[low];
		}
		arr[low] = standard;

		quickSort(arr, start, low);
		quickSort(arr, high + 1, end);

	}

	private <T> void quickSort(T[] arr, int start, int end, Comparator<T> comparator) {
		if (start >= end)
			return;

		int low = start;
		int high = end;
		T standard = arr[start];

		while (low < high) {
			while (low < high && comparator.compare(standard, arr[high]) <= 0) {
				high--;
			}
			arr[low] = arr[high];
			while (low < high && comparator.compare(standard, arr[low]) >= 0) {
				low++;
			}
			arr[high] = arr[low];
		}
		arr[low] = standard;

		quickSort(arr, start, low,comparator);
		quickSort(arr, high + 1, end,comparator);
	}

}
