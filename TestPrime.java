package com;

import java.util.Scanner;

public class TestPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		boolean bl=false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				bl=true;
				break;
			} 
		}
		
		if(bl) {
			System.out.println("Not Prime");
		}else {
				System.out.println("Prime");
			}

		
	}

}
