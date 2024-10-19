package com.example.product.entity;

public class ReplaceStar {
	
	public static void main(String[] args) {
		StringBuilder sb = changeStar("leet**cod*e");
		System.out.println(sb);
	}

	public static StringBuilder changeStar(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '*') {
				sb.deleteCharAt(sb.length() - 1);
			}else {
				sb.append(s.charAt(i));
			}
		}
		return sb;
	}
}
