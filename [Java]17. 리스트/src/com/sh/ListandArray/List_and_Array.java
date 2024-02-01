package com.kh.ListandArray;

import java.util.ArrayList;
import java.util.List;

public class List_and_Array {

	public static void main(String[] args) { 
		
		List_and_Array LA = new List_and_Array();
		LA.ListArray1(); //heap �޸�
		
		ListArray2(); //static�޸𸮷� �̵� (�۾�ü���� �ٸ��� ����)
	}
	
	public void ListArray1() { //static
		//Array ����
		int[] intArray = new int[2]; //ũ�Ⱑ 2�� �����迭 intArray����
		intArray[0]=1;
		intArray[1]=2;
		
		//Array ���
		System.out.println("Array ��� : ");
		for(int i=0 ; i < intArray.length ; i++) {
			System.out.println(intArray[i]);
		}
		
		System.out.println("-------------------\n");
		
		//List ����
										//�� �迭 ����Ʈ ����
			List<Integer> intList = new ArrayList<>(); //Integer: ��ü�� �����ϴ� Array
			intList.add(1);
			intList.add(2);
			intList.add(3);
			intList.add(4);
		
			//List ���
			System.out.println("List ��� : ");
			for(int num : intList) {
				System.out.println(num + " ");
			}
	}

		
	public static void ListArray2() { //static
		//String���� ���� �� Array�� List����غ���
		//1.Array
		
		String[] fruits = new String[4];
		
		fruits[0] = "����";
		fruits[1] = "����";
		fruits[2] = "���";
		fruits[3] = "�޷�";
		
		System.out.println("���� : ");
		for(int i=0 ; i < fruits.length ; i++) {
			System.out.print(fruits[i] + ", ");
		}
		
		System.out.println();
		
		//2.List
		List<String> StringList = new ArrayList<>(); //String �޴� ���..
		StringList.add("����");
		StringList.add("����");
		StringList.add("����");
		StringList.add("����");
		
		System.out.println("���� List : ");
		for(String item : StringList) {
			System.out.print(item + ", ");
		}
		
	}
		
}
