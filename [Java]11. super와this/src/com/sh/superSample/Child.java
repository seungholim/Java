package com.kh.superSample;

public class Child extends Parent{ //extend�� ��ӹް� parent�� �⺻ ������ ȣ��
	
	//Child(){} -> ���������ڰ� default�� ����� ���� �� public�̶� ������ �Ȱ���..
	public Child(){
		super(); //�θ� Ŭ������ �⺻ ������ ȣ��
		System.out.println("�ڽ� Ŭ������ �⺻ �������Դϴ�.");
	}
	
	public Child(String name) {
		super(name); //�θ� Ŭ������ ���ڿ� �Ķ���� ������ ȣ��
		System.out.println("�ڽ� Ŭ������ ���ڿ� �Ķ���� �������Դϴ�.");
	}
	
	public void display() {
		super.show(); //��� Ŭ������ show ��� �޼��� ȣ��
		System.out.println("�ڽ� Ŭ������ display �޼����Դϴ�");
	}

}
