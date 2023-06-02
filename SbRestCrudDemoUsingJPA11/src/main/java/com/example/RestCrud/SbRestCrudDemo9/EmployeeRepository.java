package com.example.RestCrud.SbRestCrudDemo9;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
