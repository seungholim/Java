package com.kh.scannersample;

import java.util.Scanner; //���� ����� �Ƿ�����

public class Scannersample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("���̸� �Է��� �ּ��� : ");
		int age = sc.nextInt(); // sc.nextInt(): ������ �޴� next ����, ������ ����X
		System.out.println("�� ���̴� " + age + "�� �Դϴ�.");
		
		String name;
		String phoneNumber;
		
		System.out.print("�̸��� �Է��� �ּ��� : ");
		name = sc.next(); // string(���ڿ���) sc.next();�� �ޱ�
		
		System.out.print("��ȣ�� �Է��� �ּ��� : ");
		phoneNumber = sc.next(); // phoneNumber�� int�� ���� �ÿ��� ������(-)���� ���� ��
		
		System.out.println("����� �̸��� " + name + "�Դϴ�.");
		System.out.println("����� ��ȭ��ȣ�� " + phoneNumber + "�Դϴ�.");
		*/
		
		//�� ��̿� ���� �����ϴ� ���İ� �� �ּ� ����ϱ�
		
		System.out.print("��̸� �Է��ϼ��� : ");
		String favor = sc.next();
		
		System.out.print("�����ϴ� ������ �Է��ϼ��� : ");
		String food = sc.next();
		
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		String address = sc.next();
		// nextline: ����ġ�� ������ ���
		System.out.println("�� ��̴� " + favor + "�̰�, �����ϴ� ������ " + food +",\n��� ���� " + address + "�Դϴ�.");
	}
 
}
