package com.kh.api.exam1;

public class FormatterMain {
/*
 Formatter
 ���ڿ��� ����ȭ �ϴµ� ���Ǵ� Ŭ����
 �ؽ�Ʈ ����� ���ϴ� ���Ŀ� �°� �������ϰ���� �� �����ϰ� ���
 %d %b %s %f %c...
 */
	public static void main(String[] args) {
		String name = "Say";
		int age = 27;
		double salary = 164.805;
		
		//Formatter ����Ͽ� ���ڿ��� ����ȭ
		String formatString = String.format("�̸� : %s, ����: %d, ����: %.2f",name,age,salary); //%f �Ҽ��� ���� �ڸ��� ���� ����
		
		//����ȭ�� ���ڿ��� ���
		System.out.println(formatString);

	}

}
