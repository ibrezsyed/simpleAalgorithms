package com.example;

public class TestThread {

	public static void main(String[] args) throws InterruptedException {

		DemoThread d1 =  new DemoThread();
		Thread t = new Thread(d1);
		t.start();
		t.sleep(100);
//		for(int i=0;i<=5;i++)
//		{
//			System.out.println("i  Value:"+i);
//		}
		DemoThreadExtends dt = new DemoThreadExtends();
		dt.start();
		dt.sleep(500);
		
//		for(int i=0;i<=10;i++)
//		{
//			System.out.println("2nd Loop i Value:"+i);
//			dt.sleep(100);
//		}
	}

}
