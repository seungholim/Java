package com.kh.ifsample;

public class If_Sample {
	
	public static void main(String[] args) {
		
		//���ǹ�
		
		/*
		 if, else if, else ���� ������ ����ؼ� ���ǿ� ���� �ٸ� �ڵ� ��� ����
		 
		 �־��� ������ ���ϰ�, ���� ��� Ư�� �ڵ� ���� / ������ ��� �ٸ� �ڵ� ����
		 
		 1)
		 
		 if(���ǹ�){
		  ��(true)�̸����
		 }����(false)�̸� ���� //��������X
		 
		 */
		
		int money=6000;
		
		if (money >= 5000) {
			System.out.println("���̽�ũ���� �����!");
		}
		
		int age = 18;
		if (age >= 18) {
			System.out.println("�����Դϴ�.");
		} System.out.println("���ڳ� ��Ծ�!");
		
		int temp = 25;
		if(temp > 24) {
			System.out.print("������ ���� �ʰ� ����� �����ϴ�.");
		}
		System.out.println(" �̻��Դϴ�. ���������ϴ�.");
			
	}

}
