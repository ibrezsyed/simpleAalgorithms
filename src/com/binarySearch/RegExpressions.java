package com.binarySearch;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressions {

	public static void main(String[] args) {

		String s= "ABCDEFG14HI6JKLMN4";
		String regExp = "[0-9]+";
		
		Pattern p = Pattern.compile(regExp);
		Matcher m = p.matcher(s);
		
		while(m.find()){
			System.out.println(m.group());
		}
		
		if(m.find()){
			System.out.println(m.group());
		}
		
		
		
		System.out.println(s);
	}

}
