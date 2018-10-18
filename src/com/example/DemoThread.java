package com.example;

public class DemoThread implements Runnable {

	@Override
	public void run() {

		System.out.println("Run()of DemoThread");
		for(int i=0;i<=3;i++)
		{
			System.out.println("i VALUE in RUNNABLE:"+i);
		}
	}
}
