package com.kh.genericsMain;

import java.util.ArrayList;

public class GenericsMain {

	public static void main(String[] args) {
		// ������ �����͸� �����ϴ� ArrayList
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(5);
		intList.add(8);
		
		// ���ڿ� �����͸� �����ϴ� ArrayList
		ArrayList<String> strList = new ArrayList<>();
		strList.add("Hello Hello Hello");
		strList.add("WOooorld");
		
		// ���ʸ� �޼��带 ����ؼ� ��� ���
		printList(intList); //�佺�ٸ�~ ��O��
		printList(strList); //�굵 �ȴ�~~~ ¾��

	}
	
	public static <T> void printList(ArrayList<T> list) {
		for (T item : list) {
			System.out.println(item);
		}
	}

}