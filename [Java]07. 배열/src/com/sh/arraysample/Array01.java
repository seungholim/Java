package com.kh.arraysample;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		
		// Array (�迭): ���� Ÿ���� ���� ������ �ϳ��� �������� �ٷ�� ��
		
		/*
		 1. ������ ������ Ÿ���� ���� ���� ���� �� ���� �����ϰ� �ε����� ����Ͽ� �� ���� ������ �� �ֵ��� ����
		 
		 2. �迭�� ���α׷����� �����͸� ���� ȿ�������� �����ϰ� �����ϴµ� ����
		 
		 3. �������� ������ ���� �ٷ� �� �ֵ��� ������!
		 
		 **�迭�� ����
		 	
		 	~~~�迭 ���� �� �ʱ�ȭ~~~
		 	������Ÿ��[] �迭�̸�		=	new ������Ÿ��[ũ��]
		 
		 **Ư¡
		 	1) ������ ũ�� : ������ �� ũ�Ⱑ �����ǰ�, ũ�Ⱑ �����Ǿ����� > ���� �� ũ�� ���� �Ұ�
		 	
		 	2) ���� ������ Ÿ�� :  �迭 ���� ��� ��Ҵ� ������ ������ Ÿ���� ������ ��
		 		ex) intŸ���� �迭�� ��� ��Ұ� ����
		 		
		 	3) index ��� ����: �� �迭 ��Ҵ� �������� �ε����� ������, 0���� �����ؼ� �迭ũ�� -1������ ���� ����
		 		> �ε����� ����ؼ� Ū�� ��ġ�� �ִ� ��� ���� ����
		 			ex) �迭ũ�⸦ '5'�� �����Ѵٸ�, index�� 0 ~ 4
		 	
		 	4) �迭�� ����(length) : �迭�� ���̸� �� �� �ִ�~
		 */
		
		int score1, score2, score3, score4, score5;
		// ������ ������ 3 ������..score�� 100�����? > �迭 ���
		
		// int Ÿ�� �迭 ����
		
		String[] nameArray = new String[2];
		//String[] stringArray = {"","",""}; >�ڸ��� ������ ���
		
		
		String[] seatArray = {"������","īī��","�罺��"};
		//������� �ڸ��� ��ġ���� �Ϸ�
		
		String[] stringArray = new String[4];
		stringArray[0]="��Ʒ簡";
		System.out.println("stringArray : " + stringArray[0]); //��Ʒ簡
		System.out.println("stringArray : " + stringArray[1]);
		System.out.println("stringArray : " + stringArray[2]);
		System.out.println("stringArray : " + stringArray[3]);
		//if�������� ���� ���� ������, ���� �߻�
		
		String[] food = {"ĭ��", "�����", "����", "��â����"}; //index 3¥��
		int foodLength = food.length;
		System.out.println("food �迭�� ���� : " + foodLength);
			
	}

}
