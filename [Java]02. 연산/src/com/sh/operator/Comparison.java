package com.kh.operator;

public class Comparison {

	public static void main(String[] args) {
		
		// 4. �񱳿�����(Comparison) : ���� ���� �� ���
		
		/*
		 
		 ũ��, ��, ��ȣ �� ���� ������ �� ����
		 �� ���� �� �߿��� ��� ���� �� ū�� , �� ������, ������, �ٸ��� ���θ� �Ǵ�
		 
		 �� �������� ��� ���� ��(true) �Ǵ� ����(false)���� ��ȯ
		 
		 1) �ʰ�, �̸�
		 
		 > : ���� ���� ũ�� ��, �ƴϸ� ������ ��ȯ ex) num > 5 
		 < : ���� ���� ������ ��, �ƴϸ� ������ ��ȯ ex) num < 5
		 
		 2) �̻�, ����
		 
		 >= : ���� ���� ������ �׺��� ũ�ų� ������ ��, �ƴϸ� ������ ��ȯ
		 <= : ���� ���� ������ �׺��� �۰ų� ������ ��, �ƴϸ� ������ ��ȯ
		 
		 3)
		 
		 == : �� ���� ���� ������ ��, �ƴϸ� ������ ��ȯ ex) num == 5
		 != : �� ���� ���� �ٸ��� ��, �ƴϸ� ������ ��ȯ ex) num != 5
		 		 
		 */
		
		int p = 5;
		int q = 10;
		
		System.out.println("boolean�� ���� ���� : " + (p==q));
		
		boolean isEqual = (p == q);
		
		System.out.println(isEqual);
		
		int r = 5;
		System.out.println("p == r : " + (p==r)); //TRUE
		
		boolean isEqual1 = p != q;
		System.out.println("p != q : " + isEqual1); // !=: p�� q�� ���� �ٸ��� ������ ������ True
		
		boolean isEqual2 = p != r;
		System.out.println("p != r : " + isEqual2); // != p�� r�� ���� ���� ������ ������ False
		

	}

}
