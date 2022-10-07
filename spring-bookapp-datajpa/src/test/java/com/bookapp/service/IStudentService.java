package com.bookapp.service;

import java.util.List;

import com.bookapp.model.Student;

public interface IStudentService {

	void addStudent(Student student);
	void updateStudent(Student student);
	void deleteStudent(int studentId);
	Student getById(int studentId);
	List<Student> getAll();
	
	List<Student> getByDepartrment(String department);
	List<Student> getByVCity(String city);
	List<Student> getByCityAndDepartment(String category,String department);
	List<Student> getByCityAndState(String city,String state);
	
}
