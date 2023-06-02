package com.demo.example;

import java.util.Random;

 

 public class Exmpl {

	public static void main(String[] args) throws Exception {

		System.out.println(method());

		
	}

	private static int method() {
		// TODO Auto-generated method stub
		try { 
			return 3;
		
		}
		catch(Exception e)
		{
			return 2;
		}
		finally {
			return 1;
		}
	}

}



