package com.kh.ifsample;

import java.util.Scanner;

public class IfExam_Sample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// ��ø(����) if��
		
		/*
		 if(���ǽ� 1){
		  if(���ǽ�2){
		   if(���ǽ�3){
		   ����� ����;
		   } else if (���ǽ�4) {
		    ����� ����;
		    } else {
		     ����� ����;
		     }
		  }   
		 } else {
		   ����� ����;
		   }
		 */
		
		//������ ���� �溸!
		
		int month, temp;
		System.out.print("��: ");
		month = sc.nextInt();
		System.out.print("��� : ");
		temp = sc.nextInt();
		
		if(month==1 || month==2 || month==12) {
			System.out.println("�ܿ�");
			if(temp <= -15) {
				System.out.println("���� �溸");
			} else if(temp <= -12) {
				System.out.println("���� ���Ǻ�");
			} 
		} else if(month>=3 && month <=5) {
			System.out.print("��");
		} else if(month>=6 && month <=8) {
			System.out.println("����");
			if(temp >=35) {
				System.out.println("���� �溸");
			} else if(temp >=33) {
				System.out.println("���� ���Ǻ�");
			}
		} else if(month>=9 && month <=11) {
			System.out.print("����");
		} else {
			System.out.println("�ش��ϴ� ������ �����ϴ�");
		}

	}
	
}
