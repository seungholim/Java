package com.kh.genericsPractice;


import java.util.ArrayList;

public class PracticeMain {

	public static void main(String[] args) {
		//String Integer T����Ͽ� ���
		PracticeMain pm = new PracticeMain();
		pm.practice1();
		
	}
	
	public void practice1() {
		ArrayList<String> strList = new ArrayList<>();
		strList.add("������");
		strList.add("������");
		strList.add("ġ�ڸ�Ÿ");
		
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(155);
		intList.add(158);
		intList.add(161);
		
		//���ʸ� �޼��� ���
		printList(intList);
		printList(strList);
	}
	
	public void practice2() {

	}
	
	//���ʸ� �޼��� ����
	public static <T> void printList(ArrayList<T> list) {
		for (T item : list) {
			System.out.println(item);
		}
		

}
}