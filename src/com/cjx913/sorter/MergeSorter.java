package com.cjx913.sorter;

import java.util.Comparator;

public class MergeSorter implements Sorter {

	@Override
	public <T extends Comparable<T>> void sort(T[] arr) {
		mergeSort(arr, 0, arr.length - 1);
	}

	@Override
	public <T> void sort(T[] arr, Comparator<T> comparator) {
		mergeSort(arr, 0, arr.length - 1, comparator);

	}

	private <T extends Comparable<T>> void mergeSort(T[] arr, int low, int high) {
		if (low >= high)
			return;

		int middle = (low + high) / 2;
		mergeSort(arr, low, middle);
		mergeSort(arr, middle + 1, high);
		merge(arr, low, middle, high);
	}

	private <T> void mergeSort(T[] arr, int low, int high, Comparator<T> comparator) {
		if (low >= high)
			return;

		int middle = (low + high) / 2;
		mergeSort(arr, low, middle,comparator);
		mergeSort(arr, middle + 1, high,comparator);
		merge(arr, low, middle, high,comparator);
	}

	

	private <T extends Comparable<T>> void merge(T[] arr, int low, int middle, int high) {
		T[] tempArr = (T[]) new Comparable[arr.length];

		int index = 0;
		int leftPos = low;
		int rightPos = middle + 1;

		while (leftPos <= middle && rightPos <= high) {
			if (arr[leftPos].compareTo(arr[rightPos]) <= 0) {
				tempArr[index++] = arr[leftPos++];
			} else {
				tempArr[index++] = arr[rightPos++];
			}
		}

		while (leftPos <= middle) {
			tempArr[index++] = arr[leftPos++];
		}
		while (rightPos <= high) {
			tempArr[index++] = arr[rightPos++];
		}

		for (int i = 0; i < index; i++) {
			arr[low + i] = tempArr[i];
		}

	}
	
	private <T> void merge(T[] arr, int low, int middle, int high, Comparator<T> comparator) {
		T[] tempArr = (T[]) new Object[arr.length];

		int index = 0;
		int leftPos = low;
		int rightPos = middle + 1;

		while (leftPos <= middle && rightPos <= high) {
			if (comparator.compare(arr[leftPos],arr[rightPos]) <= 0) {
				tempArr[index++] = arr[leftPos++];
			} else {
				tempArr[index++] = arr[rightPos++];
			}
		}

		while (leftPos <= middle) {
			tempArr[index++] = arr[leftPos++];
		}
		while (rightPos <= high) {
			tempArr[index++] = arr[rightPos++];
		}

		for (int i = 0; i < index; i++) {
			arr[low + i] = tempArr[i];
		}

		
	}

}
