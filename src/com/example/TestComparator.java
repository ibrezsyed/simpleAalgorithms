package com.example;

import java.util.Comparator;

public class TestComparator implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		
		if(b1.pages>b2.pages)
		{
			return 1;
		}
		else if(b1.pages<b2.pages)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
