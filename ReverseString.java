package com;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "reverse";
String str1= "reverse me";
StringBuilder sb = new StringBuilder(str);
StringBuilder sbNew = new StringBuilder();
String strRev = sb.reverse().toString();
System.out.println(strRev);
char[] chr=str.toCharArray();
for(int i=str.length()-1; i>=0; i--) {
	sbNew.append(chr[i]);
}
System.out.println(sbNew);

String[] strArray = str1.split(" ");
for(int i=strArray.length-1; i>=0; i--) {
	System.out.print(strArray[i]+" ");
}

	}

}
