package com.example.io.SbIOC;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDemo {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemo.class, args);}
		
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
	return runner -> {
//		createStudent(studentDAO);
//		readStudent(studentDAO);
//		queryForStudents(studentDAO);
//		queryForStudentsLastname(studentDAO);
//		updateStudent(studentDAO);
//		deleteStudent(studentDAO);
		deleteAll(studentDAO);
	};}
	
	private void deleteAll(StudentDAO studentDAO) {
		System.out.println("Deleting all emtries");
		int entry = studentDAO.deleteAll();
		System.out.println("Deleted row count "+entry);
	}

	private void deleteStudent(StudentDAO studentDAO) {

		int act_id=2;
		System.out.println("Deleteing the student id "+act_id);
		studentDAO.delete(act_id);
		System.out.println("Student with id "+act_id+" is deleted");
	}

	private void updateStudent(StudentDAO studentDAO) {
		
		// retrieve student based on the id: primary key
		int studentId = 1;
		System.out.println("Getting student with id: " + studentId);
		Student myStudent = studentDAO.findById(studentId);
		System.out.println("Updating student...");
		
		// change first name to "Scooby"
		myStudent.setFirst_name("Scooby");
		studentDAO.update(myStudent);
		
		// display updated student
		System.out.println("Updated student: " + myStudent);
	}

	private void queryForStudentsLastname(StudentDAO studentDAO) {
		
		// get list of students
		List<Student> theStudents = studentDAO.findLastName("Duck");
		
		// display list of students
		for (Student tempStudent : theStudents) 
		{
			System.out.println(tempStudent);		
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {
		
		// get list of students
		List<Student> theStudents = studentDAO.findAll();
		
		// display list of students
		for (Student tempStudent : theStudents) 
		{
			System.out.println(tempStudent);		
		}
	}
	private void readStudent(StudentDAO studentDAO) {

		// create the student object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Daffy", "Duck", "daffy@luv2code.com");
		
		// save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);
		
		// display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());
		
		// retrieve student based on the id: primary key
		System.out.println("\nRetrieving student with id: " + tempStudent.getId());
		Student myStudent = studentDAO.findById(tempStudent.getId());
		System.out.println("Found the student: " + myStudent);
		
	}

	private void createStudent(StudentDAO studentDAO) 
	{
		// create the student object
		System.out.println("Creating new student object...");	
		Student tempStudent = new Student("Paul", "Doe", "paul@luv2code.com");
		Student tempStudent1 = new Student("Ranjith", "Kumar", "rk@gmail.com");
		
		// save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);
		studentDAO.save(tempStudent1);
		
		// display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());
	}
}