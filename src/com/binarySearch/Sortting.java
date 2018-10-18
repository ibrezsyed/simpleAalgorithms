package com.binarySearch;

public class Sortting {

	int temp = 0;
	
	int a[] = {100,5,8,12,59};
	int len = a.length;
	
	public void sort()
	{
	for(int i=0;i<=len-1;i++)
	{
		for(int j=i+1;j<=len-1;j++)
		{
			if(a[i]>a[j])
			{
				temp= a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	for(int i=0;i<=len-1;i++)
	{
	System.out.println(a[i]);
	}
	}
	
	public static void main(String[] args) {

		Sortting s=new Sortting();
		s.sort();
	}
}
