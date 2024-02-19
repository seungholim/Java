package com.kh.exceptionSample;

import java.util.Scanner;

/*
throw
	���ܸ� �߻���Ű�� Ű����
	���α׷� ���� �� ����ġ ���� ��Ȳ�� �߻����� �� ���
	���ܸ� �߻���Ű�� ����ó���� ���۵ǰ�
	���α׷��� �ش� ���ܸ� ������ ó���ϰų� ���� ȣ�� ���� ���ܸ� ����
	
	user ���ڸ� �Է��ؾ���
	����� �Է��ؾ��ϴµ� ������ �Է��ع���;;;
	������ ��� ���ܸ� �߻���Ű�� ������ ����
*/
public class ThrowMain { //���� ��Ű���� �װ�Ƽ��ѹ���¼�� Ŭ������ ����˴ϴ�
	
	public static void main(String[] args) {

		try {
			int number = getNumber(); //���ڸ� ������ �� (getNumber()��� �޼��带 ������)
			if(number < 0) {
				throw new NegativeNumberException("������ ����� ���� �ʽ��ϴ�."); //NegativeNumberException ���� �����ʿ�
			}
			System.out.println("�Է��� ���� : " + number);
		} catch(NegativeNumberException e) {
			System.out.println("���ܹ߻������Ӥ�������������Ϥ��褿" + e.getMessage());
		}

	}
	
	public static int getNumber() {//����ڷκ��� ���ڸ� �Է¹޴� �޼���
		//���⿡�� ������ �Է��ϸ� ���ܰ� �߻��ϵ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int number = sc.nextInt();
		return number;
	}
}

/* �� �и��ؼ� ����ϴ°� (Ŭ���� �� ���� �� �� ���� ���� x) >������Ű���� �״�� �������ٰԿ�
public class NegativeNumberException extends Exception { //Exception ����� �޴� Ŭ���� ����
	//NegativeNumberException : ����� ���� ���� Ŭ����
	public NegativeNumberException(String msg) {
		super(msg);
	}
}
*/