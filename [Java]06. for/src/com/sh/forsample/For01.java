package com.kh.forsample;

public class For01 {
	public static void main(String[] args) {
		
		//for��: ���α׷��ֿ��� �ݺ� �۾��� �����ϱ� ���� ���Ǵ� �����
		/*
		 Ư���� ������ �����ϴ� ���� �ڵ� ����� �ݺ� �����ϴµ� ���
		 ��κ��� ���α׷��� ���� for���� ���� ����
		 
		 for (�ʱ�ȭ ; ���� ; ����) {
		 	//������ ���� ��� �ݺ������� ������ �ڵ�
		 }
		 
		 �ʱ�ȭ: �ݺ����� ���۵� �� (���� 1ȸ)�� ���� ����Ǵ� �κ�����, �ݺ� ������ �ʱ�ȭ �ϴ� ������ �Ѵ�.
		 ����: �ݺ����� ����� ������ �˻��ϴ� �κ�����, ������ ���� ��쿡�� �ݺ��ڵ� ��� ���� �� ����
		 ������: �ݺ� ������ ������Ű�ų� ���ҽ�Ű�� �κ�����, �ݺ� �ڵ� ��� ���� �� ����
		 
		 */
		
		/*
		for(int i=1 ; i<=5 ; i++) {
			//���� i<=5 ���� ��쿡 ����Ǵ� ����
			System.out.println(i);
		}
		
		for(int i=0 ; i<=5 ; i++) {
			System.out.println("i�� ��: " + i);
		}
		
		for(int i=2 ; i<=7 ; i++) {
			System.out.println("i : " + i);
		}
		
		for(int i=10 ; i>=5 ; i--) {
			System.out.println("i - �� : " + i);
		}
		*/
		
		int sum = 0;//�ݺ��� �ȿ� �ִ� sum�� ���� ���� �ʱ�ȭ �ʿ�
		
		for(int i=1 ; i<=10 ; i++) {
			//��
			sum += i;
			System.out.println("1���� 10������ �� : " + sum);
		}
		
		
		// sum�� ���� 1~5�� ������ ����ϱ�
		int sum2 = 0 ;
		for(int j=1 ; j<=5 ; j++) {
			sum2 = sum2 + j;
		} System.out.println("1���� 5������ �� : " + sum2);
		
		//
		int sum3 = 10;
		for(int k=5;k>=2;k--) {
			sum3 -= k ; //sum3 = sum3-k
			System.out.println(sum3);	
		}
		
		//
		int mul = 1; //���ϱ� �����Ұ���...
		for(int l= 1 ; l<=9 ; l++) {
			mul = 2*l;
			System.out.println("������ : " + mul);
			
		}
		
		
	}

}
