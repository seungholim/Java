package com.kh.switchsample;

public class Switch_Sample {
	public static  void main(String[] args) {
		
		// switch��
		
		/*
		 Ư�� ������ ǥ������ ���� ���� �پ��� ��츦 ó���ϴ� ���� ����
		 
		 switch ���� �Ϸ��� case ���� �ش� ���� ���Ͽ� ��ġ�ϴ� ��쿡 �ش��ϴ� �ڵ� ����� ����
		 �� case�� �ڿ��� ��ġ�ϴ� ���̳� ǥ������ ����
		 
		 switch (���� �Ǵ� ǥ����) {
		 	case ��1 :
		 		//��1�� �ش��ϴ� �ڵ�
		 		break; // ���� ��ġ�� �� (?) �ش� ����� ������ �ߴ��ϴ� ����
			case ��2 :
				//��2�� �ش��ϴ� �ڵ�
				break;
			default :
				//�� ��� ���̽��� ��ġ���� ���� �� ����Ǵ� �ڵ�
		 }
		 
		 */
		
		// sample1
		
		int day = 30;
		
		switch (day) { //day==30
			
			case 1: //case�� 30�̸� ������ ���
				System.out.println("������"); //case =/=30 > ������ ���X
				break;
			case 2: //case�� 30�̸� ������ ���
				System.out.println("ȭ����");
				break;
			case 30: //case�� 30�̸� ������ ���
				System.out.println("������");
				break;
			default :
				System.out.println("�ָ�");
		}
		
		
	
	   // sample2 (ī�信�� �ֹ��ϱ�)
		
		int choice = 4;
		
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
			System.out.println("����������� �ֹ��ϼ̽��ϴ�.");
			break;
		
		default:
			System.out.println("�߸��� �����Դϴ�. �ٽ� �ֹ����ּ���~");
		}
	
		
	  // smaple3
		
		
	}

}
