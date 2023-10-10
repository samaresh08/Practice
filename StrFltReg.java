package com;

public class StrFltReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dirtyString = "/12asdAA1@#!%$^&*&_+,/.-();'/";
		String str = dirtyString.replaceAll("[^a-zA-Z0-9/_-]","");
		
		System.out.println(str);
	}

}
