package com.kh.whilesample;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		boolean isMonth = false;
		
		while(!isMonth) { // !:���ǹ��� �ݴ�� �������(false�� true�� ǥ��)
			
			System.out.print("������ ������ �ּ��� : ");
			int month = sc.nextInt();
			
			switch(month) {
				case 12: case 1: case 2: //case�� �����ؼ� ǥ�� ���� (������ �� �� �ϳ��� ���̸� ���)
					System.out.print(month + "���� �ܿ��Դϴ�.");
					isMonth = true; 
					// �� !�� ������� ���� �������� ����ǰ�, ������ ������ ����Ǳ� ������.. true�� �ۼ����־� !�� ���� false�� ������ while���� �߷����ش� 
					break; //break�� case������ �����ϰ��� �ϴ°� ����� �� �� ���� ����Ѵ�~
				
				case 3: case 4: case 5: 
					System.out.println(month + "���� ���Դϴ�.");
					isMonth = true;
					break;
				
				case 6: case 7: case 8: 
					System.out.println(month + "���� �����Դϴ�.");
					isMonth = true;
					break;
				
				case 9: case 10: case 11: 
					System.out.println(month + "���� �����Դϴ�.");
					isMonth = true;
					break;
				
				default:
					System.out.println(month + "���� ���� ��¥�Դϴ�. �ٽ� �������ּ���");
					
			}
		}
		
		*/
		
		//���̰����� �����ϴµ� 9�� �̻� Ƽ���� ������ �� �ֱ� ����
		//���̸� �Է¹޾� ����(19~20) û�ҳ�(14~18) ���(10~13)�� �з��ϰ� ����ϱ�. �̿� ���̴� �ٽ� �Է� �ʿ�
		//����: while switch case �̿��ؼ� ����ϱ�
		
		boolean	isAge = false;
		
		//while(����)
		while(!isAge) {
			System.out.print("\n���̸� ������ �ּ��� :");
			int age = sc.nextInt();
			
			switch(age) {
				case 19: case 20:
					System.out.println(age + "���� ���ο���Դϴ�.");
					isAge = true; //isAge ������ !�� ���� false�� �Ǿ� while�� ����
					break; //case�� switch�� (����)�����Ű�� ��ġ
					
				case 14: case 15: case 16: case 17: case 18:
					System.out.println(age + "���� û�ҳ� ����Դϴ�.");
					isAge = true;
					break;
					
				case 10: case 11: case 12: case 13:
					System.out.println(age + "���� ��� ����Դϴ�.");
					isAge = true;
					break;
					
				default:
					System.out.println("�߸��� ���� �Է��Դϴ�. �ٽ� �������ּ���\n");
			}
		}


	}

}
