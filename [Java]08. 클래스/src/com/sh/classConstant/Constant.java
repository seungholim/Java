package com.kh.classConstant;

public class Constant {
	
	//��� ���
	private final int c = 1;
	public static final int a = 1; //�� �̻� a�� ���� �ٲ��� ���ϰ� �ᰡ�д�
	static final int b = 1;
	
	public static void main(String[] args) {
		System.out.println("a�� �� : " + a);
		System.out.println("b�� �� : " + b); //�׳� final int b=1;�� ��� ���� �Ұ� (�׷��� �����Լ� �ȿ� �־�ߵ�)
			
		// a = 2 ; //a�� ���ο� �� �Ҵ� �Ұ���
	}
}

