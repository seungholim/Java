package com.kh.pattern.single;

public class SingleStudent {
	
	//�������
	private String name;
	
	//������
	private SingleStudent() {
		
	}
	
	//��¸޼ҵ�
	public void display() {
		System.out.println("�̱��� �л��Դϴ�.");
	}
	
	public static void main(String[] args) {
		//��ü ����
		SingleStudent std1 = new SingleStudent(); //�ܼ��� �̱���������... ��? ��ư �װ� �ҷ����� ���..
		
		std1.display(); //��¸޼ҵ� ȣ��

	}

}
