package com.kh.operator;

public class Arithmetic {

	public static void main(String[] args) {
		// 1. Arithmetic: ��������� ( +, - , *, ������ ��(/), ������ ������(%))
		// ���� ����� �켱 ������ �Ϲ� ���а� ����
		
		int num1 = 5;
		int num2 = 2;
		
		System.out.println("���ϱ�+ : " + (num1 + num2)); //��ȣ ���� �Է��ϸ� 52�� ��µ�..
		System.out.println("����- : " + (num1 - num2)); // (): �ֿ켱 ������
		System.out.println("���ϱ�* : " + (num1 * num2));
		System.out.println("������ ��/ : " + (num1 / num2));
		System.out.println("������ ������% : " + (num1 % num2));

	}

}
