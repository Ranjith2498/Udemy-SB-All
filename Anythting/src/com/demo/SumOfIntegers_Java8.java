package com.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class SumOfIntegers_Java8 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5, 4, 10, 12, 87, 33, 75);
		
		System.out.println(Stream.of(5, 4, 10, 12, 87, 33,99, 75).max((a,b)->a.compareTo(b)).get());
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter nth highest number : ");
		int n = scan.nextInt();
		Integer sum = numbers.stream().sorted(Comparator.reverseOrder()).skip(n-1).findFirst().get();
		System.out.println(sum);
		
		System.out.println("Local date : "+LocalDate.now());
		System.out.println("Local time : "+LocalTime.now());
		System.out.println("Local date time : "+LocalDateTime.now());
		
		LocalDate today = LocalDate.now();
		LocalDate someday = LocalDate.of(2010,8,24);
		
	}

}
