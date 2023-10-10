package com;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int num=sc.nextInt();
int fn=num;
		int rem, div, res=0;
		while(num>0) {
		rem=num%10;
		div=num/10;
		num=div;
		res=res+(rem*rem*rem);
		System.out.println("num: "+num);
			}
		if(fn==res) {
		System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}
	}

}
