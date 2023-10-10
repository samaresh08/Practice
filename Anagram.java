package com;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String str = sc.next();
		System.out.println("Enter second string");
		String str1 = sc.next();

		char[] strAr = str.toCharArray();
		char[] strAr1 = str.toCharArray();
		Arrays.sort(strAr);
		Arrays.sort(strAr1);
		if (String.valueOf(strAr).equalsIgnoreCase(String.valueOf(strAr1))) {
			System.out.println("True");

		} else {
			System.out.println("False");
		}

	}

}
