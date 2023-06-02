package com.demo.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> b = Arrays.asList(3,2,12,56,78,19);
		System.out.println(b.stream().filter(e->e%2!=0).reduce((c,d)->c+d).get());
		
		System.out.println(Stream.of(3,2,12,56,78,19).filter(a-> a%2!=0).reduce((a,f)->a+f).get());
		
		ArrayList<User> al = new ArrayList<>();
		
		
//		Optinal<Student>=al.stream().map(a-?getName()).sorted().collect(Collectors.toList());
		
		
		
		
		
	}

}
