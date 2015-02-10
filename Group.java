package com.apetrov10.school;

import java.util.ArrayList;
import java.util.List;

class Group {
	private String name;
	private ArrayList<Student> Students= new ArrayList<Student>();
	
	Group(String name){
		this.name = name;
		//ArrayList<Student> Students 
	}
	protected void addStudent(Student stud){
		Students.add(stud);
	}
	protected ArrayList<Student> getStudents(){
		return this.Students;
	}
	protected String getName(){
		return this.name;
	}
}
