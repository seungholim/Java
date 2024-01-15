package com.kh.operator;

public class Logical {
	public static void main(String[] args) {
		
		// 5. ��������(Logical) : ������ ������ �ٷ� �� ���
		
		/*
		 &&(�� AND), ||(�� OR), !(�� NOT)
		 
		 1) &&(����) : �� ���� ��� ���� ��� ��, �ƴϸ� ����
		  
		  ex) boolean val = (5 > 2) && (5 > 3) ; // True
		   
		 2) ||(����) : �� �� �� �ϳ��� ���̶� ���̸� ��
		  
		  ex) boolean val = (5 > 2) || (5 < 3) ; // True
		  
		 3) !(������) : ���� ���� �������� �ٲٰ�, ������ ���� ������ �ٲ�
		 
		  ex) boolean val = !(5 > 2); // False
		 
		 */
		
		boolean isTrue = true;
		boolean isFalse = false;
		
		// 1. &&(�� AND)
		
		boolean logicalAnd = isTrue && isFalse;
		System.out.println("&& : " + logicalAnd);
		
		boolean val1 = (5 > 2) && (5 > 3);
		System.out.println(val1);
		
		// ������ �������ڿ� �����ϱ�
		int a = 10;
		int b = 5;
		int c = 3;
		
		boolean val2 = (a > b) && (a > c); // 10 > 5 && 10 > 3;
		System.out.println(val2); // True
		
		boolean val3 = (a < b) && (a > c);
		System.out.println(val3); // False
		
		// 2. ||(�� OR)
		
		boolean val4 = (5 > 2) || (5 < 3);
		System.out.println("|| : " + val4);
		
		int d = 20;
		int e = 10;
		int f = 5;
		
		boolean val5 = d > e || d < f ;
		System.out.println(val5); // True
		
		boolean val6 = d < e || d < f ;
		System.out.println("val6 : " + val6); // False
		
		// 3. !(����)
		
		boolean val7 = !(5 > 2); // 5 > 2�� ���̹Ƿ� false
		System.out.println("! : " + val7);
		
		int g = 100;
		int h = 200;
		int i = 100;
		
		boolean val8 = !(g > h); // g < h�� �����̹Ƿ� true
		System.out.println("! : " + val8);
		
		boolean val9 = !(g == i); // g == i�� ���̹Ƿ� flase
		System.out.println("! : " + val9);
	}
}
