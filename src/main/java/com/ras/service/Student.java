package com.ras.service;

public class Student {

	StudentService studentService;
	
	public int getAverageMarks() {
		return studentService.getTotalMarks() / studentService.getTotalStudents();
	}
	
	public Student(StudentService studentService){
		this.studentService = studentService;
	}
}
