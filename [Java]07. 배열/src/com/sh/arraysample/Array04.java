package com.kh.arraysample;

public class Array04 {
	public static void main(String[] args) {
		
		// Array ����
		
		/*
		String[] inturnArray = {"������","�罺��","��Ÿġ","����","īī��"};
		
		//��Ÿġ�� Ż���ؼ� �� ���´�. �׷��� 
		
		inturnArray[2] = "���ƶ�"; //��� ����!
		*/
		
		/* ���� String[] fruitArray = {"���","����","Ű��","�޷�","��");
		��� > �ٳ���, ���� > ����, Ű�� > ����, �޷� > ��, ��> ������
		*/
		
		String[] fruitArray = {"���","����","Ű��","�޷�","��"};
		
		fruitArray[0] = "�ٳ���";
		fruitArray[1] = "����";
		fruitArray[2] = "����";
		fruitArray[3] = "��";
		fruitArray[4] = "������";
		
		System.out.print(fruitArray); //[Ljava.lang.String;@5e91993f
	} 

}
