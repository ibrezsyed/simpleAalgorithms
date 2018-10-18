package com.example;

public class Book implements Comparable<Book>{

	String name = null;
	int pages =  0;
	
	Book(String name,int pages)
	{
		this.name= name;
		this.pages= pages;
	}

	@Override
	public int compareTo(Book b1) {
		
		if(this.pages>b1.pages)
		{
			return 1;
		}
		else if(this.pages<b1.pages)
		{
			return -1;
		}
		else
		{
		return 0;
		}
	}
}