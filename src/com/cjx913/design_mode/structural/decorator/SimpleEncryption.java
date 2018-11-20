package com.cjx913.design_mode.structural.decorator;

public class SimpleEncryption extends Encryption {
	@Override
	public String encipher(String str) {
		int offset = 3;
		for (int i = 0; i < str.length(); i++) {
			int n = (int) str.charAt(i) + offset;
			if (n >= 48 + offset && n <= 57) {
				str = str.replace(str.charAt(i), (char) (n));
			}
			if (n > 57 && n <= 57 + offset) {
				str = str.replace(str.charAt(i), (char) (n - 58+48));
			}
			if (n >= 65 + offset && n <= 90) {
				str = str.replace(str.charAt(i), (char) (n));
			}
			if (n > 90 && n <= 90 + offset) {
				str = str.replace(str.charAt(i), (char) (n - 91+65));
			}
			if (n >= 97 + offset && n <= 122) {
				str = str.replace(str.charAt(i), (char) (n));
			}
			if (n>122&&n<=122+offset) {
				str = str.replace(str.charAt(i), (char) (n-123+97));
			}
		}
		return str;
	}
}
