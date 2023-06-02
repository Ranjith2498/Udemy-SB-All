package com.example.RestCrud.SbRestCrudDemo9;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;


@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {
	
	private EntityManager entity;
	
	@Autowired
	public EmployeeDAOJpaImpl(EntityManager entity) {
		super();
		this.entity = entity;
	}

	@Override
	public List<Employee> findAll() {
		Query empList = entity.createQuery("from Employee",Employee.class);
		List<Employee> employees = empList.getResultList();
		return employees;
	}

	@Override
	public Employee findById(int theId) {
		Employee theEmployee = entity.find(Employee.class, theId);
		return theEmployee;
	}

	@Override
	public Employee save(Employee theemployee) {
		Employee dbEmployee = entity.merge(theemployee);
		return dbEmployee;
	}

	@Override
	public void deleteById(int theId) {
		Employee removeEmployee = entity.find(Employee.class,theId);
		entity.remove(removeEmployee);
	}

}
