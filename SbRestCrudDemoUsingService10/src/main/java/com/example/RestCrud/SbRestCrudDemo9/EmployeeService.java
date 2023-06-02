package com.example.RestCrud.SbRestCrudDemo9;

import java.util.List;

public interface EmployeeService {
	
	List<Employee> findAll();
	Employee findById(int theId);
	Employee save(Employee theemployee);
	void deleteById(int theId);

}
