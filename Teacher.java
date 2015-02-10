package com.apetrov10.school;

import java.util.ArrayList;
import java.util.List;

class Teacher {
	private String name;
	private String lastName;
	private ArrayList<Group> groups = new ArrayList<Group>();
	
	Teacher(String name, String lastName){
		this.name = name;
		this.lastName = lastName;
	}
	
	protected void addGroup(Group group){
		groups.add(group);
	}
	
	private String getName(){
		return this.name + " " + this.lastName;
	}
	private void getGroups(){
		for (Group i : groups){
			System.out.println(i.getName());
		}
	}
	
	protected void getTeacher(){
		System.out.println(this.getName());
		System.out.println("------");
		this.getGroups();
		System.out.println();
	}
}
