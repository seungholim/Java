package com.kh.variable;

public class VarialbeConversion {
	public static void main(String[] args) {
		
		/*
		
		//1. �ڵ�����ȯ(�Ͻ�������ȯ, ����������ȯ)
		
		int intNum = 100;
		System.out.println(intNum); //���� 100�� �ǹ�
		
		long longNum = intNum; //int�� long���� �ڵ� ����ȯ
		System.out.println(longNum);
		
		float floatNum = 3.14f;
		double doubleNum = floatNum; //float�� double�� �ڵ� ����ȯ
		
		System.out.println();
		
		*/
		
		/*
		
		// int > long �����ϴ� ����ȯ 2���� ����� ����ϱ�
		//1)
		int num1 = 100;
		System.out.print("num1 : ");
		System.out.println(num1);
		
		long num2 = num1;
		System.out.println(num2);
		//2)
		int intNum = -100;
		System.out.print("intNum : ");
		System.out.println(intNum);
		
		long longNum = intNum;
		System.out.println(longNum);
		
		// short > int �����ϴ� ����ȯ 1���� ����� ����ϱ�
		
		short num3 = 50;
		int num4 = num3;
		System.out.println(num4);
		
		// float > double �����ϴ� ����ȯ 1���� ����� ����ϱ�
		
		float num5 = 1.96f;
		System.out.print("num5 : ");
		System.out.println(num5);
		double num6 = num5;
		System.out.println(num6);
		
		//2.����� ����ȯ(���� ����ȯ)
		// long > int
		long largeLong = 123456789012345L;
		System.out.print("largeLong : ");
		System.out.println(largeLong);
		
		//int largeInt = largeLong; >�ܼ���ȯ �Ұ��� (mismatch) > ����ȯ ��� ���� or ������Ÿ�� ����...
		int largeInt = (int) largeLong;
		System.out.println(largeInt); //���� -2045911175�� ������ ���´�..! <������ �ս�
		//long�� int�� ���� ����ȯ �� ��� ���� ���� �ȿ� ���� ������ �Ϻ� �����ʹ� �սǵȴ� ����
		//int�� ���� �� �ִ� �� ex)12345 ���� �����ϸ� ���� ��� ���� 
		
		double largeDouble1 = 12345.6789;
		int intPart = (int) largeDouble1;
		System.out.println(intPart); //�Ǽ��� int�� ���� ����ȯ �� �� > ���� �κи� �����ȴ�
		
		*/
		
		//���ڿ� ���ڰ��� ����ȯ 2�� ���
		// 1) ���ڴ� char charBalue = 'Z'; >int�� ����
		// 1)-1
		char charBalue = 'Z';
		int num7 = charBalue;
		System.out.println(num7);
		
		// 1)-2
		char charValue = 'A';
		int num12 = charValue;
		System.out.println(num12);
		
		// 2) double -> int�� ����ȯ ��� 1��
		
		double num8 = 8.16;
		int num9 = (int) num8;
		System.out.println(num9);
		
		// 3) int -> short�� ����ȯ ��� 1��
		
		int num10 = 777;
		short num11 = (short) num10;
		System.out.println(num11);
	}
}
