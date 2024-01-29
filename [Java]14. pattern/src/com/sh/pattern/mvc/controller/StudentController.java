package com.kh.pattern.mvc.controller;

import com.kh.pattern.mvc.Model.StudentModel;
import com.kh.pattern.mvc.View.StudentView;

public class StudentController { //����� �Է��� ó���ϴ� ��
	
	// Model�� View�� �����ϱ� ���� �ҷ��ɴϴ� (import)
	private StudentModel studentmodel;
	private StudentView studentview;

	public StudentController (StudentModel studentmodel,StudentView studentview) {
		this.studentmodel = studentmodel;
		this.studentview = studentview;
	}
	
	public void setstudentName(String name) {
		studentmodel.setName(name);
	}
	
	public void setstudentAge(int age) {
		studentmodel.setAge(age);
	}
	
	public String getstudentName() {
		return studentmodel.getName();
	}
	
	public int getstudentAge() {
		return studentmodel.getAge();
	}
	
	public void updateView() {
		studentview.displayInfo(studentmodel.getName(), studentmodel.getAge());
	}

}