package com.kh.inheritance.animal;

public class Lion extends Animal{
	
	public Lion(String name) {
		
		super(name);
		
	}
	
	@Override //override�� ���شٰ� �������
	public void roar() {
		System.out.println(getName() + ": ��������������");
	}

}
