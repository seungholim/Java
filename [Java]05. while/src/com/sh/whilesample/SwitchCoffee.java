package com.kh.whilesample;

import java.util.Scanner;

public class SwitchCoffee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//while���� Ȱ���� switch
		
		/*
		int choice;
		boolean isChoice = false;
		
		while(!isChoice) { //������ ���� ���� �ڵ� ����� �ݺ������� ����
			System.out.println("Ŀ�Ǹ� �ֹ����ּ���. \n1. �Ƹ޸�ī��\n2. ī���\n3. ȫ��");
			
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("�Ƹ޸�ī�븦 �ֹ��߽��ϴ�.");
					isChoice = true;
					break;
					
				case 2:
					System.out.println("ī��󶼸� �ֹ��߽��ϴ�.");
					isChoice = true;
					break;
					
				case 3:
					System.out.println("ȫ���� �ֹ��߽��ϴ�.");
					isChoice = true;
					break;
					
				default:
					System.out.println("�߸��� �����Դϴ�. �ٽ� �������ּ���");
					
			}
			
		}
		*/
		
		int choice;
		boolean isChoice = true;
		
		while(isChoice) { //������ ���� ���� �ڵ� ����� �ݺ������� ����
			System.out.println("Ŀ�Ǹ� �ֹ����ּ���. \n1. �Ƹ޸�ī��\n2. ī���\n3. ȫ��");
			
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("�Ƹ޸�ī�븦 �ֹ��߽��ϴ�.");
					isChoice = false;
					break;
					
				case 2:
					System.out.println("ī��󶼸� �ֹ��߽��ϴ�.");
					isChoice = false;
					break;
					
				case 3:
					System.out.println("ȫ���� �ֹ��߽��ϴ�.");
					isChoice = false;
					break;
					
				default:
					System.out.println("�߸��� �����Դϴ�. �ٽ� �������ּ���");
					
			}
			
		}

	}

}
