package com.example.io.SbIOC;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;


@Repository
public class StudentDAOImpl implements StudentDAO {

	private EntityManager entity;
	
	
	public StudentDAOImpl() {
		super();
	}

	@Autowired
	public StudentDAOImpl(EntityManager entity) {
		super();
		this.entity = entity;
	}

	@Override
	@Transactional
	public void save(Student student) {
		entity.persist(student);

	}

	@Override
	public Student findById(Integer id) {
		return entity.find(Student.class,id);
		
	}

	@Override
	public List<Student> findAll() {
		
		TypedQuery<Student> theQuery =  entity.createQuery("from Student",Student.class);
		return theQuery.getResultList();
	}

	@Override
	public List<Student> findLastName(String theLastName) {
		TypedQuery<Student> theQuery =  entity.createQuery("from Student where last_name=:theData",Student.class);
		theQuery.setParameter("theData", theLastName);
		return theQuery.getResultList();
	}


	@Override
	@Transactional
	public void update(Student theStudent) {

		 entity.merge(theStudent);

	}

	@Override
	@Transactional
	public void delete(Integer id) {
		Student theStud = entity.find(Student.class,id);
		entity.remove(theStud);
	
		
	}

	@Override
	@Transactional
	public int deleteAll() {
		int result = entity.createQuery("Delete from Student").executeUpdate();
		return result;
	}

	

}
