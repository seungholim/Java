package com.kh.example.practice4.model.vo;

public class Student {
	
	//1.�������
	
	int grade;
	int classroom;
	String name;
	double height;
	char gender;
	
	//2.������ Student()
	
	public Student() { 
		// �ʱ�ȭ ���� �̿��� �� �л����� �ʵ� �ʱ�ȭ (�ʱ�ȭ��{})
		grade = 3;
		classroom = 2;
		name = "�ֻ���";
		height = 168.3;
		gender = '��';
	}
	
	
	//3.��� �޼��� + information() : void
	
	public void information() {
		System.out.println("< " + name + " �л� ���� >\n" );
		System.out.println(grade + "�г� " + classroom + "��");
		System.out.println("���� : " + gender);
		System.out.println("Ű : " + height + "cm");
	}

}