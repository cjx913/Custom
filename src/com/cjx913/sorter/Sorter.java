package com.cjx913.sorter;

import java.util.Comparator;

public interface Sorter {
	public <T extends Comparable<T>> void sort(T[] arr);

	public <T> void sort(T[] list, Comparator<T> arr);
}
