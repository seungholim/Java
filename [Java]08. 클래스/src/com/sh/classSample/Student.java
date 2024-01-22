package com.kh.classSample;

public class Student {
	//1. ������� (�л��� �Ӽ�)
	String name; //�л����� �̸�
	int age; //�л����� ����
	String grade; //�л����� �г�
	
	/***** ������ (�޼��� �� �Ϻ�) *****/
	public Student(String name, int age, String grade) {//�л����� �ʱ�ȭ
		this.name = name;
		this.age = age; //
		this.grade = grade;
	}
	
	//2. �л� ���� ��� �޼���
	public void displayInfo() {
		System.out.println("�л� �̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�г� : " + grade);
	}

}

/**
�޼���(Method) :
Ư�� �۾��� �����ϱ� ���� �ڵ��� �Լ�. 
Ŭ���� ���� ���ǵǸ�, Ŭ������ ��ü���� �ش� �޼��带 �����Ͽ� ����� �� ����
	��ü�� ���¸� �����ϰų� ��ü�� ���� �۾��� �����ϴµ� ���
	
	ex) System.out.println(); :  ��� �޼���
	
�Ű�����(Parameter) :
	 �Լ��� ���ǿ��� ���� ���� �μ��� �Լ� ���η� �����ϱ� ���� ����ϴ� ����
**/