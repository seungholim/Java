package com.kh.operator;

public class OperatorExam {
	public static void main(String[] args) {
		//1. ���� ���� ������
		/*
		 ���� ���� �����ڴ� ���� 1�� ������Ų �� �� ���� �ٽ� ������ �Ҵ�
		 i�� ���� 1 ������Ű�� �� ���� �ٽ� i�� �Ҵ�
		 */
		
		int i =5;
		i = ++i;
		System.out.println("i = ++i: " + i);
		
		//2. ���� ���� ������
		/*
		 ������ ���� ���� ����� �� ���� 1�� ����
		 i�� ���� ���� i�� �Ҵ��ϰ�, �� �Ŀ� i�� ���� 1���� ��Ų��. (�Ҵ� = ���簪 --> i ��ȭX)
		 */
		
		int r = 5;
		r = r++;
		System.out.println("r = r++: " + r);
		
		int a =5;
		++a;
		System.out.print("++a: a" + a);
	}

}
