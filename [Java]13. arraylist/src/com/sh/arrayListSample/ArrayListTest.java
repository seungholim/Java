package com.kh.arrayListSample;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// �� ArrayList ����
		ArrayList<String> fruits = new ArrayList<>();
		System.out.println("fruits : " + fruits); //fruits : []
		
		//��� �߰�
		fruits.add("���");
		System.out.println("��� �߰� : " + fruits);
		
		fruits.add("�ٳ���");
		System.out.println("�ٳ��� �߰� : " + fruits);

		fruits.add("����");
		System.out.println("���� �߰� : " + fruits);
		
		//��� ���� Ȯ��
		int size = fruits.size();
		System.out.println("���� ����� ũ�� : " + size);
		
		//�ε����� ����Ͽ� ��ҿ� ��������
		String firstFrutis = fruits.get(0);
		System.out.println("ù ��° ���� : " + firstFrutis);
		String fourFruits = fruits.get(2);
		System.out.println("ù ��° ���� : " + fourFruits);
		
		//��� ��
		fruits.set(2,"ü��");
		System.out.println("����üũ : " + fruits);
		
		//��� ����
		fruits.remove(1);
		System.out.println("�ٳ��� ����Ȯ�� : " + fruits);
		
		//ArrayList ��ȸ�ؼ� ������
		System.out.println("��� ���� ���");
		//for(����ǵ�����Ÿ�� �츮�� ���� ������ : ����� ����ִ� ������) {}
		for (String				fruit : fruits) {
			System.out.println(fruits);
		}
			
			
		//ArrayList
		fruits.clear();
		System.out.println(fruits);
	}
	
}