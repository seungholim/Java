package com.kh.superSample;

public class Parent {
	
	String name;
	
	Parent() {
		System.out.println("�θ� Ŭ������ �⺻ �������Դϴ�.");
	}
	
	Parent(String name) {
		this.name = name;
		System.out.println("�θ� Ŭ������ ���ڿ� �Ķ���� �������Դϴ�! : " + name);
	}
	
	public void show() {
		System.out.println("�θ� Ŭ������ show �޼����Դϴ�.");
	}

}
