package com.kh.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain implements Comparator<String> { //comparator import �ʿ�

	@Override
	public int compare(String num1, String num2) {
		// ���̰� ������ 0�� ��ȯ
		if(num1.length() == num2.length()) {
			return 0;
		} else if(num1.length() > num2.length()) {
			//num1�� num2���� ��� ��� ��ȯ
			return 1;
		} else {
			//num1�� num2���� ª���� ����
			return -1;
		}
		//������������ �����ϴ� �ڵ�???
	}
	
	public static void main(String[] args) {
		
		List<String> str = new ArrayList<>();
		str.add("apple");
		str.add("cherry");
		str.add("mango");
		str.add("kiwi");
		str.add("dragonfruits");
		str.add("����");
		str.add("�г���ȣ�ΰ���");
		str.add("��������");
		str.add("��������");
		str.add("pineapple");
		
		// Comparator�� ����ؼ� ���ڿ��� �����غ������?
		Collections.sort(str, new ComparatorMain());
		
		// ���ĵ� ��� ��� (���ڿ� ���� ������������ ��µȴ�~~~~~) > ���̰� ������ ���� ������� ~
		// �켱���� 1. ���� 2. ����
		// �ѱ� �ҹ��� �빮�� ����
		for(String s : str) {
			System.out.println(s);
		}
	}

}
