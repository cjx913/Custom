package com.cjx913.sorter;

import java.util.Comparator;

public class ShellSorter implements Sorter {

	@Override
	public <T extends Comparable<T>> void sort(T[] arr) {
		for(int d=arr.length/2;d>0;d/=2) {
			for(int i=d;i<arr.length;i++) {
				for(int j=i-d;j>=0;j-=d) {
					if(arr[j].compareTo(arr[j+d])>0) {
						T temp = arr[j];
						arr[j] = arr[j+d];
						arr[j+d] = temp;
					}
				}
			}
		}

	}

	@Override
	public <T> void sort(T[] arr, Comparator<T> comparator) {
		for(int d=arr.length/2;d>0;d/=2) {
			for(int i=d;i<arr.length;i++) {
				for(int j=i-d;j>=0;j-=d) {
					if(comparator.compare(arr[j],arr[j+d])>0) {
						T temp = arr[j];
						arr[j] = arr[j+d];
						arr[j+d] = temp;
					}
				}
			}
		}

	}

}
