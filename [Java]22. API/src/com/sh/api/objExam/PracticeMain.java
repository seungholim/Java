package com.kh.api.objExam;

import java.util.Scanner;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		pm.practice1();
		//practice1();
	}
	
	public void practice1() {
		//Scanner �̿��ؼ� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ���ڿ��� �Է��ϼ���");
		String str1 = sc.nextLine();
		
		System.out.println("�� ��° ���ڿ��� �Է��ϼ���");
		String str2 = sc.nextLine();
		
		sc.close(); //��ĳ�� �� ���� �޸� ���� ����
		
		//���ڿ� ��
		if(str1.equals(str2)) {
			System.out.println("�� ���ڿ��� �����ϴ�");
		} else {
			System.out.println("�� ���ڿ��� �ٸ��ϴ�");
		}
		
		//���ڿ��� �ؽ� �ڵ� ���
		int hashCode1 = str1.hashCode();
		int hashCode2 = str2.hashCode();
		System.out.println("ù ��° ���ڿ��� �ؽ��ڵ� : " + hashCode1);
		System.out.println("�� ��° ���ڿ��� �ؽ��ڵ� : " + hashCode2);
		
		//���ڿ��� ���ڿ� ǥ�� ���
		String strString = str1.toString();
		String str2String = str2.toString();
		System.out.println("ù ��° ���ڿ��� ���ڿ� ǥ�� : " + strString);
		System.out.println("ù ��° ���ڿ��� ���ڿ� ǥ�� : " + str2String);
	
	}

}
