package com.kh.arrayListSample;

import java.util.ArrayList;

/*
 ArrayList �̿��ؼ�
 3�� �� �� �����
 2�� �����ϰ�
 1�� �����
 ���� �� �����ϱ�
 */


public class TodoSample {

	public static void main(String[] args) {
		// �� ArrayList ����
		ArrayList<String> todo = new ArrayList<>();
		
		//�� �� �߰�
		todo.add("����");
		todo.add("���� ��å");
		todo.add("����");
		System.out.println("�� �� : " + todo);
		
		//�� �� ����
		todo.set(1, "���� ���");
		todo.set(2, "��Ʃ��");
		System.out.println("������ �� �� : " + todo);
		
		//�� �� ����
		todo.remove(2);
		System.out.println("�� �� ���� : " + todo);
		
		//��ȸ�ؼ� ������
		//for(String aaaaa : )
			
		//�ߺ��� �� �� ����

	}

}
