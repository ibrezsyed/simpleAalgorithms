package com.binarySearch;

public class StringReverseAndPalindrome {
	public static void main(String[] args) {
		String s= "i am adeveloperiirepoleveda ma i";
		String rev ="";
		
		for (int i = s.length()-1; i >= 0; i--) {
			
			rev += s.charAt(i);
			
		}
		System.out.println(rev);
		
		if(s.matches(rev)){
			System.out.println("String is  Palindrome");
		}else{
			System.out.println("String is not  palindrome");
		}
	}
}
