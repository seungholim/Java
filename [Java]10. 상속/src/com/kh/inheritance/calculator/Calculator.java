package com.kh.inheritance.calculator;

import java.util.Scanner;

public class Calculator {
	
	//���⸦ ������~
	
	int num1, num2; //��ü ���� �ƴ�
	
	
	//1. ���ϱ�
	
	public int add() { //�Ķ����(�Ű�����) : ���� 2��
		return num1 + num2; //��ȯ���� �����Ƿ� �Լ��� ������ �Է� �ʼ�
	}
	
	//2. ����
	
	public int substract() { 
		return num1 - num2; 
	}
	
	//3. ���ϱ�
	
	public int multiply() { 
		return num1 * num2; 
	}
	
	//4. ������
	
	public int divide() {
		if(num2 == 0) {
			System.out.println("������ ���� 0�� �Ǹ� �ȵ˴ϴ�");
			return 0;
		} else {
			return num1 / num2;
		}
	}
	//�� �̿ܿ� �������� �������..

}