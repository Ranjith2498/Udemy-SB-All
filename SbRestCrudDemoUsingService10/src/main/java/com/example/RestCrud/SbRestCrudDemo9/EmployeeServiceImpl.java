package com.example.RestCrud.SbRestCrudDemo9;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDAO empDao;
	
	public EmployeeServiceImpl(EmployeeDAO empDao) {
		super();
		this.empDao = empDao;
	}


	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return empDao.findAll();
	}


	@Override
	public Employee findById(int theId) {
		
		return empDao.findById(theId);
	}

	@Transactional
	@Override
	public Employee save(Employee theemployee) {
		return empDao.save(theemployee);
	}

	@Transactional
	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		empDao.deleteById(theId);
	}
	
}
