package com.sunbeam;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private int rollNo;
	private String name;
	private List<String> subjects;

	public Student() {
		this.rollNo = 0;
		this.name = null;
		this.subjects = new ArrayList<>();
	}

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
		this.subjects = new ArrayList<>();
	}

	public Student(int rollNo, String name, List<String> subjects) {
		this.rollNo = rollNo;
		this.name = name;
		this.subjects = new ArrayList<>(subjects);
	}

	public Student(Student other) {
		this.rollNo = other.rollNo;
		this.name = other.name;
		this.subjects = new ArrayList<>(other.subjects);
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public void addSubject(String subject) {
		subjects.add(subject);
	}

	public Student shallowCopy() {
		Student copy = new Student();
		copy.rollNo = this.rollNo;
		copy.name = this.name;
		copy.subjects = this.subjects;
		return copy;
	}

	public Student deepCopy() {
		Student copy = new Student();
		copy.rollNo = this.rollNo;
		copy.name = this.name;
		copy.subjects = new ArrayList<>(this.subjects);
		return copy;
	}

	@Override
	public String toString() {
		return "Roll No: " + rollNo + ", Name: " + name + ", Subjects: " + subjects;
	}
}
