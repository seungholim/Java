package com.kh.inheritance.animal;

public class Dog extends Animal {
	
	public Dog(String name) {
		
		super(name); //�θ� Ŭ����(Animal)�� ���(name, age)�� ������ �� �ֵ��� ��
		
	}
	
		public void speak() {
			System.out.println(getName() + ": ����!!!");
		}
		
}
