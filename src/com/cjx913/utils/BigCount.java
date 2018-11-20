package com.cjx913.utils;

/**
 * 大数运算
 * 
 * @author cjx913
 *
 */
public class BigCount {
	/**
	 * 两个大数相加
	 * 
	 * @param a
	 * @param b
	 * @return a+b
	 * @throws Exception
	 */
	public String plus(String a, String b) throws Exception {

		checkString(a);
		checkString(b);

		if (a.length() < b.length()) {
			String temp = a;
			a = b;
			b = temp;
		}
		
		int al = a.length();
		int bl = b.length();
		boolean flag = false;
		StringBuilder builder = new StringBuilder();
		while (bl > 0) {
			int i = Integer.parseInt(String.valueOf(a.charAt(--al))) + Integer.parseInt(String.valueOf(b.charAt(--bl)));
			i = flag ? i + 1 : i;
			flag = i >= 10 ? true : false;
			builder.append(String.valueOf(i % 10));
		}
		while (al > 0) {
			int i = Integer.parseInt(String.valueOf(a.charAt(--al)));
			i = flag ? i + 1 : i;
			flag = i >= 10 ? true : false;
			builder.append(String.valueOf(i % 10));
		}
		if (flag) {
			builder.append("1");
			return reverse(builder.toString());
		} else {
			return reverse(builder.toString());
		}
	}

	/**
	 * 两个大数相减
	 * 
	 * @param a
	 * @param b
	 * @return a-b
	 * @throws Exception
	 */
	public String minus(String a, String b) throws Exception {
		checkString(a);
		checkString(b);
		
		if(a.equals(b)) {
			return "0";
		}
		
		boolean isNegative = false;
		if (a.length() < b.length() || (a.length() == b.length() && a.charAt(0) < b.charAt(0))) {
			String str = a;
			a = b;
			b = str;
			isNegative = true;
		}
		
		int al = a.length();
		int bl = b.length();
		StringBuilder builder = new StringBuilder();
		boolean flag = false;
		int i;
		while (bl > 0) {
			int m = Integer.parseInt(String.valueOf(a.charAt(--al)));
			int n = Integer.parseInt(String.valueOf(b.charAt(--bl)));
			m = flag?m-1:m;
			if (m < n) {
				i = m+10-n;
				flag = true;
			}else {
				i = m-n;
				flag = false;
			}
			builder.append(String.valueOf(i));
		}
		while (al > 0) {
			int m = Integer.parseInt(String.valueOf(a.charAt(--al)));
			m = flag?m-1:m;
			if(m<0) {
				i = m+10;
				flag = true;
			}else {
				i = m;
				flag = false;
			}
			builder.append(String.valueOf(i));
		}
		while(builder.charAt(builder.length()-1)=='0') {
			builder.deleteCharAt(builder.length()-1);
		}
		return isNegative?"-"+reverse(builder.toString()):reverse(builder.toString());
	}

	/**
	 * 两个大数相乘
	 * 
	 * @param a
	 * @param b
	 * @return a*b
	 * @throws Exception
	 */
	public String multiply(String a, String b) throws Exception {

		checkString(a);
		checkString(b);

		if (a.equals("0") || b.equals("0")) {
			return "0";
		}
		a = reverse(a);
		b = reverse(b);
		int al = a.length();
		int bl = b.length();
		// 两数乘积位数不会超过乘数位数和+ 3位
		int csize = al + bl + 3;
		// 开辟乘积数组
		int[] result = new int[csize];
		// 对齐逐位相乘
		for (int j = 0; j < bl; j++) {
			for (int i = 0; i < al; i++) {
				result[i + j] += Integer.parseInt(String.valueOf(a.charAt(i)))
						* Integer.parseInt(String.valueOf(b.charAt(j)));
			}
		}
		int m = 0;
		// 进位处理
		for (m = 0; m < csize; m++) {
			int carry = result[m] / 10;
			result[m] = result[m] % 10;
			if (carry > 0)
				result[m + 1] += carry;
		}
		// 找到最高位
		for (m = csize - 1; m >= 0;) {
			if (result[m] > 0)
				break;
			m--;
		}

		// 从高位开始记录结果
		StringBuilder builder = new StringBuilder();
		for (int n = 0; n <= m; n++) {
			builder.append(result[m - n]);
		}
		return builder.toString();
	}

	/**
	 * 检查字符的输入是否合法
	 * 
	 * @param str
	 * @throws Exception
	 */
	private void checkString(String str) throws Exception {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < '0' || str.charAt(i) > '9') {
				throw new Exception("输入字符不正确，请输入纯数字字符");
			}
		}
	}

	/***
	 * 字符串反转
	 * 
	 * @param str
	 * @return
	 */
	private String reverse(String str) {
		if (str == null || str.length() <= 1) {
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}
}
