package com.kh.whilesample;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = true;
		
		while(isTrue){ //isTrue = true�̱� ������ true ��� isTrue ���
			System.out.print("\n1. �Ƹ޸�ī��\n2. īǪġ��\n3. ��ũƼ\n\nĿ�Ǹ� �ֹ����ּ��� : ");
			int choice = sc.nextInt(); //while������ �̵�
			
			switch(choice) {
				case 1:
				System.out.println("�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�");
				isTrue = false; //�Ƹ޸�ī�� �ֹ��� �޾����� while���� �����ϱ� ���ؼ� false�� �ִ´�
				break;
				
				case 2:
				System.out.println("īǪġ�� �ֹ��ϼ̽��ϴ�");
				isTrue = false;
				break;
				
				case 3:
				System.out.println("��ũƼ �ֹ��ϼ̽��ϴ�");
				isTrue = false;
				break;
				
				default:
				System.out.println("�߸��� �����Դϴ�. �ٽ� �ֹ��ϼ���!\n");
			}
		}

	}

}
