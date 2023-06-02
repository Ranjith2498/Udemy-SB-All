package com.demo.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class Example1 {

	public static void main(String[] args) {
	
		String s = "venkatesh";
		
		Map<Character,Integer> hm = new LinkedHashMap<>();
		int i,j;
		
		for(i=0;i<s.length();i++)
		{
			int count=0;
			for(j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
//			System.out.println("Hi");
			hm.put(s.charAt(i),count);
		}
		
		for(Map.Entry<Character,Integer> mp:hm.entrySet())
		{
			System.out.println(mp.getKey()+" "+mp.getValue());
		}
		
//		int a =10;
//		int b =20;
//		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		
//		System.out.println(a);
//		System.out.println(b);
		
	}

}
