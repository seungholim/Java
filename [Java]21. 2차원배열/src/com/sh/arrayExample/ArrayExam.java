package com.kh.arrayExample;

import java.util.Scanner;

public class ArrayExam {
	
	public void practice1() { //ArrayMain���� ���� ����ϱ�
		int value =16;
		int[][] arr = new int[4][4];
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				arr[i][j] = value++;
				System.out.println(arr[i][j]);
			}
		}
	}
	
	public void practice2() {
		int value = 16;
		int[][] arr = new int[4][4];
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				arr[i][j] = value++;
			}
		}
		
		for(int i=0 ; i <arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				System.out.printf("%2d ", arr[i][j]); //
				/*
				printf("��¼���", ����ҳ���);
					��� �� �ٹٲ� ���� ����
					�ٹٲ��� �Ϸ��� ������ %n�� �־������
				%b: boolean �������� ���
				%d: ���� �������� ���
				*/
			}
			System.out.println(); //4�� 4���� ����ϱ�
		}
	}
	
	public void practice3() { //�ٽ� Ǯ��� (�࿭ũ��޾Ƽ� ��¼�� ����)
		int row = 0; //��
		int col = 0; //��
		char value = 'a';
		char[][] arr = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ũ�� : ");
		row = sc.nextInt();
		
		arr = new char[row][];
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(i + "���� ũ��");
			col = sc.nextInt();
			
			arr[i] = new char[col];
		}
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				arr[i][j] = value++;
			}
		}
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				System.out.println(arr[i][j] + " ");
			}
			
		}
	}
	
	public void practice4() { //����̿� ���� ��¼�� ģ���� ����
		int count = 0;
		String[] students = {"���ǰ�","������","�����","�����","���̹�","�ں���","�ۼ���","������","������","��õ��","��ǳǥ","ȫ����"};
		String[][] seat1 = new String[3][2]; //1�д�
		String[][] seat2 = new String[3][2]; //2�д�
		
		for(int i=0 ; i<seat1.length ; i++) {
			for(int j=0 ; j<seat1[i].length ; j++) {
				seat1[i][j] = students[count++];
			}
		}
		
		for(int i=0 ; i<seat2.length ; i++) {
			for(int j=0 ; j<seat2[i].length ; j++) {
				seat2[i][j] = students[count++];
			}	
		}
		
		System.out.println("===1�д�===");
		for(int i=0 ; i<seat1.length ; i++) {
			for(int j=0 ; j<seat1[i].length ; j++) {
				System.out.println(seat1[i][j] + " ");
			}
		}

	}
}
