package com.kh.ifsample;

import java.util.Scanner;

public class IfElseif_Sample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// if-else if-else
		/*
		 ���� ���� ������ ���������� ���ϰ�
		 �� �� ù ��° ���� ���ǿ� �ش��ϴ� �ڵ� ����� �����ϴ� ����
		 
		 ���� if�� else if�� ���ǵ� ���� �ƴ϶�� ������ else ��� ����
		 
		 if (����1) {
		  //����1�� ���� �� ����Ǵ� �ڵ�
		 } else if (����) {
		 } else {
		  //���� ��� ������ ������ �� ����Ǵ� �ڵ�
		 }
		 
		 */
		
		/*
		 * 
		// sample1
		int age;
		age = 41;
		
		if(age>=20 && age<=30) {
			System.out.println("�ؿܿ����� ����!");
		} else if(age<20) {
			System.out.println("������ ����.");
		} else {
			System.out.println("���迩���� ������!");
		}
		
		// sample2
		double score = 79;
		
		if(score>90) {
			System.out.print("A");
		} else if(score==90) {
			System.out.print("B+");
		} else {
			System.out.println("B");
		}
		
		// sample3
		int hour = 15;
		
		if(hour <12) {
			System.out.println("������ ���� ��ħ!");
		} else if(hour < 18){
			System.out.println("������ �ڵ��սô�!");
		} else {
			System.out.println("�����ϼ̽��ϴ�~");
		}
		
		//sample4
		int temp =17;
		if(temp>30) {
			System.out.println("���� �����Դϴ�.");
		} else if(temp >20) {
			System.out.println("������ �����Դϴ�");
		} else {
			System.out.println("�߿��� �߿�");
		}
		
		//sample5
		int num = 0;
		
		if(num > 0) {
			System.out.print("����Դϴ�.");
		} else if(num < 0) {
			System.out.print("�����Դϴ�.");
		} else { // 0���� ������ ũ���� ����. (num==0)
			System.out.println("��~");
		}
		
		//sample6
		
		int myAge;
		System.out.print("���̸� �Է��ϼ���: ");
		myAge = sc.nextInt();
		
		if(myAge<5) {
			System.out.print("�����Դϴ�~");
		} else if(myAge>=5 && myAge<14) {
			System.out.print("����Դϴ�~");
		} else if(myAge>=14 && myAge<20) {
			System.out.print("û�ҳ��Դϴ�~");
		} else {
			System.out.print("�����Դϴ�~");
		}
		
		*/
		
		//sample7: ���� ����ϱ�
		
		int month;
		System.out.print("������ �˰���� ���� �Է��ϼ���: ");
		month =sc.nextInt();
		
		if(month==1 || month==2 || month==12) {
			System.out.println("�ܿ�");
		} else if(month>=3 && month<=5) {
			System.out.println("��");
		} else if(month>=6 && month <=8) {
			System.out.println("����");
		} else if(month>=9 && month<=11) {
			System.out.println("����");
		} else {
			System.out.println("�ش��ϴ� ������ �����ϴ�.");
		}
		
		
	}
}
