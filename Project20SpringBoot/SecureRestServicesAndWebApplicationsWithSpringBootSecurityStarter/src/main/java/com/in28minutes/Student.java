package com.in28minutes;

import java.util.List;

public class Student {
	private String id;
	private String name;
	private String description;
	private List<Course> courses;

	public Student(){}

	public Student(String name, String id, String description, List<Course> courses) {
		this.name = name;
		this.id = id;
		this.description = description;
		this.courses = courses;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", courses=" + courses +
				'}';
	}
}