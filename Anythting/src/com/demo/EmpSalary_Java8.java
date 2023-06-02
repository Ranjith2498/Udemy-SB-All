package com.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpSalary_Java8 {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<>();
		
		al.add(new Employee(1,"Ranjith",20000));
		al.add(new Employee(2,"Vikas",30000));
		al.add(new Employee(3,"Vignhesh",40000));
		al.add(new Employee(4,"Sharath",10000));
		
//		for(Object i: al)
//		{
//			System.out.println(i);
//		}
		
		List<Employee> sal20kPlus = al.stream().filter(a->a.getSalary()>=20000).collect(Collectors.toList());
		System.out.println("Salary > 20K = "+sal20kPlus);
		
//		Optional<Integer> maxSal = al.stream().map(sal->sal.getSalary()).sorted(Comparator.reverseOrder()).skip(1).findFirst();
//		System.out.println(maxSal);
		
		Integer maxSal = al.stream().map(sal->sal.getSalary()).reduce((a,b)->a>b?a:b).get();
		System.out.println("Max salary "+maxSal);
		
		List<Employee> aa = al.stream().filter(a->a.getSalary()==maxSal).collect(Collectors.toList());
		System.out.println("Employee havinf max salary = "+aa);
		
		Integer maxSal1 = al.stream().map(sal->sal.getSalary()).max((a,b) -> a.compareTo(b)).get();
		System.out.println(maxSal1);
		
		
	}

}


class Employee{
	private int id;
	private String name;
	private int Salary;
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}	
	
}