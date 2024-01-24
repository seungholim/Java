package com.kh.inheritance.animal;

public class Animal { //����Ŭ���� ����
	
	//� �����ϱ��?
	private String name;
	private int age;
	
	public Animal(String name) {
		this.name = name;
		this.age = age;
	}
	
	public void setName() {
		
		this.name = name;
		
	}
	
	public String getName() {
		
		return name;	
		
	}


	
	public void info() {
		System.out.println("<�̸�>");
	}
	
	public void eat() {
		System.out.println(name + " ��(��) ���̸� �Խ��ϴ�.");
	}

	public void sleep() {
		System.out.println(name + "��(��) ���� ��ϴ�.");
	}

	public void roar() {
		System.out.println(name + "����");
	}
}
