package com.example.RestCrud.SbRestCrudDemo9;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class RestJpaDemo {
	
	private EmployeeService empService;

	@Autowired
	public RestJpaDemo(EmployeeService empService) {
		super();
		this.empService = empService;
	}
	
	@GetMapping("/employees")
	public List<Employee> something()
	{
		return empService.findAll();
	}
	
	@GetMapping("/employees/{employeeId}")
	public Employee getemployee(@PathVariable int employeeId)
	{
		Employee employee =  empService.findById(employeeId);
		if(employee==null)
		{
			throw new RuntimeException("Employee id not found"+employeeId);
		}
		
		return employee;
		
	}
	
	@PostMapping("/employees")
	//RequestBody is to receive Json data
	public Employee addemployee(@RequestBody Employee theEmpId)
	{
		//Also just in case they pass an id in json.....set id to 0
		//this is to force save of new item. instead of update
		
		theEmpId.setId(0);
		Employee theEmp= empService.save(theEmpId);
		return theEmp;
		
	}
	
	@PutMapping("/employees")
	//RequestBody is to receive Json data
	public Employee updateemployee(@RequestBody Employee theEmpId)
	{
		Employee theEmp= empService.save(theEmpId);
		return theEmp;
		
	}
	
	@DeleteMapping("/employees/{employeeId}")
	public String deleteemployee(@PathVariable int employeeId)
	{
		Employee employee =  empService.findById(employeeId);
		if(employee==null)
		{
			throw new RuntimeException("Employee id not found"+employeeId);
		}
		empService.deleteById(employeeId);
		return "deleted employee id"+employeeId;	
	}

}
