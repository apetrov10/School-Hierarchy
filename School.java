package com.apetrov10.school;

import java.util.ArrayList;
import java.util.List;

class School {
	private String name;
	private ArrayList<Teacher> teachers;
	private ArrayList<Group> groups;
	private ArrayList<Student> students;
	
	School(String name){
		this.name = name;
		teachers = new ArrayList<Teacher>();
		groups = new ArrayList<Group>();
		students = new ArrayList<Student>();
	}
	
	private String getName(){
		return this.name;
	}
	
	private ArrayList<Teacher> getTeachers(){
		return this.teachers;
	}
	
	private ArrayList<Group> getGroups(){
		return this.groups;
	}
	
	private ArrayList<Student> getStudents(){
		return this.students;
	}
	
	private void addTeacher(Teacher teacher){
		teachers.add(teacher);
	}
	
	private void addGroup (Group group){
		groups.add(group);
	}
	
	public static void main(String[] args){
		School school1 = new School("���� ��������");
		
		Teacher teacher1 = new Teacher("����", "������");
		Teacher teacher2 = new Teacher("�����", "������");
		Teacher teacher3 = new Teacher("������", "��������");
		
		Group group1 = new Group("��������� ����");
		Group group2 = new Group("����������");
		Group group3 = new Group("��������� ����");
		Group group4 = new Group("������");
		
		Student stud1 = new Student("�����", "�������");
		Student stud2 = new Student("������", "��������");
		Student stud3 = new Student("�����", "�������");
		Student stud4 = new Student("���������", "�����������");
		Student stud5 = new Student("�����", "�������");
		Student stud6 = new Student("��������", "����������");
		Student stud7 = new Student("��������", "����������");
		
		school1.addTeacher(teacher1);
		school1.addTeacher(teacher2);
		school1.addTeacher(teacher3);
		school1.addGroup(group1);
		school1.addGroup(group2);
		school1.addGroup(group3);
		school1.addGroup(group4);
		
		teacher1.addGroup(group1);
		teacher2.addGroup(group2);
		teacher2.addGroup(group4);
		teacher3.addGroup(group3);
		
		group1.addStudent(stud1);
		group2.addStudent(stud2);
		group1.addStudent(stud3);
		group2.addStudent(stud4);
		group3.addStudent(stud5);
		group4.addStudent(stud6);
		group3.addStudent(stud7);
		
		ArrayList<Group> testGroup = school1.getGroups();
		for (Group i : testGroup){
			System.out.println(i.getName());
		}
		ArrayList<Teacher> testTeacher = school1.getTeachers();
		for (Teacher i : testTeacher){
			i.getTeacher();
		}
		ArrayList<Student> testGroups = group1.getStudents();
		System.out.println(group1.getName());
		for (Student i : testGroups){
			System.out.println(i.getName());
		}
	}
}
