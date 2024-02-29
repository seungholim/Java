package com.kh.practice;

import java.util.ArrayList;
import java.util.List;

import com.kh.comparable.Person;
//�̾�
public class Student implements Comparable<Student> {
	
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("�����", 19));
		people.add(new Person("���ڰ�", 20));
		people.add(new Person("�ȳ���", 17));
	}
	
	@Override
	public int compareTo(Student otherStudent) {
	//���̸� �������� ��
		return this.age - otherStudent.age;
	}
	
	@Override
	public String toString() {
		return "Student name=" + name+", age= " + age ;
	}
}
