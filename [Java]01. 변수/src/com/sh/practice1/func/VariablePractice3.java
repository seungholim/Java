package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public static void main(String[] args) {
		
		//Ű����� ����, ���� ���� �Ǽ������� �Է� �޾�
		Scanner sc = new Scanner(System.in);
		
		double width, height;
		System.out.print("������ ���̸� �Է��ϼ��� :");
		width = sc.nextDouble();
		System.out.print("������ ���̸� �Է��ϼ��� :");
		height = sc.nextDouble();
		
		System.out.println("���� : " + width + "\n���� : " + height);
	}

}