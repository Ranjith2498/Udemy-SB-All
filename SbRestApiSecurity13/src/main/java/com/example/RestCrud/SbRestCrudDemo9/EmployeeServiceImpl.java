package com.example.RestCrud.SbRestCrudDemo9;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}


	@Override
	public Employee findById(int theId) {
		Optional<Employee> result = employeeRepository.findById(theId);
		Employee employee = null;
		if(result.isPresent())
		{
			employee=result.get();
		}
		else
		{
			throw new RuntimeException("Did not find employee id "+theId);
		}
		return employee;
	}


	@Override
	public Employee save(Employee theemployee) {
		return employeeRepository.save(theemployee);
	}


	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(theId);
	}
	
}
