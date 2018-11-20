package com.cjx913.algorithm;

/**
 * 求解两字符串的最大公共子序列（不连续）
 * 
 * @author cjx913
 *
 */
public class LCS {
	public int findLCS(String A, String B) {
		int n = A.length();
		int m = B.length();
		char[] a = A.toCharArray();
		char[] b = B.toCharArray();
		int[][] dp = new int[n][m];
		for (int i = 0; i < n; i++) {// 第一列
			if (a[i] == b[0]) {
				dp[i][0] = 1;
				for (int j = i + 1; j < n; j++) {
					dp[j][0] = 1;
				}
				break;
			}
		}

		for (int i = 0; i < m; i++) {// 第一行
			if (a[0] == b[i]) {
				dp[0][i] = 1;
				for (int j = i + 1; j < m; j++) {
					dp[0][j] = 1;
				}
				break;
			}
		}
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				if (a[i] == b[j]) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		return dp[n - 1][m - 1];
	}
}
