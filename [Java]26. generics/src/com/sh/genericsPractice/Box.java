package com.kh.genericsPractice;

import com.kh.genericsMain.Book; //Book������

public class Box {

	public static void main(String[] args) {
		//����������������
		Book<Integer> intBox = new Book<>();
		intBox.put(158);
		intBox.put(155);
		int intValue = intBox.get();
		System.out.println("Int value : " + intValue);
		
		//���ڿ�����������
		Book<String> strBox = new Book<>();
		strBox.put("r");
		strBox.put("s");
		String strValue = strBox.get();
		System.out.println("String value : " + strValue);
		
	}

}