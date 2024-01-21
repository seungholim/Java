package com.kh.arraysample;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		
		//toCharArray(): String �� char �迭�� ������ִ� ���
		
		/*
		 1. ���ڿ��� �Է� �޾Ƽ� 
		 2. ���� �ϳ��ϳ� �迭�� �ְ�
		 3. �˻��� ���� scanner 
		 4. �˻��� ���ڰ� ���ڿ��� �� �� �� �ִ��� ������(length), 
		 5. �� ��° �ε����� ��ġ�ϴ��� 
		 6. �ε��� ����ϱ�(index�� ���)
		 */
		
		/**
		 1.
		 2. ���� �ϳ��ϳ� �迭�� �ִ´�. 
		  - String �ȿ� �ִ� ���ڵ��� �迭�� ��´�.
		  - char�� ���ڸ� ���� ���� ���ڵ��� �迭�� �ִ´�.
		  - String �ȿ� char �迭�� ������ִ� �༮ => toCharArray
		  	ex) String �ȳ��ϼ��� = {'��','��','��','��','��'}
		 **/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String inputString = sc.next();
		
		System.out.print("�˻��� ����(�� ����)�� �Է��ϼ���. : "); //�˻��� ���� �Է� �ޱ�
		char searchChar = sc.next().charAt(0); //ù ��°
		
		//���ڿ��� -> ���ڷ� ��ȯ
		// ex) �ȳ��ϼ��� . -> {'��','��','��','��','��'} �迭ȭ
		//toCharArray: ���ڿ��� ���� �迭�� ��ȯ�ϴ� ����
		char[] charString = inputString.toCharArray();
		
		int charCount = charString.length; //�迭�� ��ȯ�� ���̰� ��� �Ǵ°�~
		System.out.println("charCount(���ڿ� ���� üũ) : " +charCount);
		
		//�� ����(length)�� �󸶳� �Ǵ��� Ȯ���ϰ�, �� �ڸ��� ����ϱ�
		
		int count = 0; //�˻��� ���� ���� ī��Ʈ
		
		System.out.print(inputString + " �� " + searchChar + "��(��) �����ϴ� ��ġ(�ε���) : ");
		//�ݺ����� ����ؼ� ��ġ ã��
		for (int i=0; i<=charCount ; i++) {
			//���࿡ ���� �� �ܾ �˻����� �� �� ���ڴ� �� ��° �ε����� ��ġ�ϴ��� �ε��� ����ϱ�
			if(charString[i] == searchChar) { //charString[i]: �������� �ƴ϶� i���� �Ǿ�� �ϴ� ������?
				//searchChar �츮�� �˻��ؼ� ���ڰ��� �������ֱ� ������ ���� �����ž�
				//���ڹ迭�� ���� �˻��� ���ڿ� ��ġ�ϴ°�?
				System.out.print(i + " ");
			
			}
			count ++ ;
		}
		
		System.out.print(count + "��");
		

	}

}
