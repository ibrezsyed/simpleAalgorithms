package com.example;

public class TestComparable {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("Html", 350);
		Book b2 = new Book("Css", 250);
		Book b3 = new Book("JavaScript", 100);
		Book temp;
		System.out.println(b2.compareTo(b1));
		System.out.println(b1.equals(b2));
		
		System.out.println("Book B1 b4 comparision:"+b1.pages);
		TestComparator tc = new TestComparator();
		int i = tc.compare(b1, b2);
		if(i>0)
		{
			temp=b1;
			b1=b2;
			b2=temp;
		}
		System.out.println("BookB1:"+b1.pages);
//		System.out.println("COMPARATOR:"+tc.compare(b1, b2));
	}
}
