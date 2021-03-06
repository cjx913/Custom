package com.cjx913.sorter.test;

import java.util.Arrays;
import java.util.Random;

import javax.security.auth.Subject;

import com.cjx913.sorter.*;

public class MainTest {
	public static void main(String[] args) {
		System.out.println("************原数组*****************");
		int length = 1000;
		Student[] list = new Student[length];
		Random ra = new Random();
		for (int i = 0; i < length; i++) {
			list[i] = new Student("student" + (i + 1), ra.nextInt(length) + 1);
		}
		System.out.println(Arrays.toString(list));
		System.out.println("************原数组*****************");
		System.out.println("");

//		System.out.println("************冒泡排序*****************");
//		long start1 = System.currentTimeMillis();
//
//		Student[] arr1 = list;
//		SortUtil.sort(arr1, new BubbleSorter());
//
//		long end1 = System.currentTimeMillis();
//
//		System.out.println(Arrays.toString(arr1));
//		System.out.println("用时：" + (end1 - start1));
//		System.out.println("************冒泡排序*****************");
//		System.out.println("");
//
//		System.out.println("************快速排序*****************");
//		long start2 = System.currentTimeMillis();
//
//		Student[] arr2 = list;
//		SortUtil.sort(arr2, new QuickSorter());
//
//		long end2 = System.currentTimeMillis();
//
//		System.out.println(Arrays.toString(arr2));
//		System.out.println("用时：" + (end2 - start2));
//		System.out.println("************快速排序*****************");
//		System.out.println("");
//
//		System.out.println("************插入排序*****************");
//		long start3 = System.currentTimeMillis();
//
//		Student[] arr3 = list;
//		SortUtil.sort(arr3, new InsertionSorter());
//
//		long end3 = System.currentTimeMillis();
//
//		System.out.println(Arrays.toString(arr3));
//		System.out.println("用时：" + (end3 - start3));
//		System.out.println("************插入排序*****************");
//		System.out.println("");

//		System.out.println("************希尔排序*****************");
//		long start4 = System.currentTimeMillis();
//
//		Student[] arr4 = list;
//		SortUtil.sort(arr4, new ShellSorter());
//
//		long end4 = System.currentTimeMillis();
//
//		System.out.println(Arrays.toString(arr4));
//		System.out.println("用时：" + (end4 - start4));
//		System.out.println("************希尔排序*****************");
//		System.out.println("");

//		System.out.println("************选择排序*****************");
//		long start5 = System.currentTimeMillis();
//
//		Student[] arr5 = list;
//		SortUtil.sort(arr5, new SelectSorter());
//
//		long end5 = System.currentTimeMillis();
//
//		System.out.println(Arrays.toString(arr5));
//		System.out.println("用时：" + (end5 - start5));
//		System.out.println("************选择排序*****************");
//		System.out.println("");

//		System.out.println("************归并排序*****************");
//		long start6 = System.currentTimeMillis();
//
//		Student[] arr6 = list;
//		SortUtil.sort(arr6, new MergeSorter());
//
//		long end6 = System.currentTimeMillis();
//
//		System.out.println(Arrays.toString(arr6));
//		System.out.println("用时：" + (end6 - start6));
//		System.out.println("************归并排序*****************");
//		System.out.println("");
	}
}