package com.kh.superSample;

//��ӹ޾Ƽ� super() & super. ������ Ȯ��

/*
 super = �θ� Ŭ������ ������ �޼��忡 �����ϱ� ���� ���
 super() = �θ� Ŭ������ �����ڸ� ȣ���ϱ� ���� ���/ ����Ŭ������ ���������� ù ��° �ٿ� ȣ�� �Ǿ�� ��.
 
 */

public class SuperMain {

	public static void main(String[] args) {
		Child child1 = new Child();
		System.out.println("------------------------");
		
		Child child2 = new Child("ȫ�浿");
		System.out.println("************************");
		
		child2.display(); //�θ� Ŭ������ show ���
		//super.display(); ���� �� ��� �Ǵ���
		//super.display(); �긦 ����ϰ�ʹٸ� ��� �ؾ��ϴ���?
		//��α׿� ���� ����
	
	}

}
