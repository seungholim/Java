package com.kh.inheritance.calculator;

import java.util.Scanner;

public class CalculatorRun extends CalculatorForMod { //extend�� ��ӹޱ�

	public static void main(String[] args) {
		
		//�Է¹��� ������ ��¼���ϴ� ����
		
		//���߻��(����� ���..)�� ���� �̾߱�
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���� �� ���� �Է��ϼ���~ \n");
		System.out.print("ù ��° ����: ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ����: ");
		int num2 = sc.nextInt();
		
		//���߻��(����� ���..)�� ���� �̾߱�
		CalculatorForMod cal = new CalculatorForMod();
		System.out.println("add = " + cal.add());
		System.out.println("sub = " + cal.substract());
		System.out.println("mul = " + cal.multiply());
		System.out.println("div = " + cal.divide());
		System.out.println("mod = " + cal.mod(num1,num2));//�־ȵɱ�..
		
		
		/**
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���� �� ���� �Է��ϼ���~ \n");
		System.out.print("ù ��° ����: ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ����: ");
		int num2 = sc.nextInt();
		
		CalculatorForMod cal = new CalculatorForMod();
		
		int result1 = cal.add();
		int result2 = cal.substract();
		int result3 = cal.multiply();
		int result4 = cal.divide();
		//int result5 = mod(cal.num1, cal.num2);
		
		System.out.println("Add : " + result1);
		System.out.println("Sub : " + result2);
		System.out.println("Mul : " + result3);
		System.out.println("Div : " + result4);
		
		//System.out.println("Mod : " + result5);
		  
		 **/
		 

	}

}