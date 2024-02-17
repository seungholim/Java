package com.kh.api.objExam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PracticeMain3 {
	
	public void practice2() {
		//��¥ ���� ���
		Date currentDate = new Date();
		SimpleDateFormat smDF = new SimpleDateFormat("yyyy-MM-dd");
		String formatStr = String.format("���� ��¥ : %s", smDF.format(currentDate));
		System.out.println(formatStr);
	}
	
	public void practice3() {
		int num1 = 123;
		int num2 = 7;
		//���ڰ� ������ ���̺��� ª�� ��� �տ� 0���� ä���ְڴ�
		//��µǴ� ������ �ּ� �ʺ� : 5�ڸ�
		String numbers = String.format("����1: %05d\n����2: %05d", num1, num2);
		System.out.println(numbers);
	}

	public void practice4() {
		String text1 = "Hello";
		String text2 = "World";
		//10�� ���ڿ��� �ּ� �ʺ� (���� 10�ڸ� ����)
		//���� ���ڿ��� 10�ڸ����� ª�ٸ� ������ �������� ä����
		//���� ���ڿ��� -10�ڸ����� ª�ٸ� �������� �������� ä����
		//���� ����ǥ(')�� �ѷ��׾ƾ���
		String formatStr = String.format("'%-10s' '%10s'",text1, text2);
		System.out.println(formatStr);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PracticeMain3 p = new PracticeMain3();
		p.practice2();
		p.practice3();
		p.practice4();
	}

}
