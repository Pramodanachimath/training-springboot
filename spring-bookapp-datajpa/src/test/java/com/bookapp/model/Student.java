package com.bookapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Student {

	@Column(length = 20)
	private String name;
	@Id
	@GeneratedValue(generator = "stud_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "stud_gen",initialValue = 1,allocationSize = 1)
	private Integer studentId;
	@Column(length = 20)
	private String department;
	private Adress adress;
	public Student() {
		super();
	}
	
	public Student(String name, String department, Adress adress) {
		super();
		this.name = name;
		this.department = department;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", studentId=" + studentId + ", department=" + department + "]";
	}
	
	
}
