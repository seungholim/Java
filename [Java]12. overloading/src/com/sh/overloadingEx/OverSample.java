package com.kh.overloadingEx;

/*
Java ������ ����µ�
���ϸ�: OverSample.java �����
�����ε� 5�� ����� �޼��� 5�� ����ϱ�
*/

public class OverSample {
	
	// �� �� ���� ���� ��ȯ�ϴ� ������
	public int Mul(int a, int b) {
		return a * b;
	}
	
	// �� �� ���� ��
	public int Mul(int c, int d, int e) {
		return c * d * e;
	}
	
	// �� �� �Ǽ� ��
	public double Mul(double f, double g) {
		return f * g;
	}
	
	// �� �� �Ǽ� ��
	public double Mul(double h, double i, double j) {
		return h * i * j;
	}
	
	// �� �� �Ǽ� ����
	public double Mul(double k) {
		return k*k ;
	}

	public static void main(String[] args) {
		
		//��ü���� �ν��Ͻ� ����.....
		OverSample obj = new OverSample();
		
		//�޼��� ȣ��
		System.out.println("�� ������ �� : " + obj.Mul(3,4));
		System.out.println("�� ������ �� : " + obj.Mul(3,4,5));
		System.out.println("�� �Ǽ��� �� : " + obj.Mul(1.5,3.5));
		System.out.println("�� �Ǽ��� �� : " + obj.Mul(1.5, 3.5, 5.5));
		System.out.println("�� �Ǽ��� ���� : " + obj.Mul(5.5));

	}

}