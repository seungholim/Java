package com.kh.overloadingEx;

public class OverLoadingExam {
	//������ ����
	public int sum(int a, int b) {
		return a + b;
	}
	//�� ���� ������ ����
	public int sum(int a, int b, int c) {
		return a + b + c;
	}
	//�� ���� �Ǽ��� ����
	public double sum(double a, double b) {
		return a + b;
	}
	
	//�� ���� �Ǽ��� ����
	public double sum(double a, double b, double c) {
		return a + b + c;
	}
	
	public static void main(String[] args) {
		OverLoadingExam obj = new OverLoadingExam();
		
		//�޼��� ȣ��
		System.out.println("�� ������ �� : " + obj.sum(10,20));
		System.out.println("�� ������ �� : " + obj.sum(10,20,30));
		System.out.println("�� �Ǽ��� �� : " + obj.sum(10.5,20.8));
	}

}
