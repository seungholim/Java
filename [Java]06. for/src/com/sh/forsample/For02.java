package com.kh.forsample;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		
		// ������ ���� �����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		int result = 0; //���ʰ��� 0���� �ݴϴ�.
		for (int i =1 ; i <=num2; i++) {
			
			
			//result += num1;
			result = num1 + result;
			System.out.println(num1 + " * " + i + " = " + result);
	
		}
		
		//���� ����� ��� �Է¹��� �� ���ڿ� ��� ���� ���ڿ��� �����ؼ� ���
		
		// ���� for ��
		
		
	}
	
}