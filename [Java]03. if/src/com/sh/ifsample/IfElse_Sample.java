package com.kh.ifsample;

public class IfElse_Sample {
	public static void main(String[] args) {
		
		// if-else
		
		/*
		 ���α׷� ���ǿ� ���� �� ���� ���� �ٸ� �ڵ� ��� �� �ϳ��� �����ϴ� ���� ����
		 
		 ���� if���� ������ ���̸� if ���� �ִ� ����� ������ �ǰ�
		 ������ �����̸� else ����� ������ �ȴ�.
		 
		 �̸� ���� �� ���� ��Ȳ�� ���� �ٸ� ������ ������ �� �ִ�.
		 
		 if(����){
		  //������ ���� �� ����Ǵ� �ڵ�
		 } else {
		  //������ ������ �� ����Ǵ� �ڵ�
		 }
		 
		 */
		
		int age = 20;
		
		if (age >= 18) {
			System.out.println("�帵ŷ ����!");
		} else {
			System.out.println("���θ� �ؾ���...");
		}
		
		int myAge = 60;
		
		if (myAge ==60 ) {
			System.out.println("ȯ����ġ�� ����"); // 60���� ũ�ų� ������ ����
		} else {
			System.out.println("���� �־���...!"); // 60���� ������ ����
		}
		
		int temp = 30;
		if (temp >= 25) {
			System.out.println("���� ���� ����˴ϴ�.");
		} else {
			System.out.println("������ ������ ����˴ϴ�.");
		}
		
	}

}
