package com.demo;

public class Fibonacci {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		int a=0,b=0,sum = 1,i,j;
//		System.out.println(a+"\n"+sum+" ");
//		for(i=0;i<10;i++)
//		{
//			a=b;
//			b=sum;
//			sum=a+b;
//			System.out.println(sum+" ");
//		}
		
//		int a=0,b=1,sum = 1,i,j;
//		for(i=0;i<10;i++)
//		{
//			a=b;
//			b=sum;
//			sum=a+b;
//			System.out.println(sum+" ");
//		}
		
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().join();
		System.out.println(Thread.currentThread().getName());
		

	}

}
