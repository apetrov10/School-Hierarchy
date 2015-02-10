package com.apetrov10.school;

class Student {
	private String name;
	private String family;
	
	Student(String name, String family){
		this.name = name;
		this.family = family;
	}
	
	public String getName(){
		return this.name + " " + this.family;
	}
}
