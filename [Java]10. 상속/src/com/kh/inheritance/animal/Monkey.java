package com.kh.inheritance.animal;

public class Monkey extends Animal {
	
	public Monkey(String name) {
		
		super(name);
	
	}
	
	@Override //override�� ���شٰ� �������
	//���� �� �ڵ带 �������� ���ϴ°���
	//���� ���� �ܴٸ� ���ٸ� �Ųٷ� �ڴϱ��°� �������
	//��¸޼ҵ�
	public void sleep() {
		System.out.println(getName() + ": �������� �ڴٰ� ������ �� ����");
	}
}