package com.binarySearch;

public class BinarySearch {

	//RETURNS THE INDEXOF KEY ELEMENT
	//CONDITION: THE GIVEN ARRAY SHOULD  BE SORTED IN ASC ORDER
	
	int binarySearch(int[] a,int key,int low,int high){
		
		if(low>high){
			return -1;
		}
		int mid = low+(low+high/2);
		if(a[mid]==key){
			return mid;
		}
		else if(key<a[mid]){
			binarySearch(a, key, low, mid-1);
		}
		else{
			binarySearch(a,key,mid+1,high);
		}
		return mid;
	}
	
	public static void main(String[] args) {
		
		BinarySearch b =  new  BinarySearch();
		int a[] = {25,50,75,76,120};
		System.out.println(b.binarySearch(a, 50, 0, a.length-1));
	}
}
