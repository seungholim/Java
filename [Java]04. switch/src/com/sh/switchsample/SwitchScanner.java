package com.kh.switchsample;

import java.util.Scanner;

public class SwitchScanner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		int choice;
		System.out.println("~~~~~�޴���~~~~~\n1. �Ƹ޸�ī��\n2. ī���\n3. ���ν����\n4. �� ���� ������\n~~~~~~~~~~~~~~~\n");
		
		System.out.print("�ֹ��Ͻ� ��ȣ�� �������ּ��� : ");
	
		choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println("�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�.");
			break;
			
		case 2:
			System.out.println("ī��� �ֹ��ϼ̽��ϴ�.");
			break;
			
		case 3:
			System.out.println("���ν���� �ֹ��ϼ̽��ϴ�.");
			break;
			
		case 4:
			System.out.println("�� ���� ������ �ֹ��ϼ̽��ϴ�.");
			break;
			
		default:
			System.out.println("�߸��� �����Դϴ�. �ٽ� �ֹ����ּ���.");
		}
		*/
		
		//scanner�� �̿��ؼ� ���ڸ� �����ϴ� switch
		
		System.out.println("~~~~~�޴���~~~~~\n1. ������\n2. ����Ĩ\n3. ������Ĩ\n4. ĭ����\n~~~~~~~~~~~~~~~\n");
		System.out.print("���ڸ� ��ȣ�� �������ּ��� : ");
		
		int snack = sc.nextInt();
		
			
		switch (snack) {
		
			case 1:
				System.out.println("������ �����ϼ̽��ϴ�.");
				break;
				
			case 2:
				System.out.println("����Ĩ �����ϼ̽��ϴ�.");
				break;
				
			case 3:
				System.out.println("������Ĩ �����ϼ̽��ϴ�.");
				break;
				
			case 4:
				System.out.println("ĭ���� �����ϼ̽��ϴ�.");
				break;
				
			default:
				System.out.println("�߸��� �����Դϴ�. �ٽ� �ֹ��ϼ���!");
			}
		
		
	}

}
