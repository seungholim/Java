package com.kh.circle.vo;

import java.util.Scanner;

public class CircleView {//���� ������ ȭ�鿡 ���
	
	//Ŭ���̾�Ʈ�� ���� ��
	public double getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Է��ϼ��� : ");
		return sc.nextDouble();
	}
	
	/*
	//���� ���
	public void displayInfo(double circleRadius, double circleArea) {
		System.out.println("���� ����");
		System.out.println("������ : " + circleRadius);
		System.out.println("���� ���� :" + circleArea);
	}
	*/
}