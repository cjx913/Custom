package com.cjx913.algorithm;

/**
 * KMP算法模式匹配
 * 
 * @author cjx913
 *
 */
public class KMPPatternMatching {
	private int[] getNext(String string) {
		char[] c = string.toCharArray();
		int[] next = new int[c.length];
		next[0] = -1;
		int i = 0, j = -1;
		while (i < c.length - 1) {
			if (j == -1 || c[i] == c[j]) {
				j++;
				i++;
				if (c[i] == c[j]) {
					next[i] = next[j];
				} else {
					next[i] = j;
				}
			} else {
				j = next[j];
			}
		}
		return next;
	}

	public int kmpPatternMatching(String ts, String ps) {
		char[] t = ts.toCharArray();
		char[] p = ps.toCharArray();
		int i = 0;
		int j = 0;
		int[] next = getNext(ps);
		while (i < t.length && j < p.length) {
			if (j == -1 || t[i] == p[j]) {
				i++;
				j++;
			} else {
				j = next[j];
			}
		}
		if (j == p.length) {
			return i - j;
		} else {
			return -1;
		}
	}
}
