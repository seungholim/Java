package com.kh.arraysample;

public class TwoArray { //���߹迭

	public static void main(String[] args) {
		
		// ���� ���ڿ� �迭 ����� �ʱ�ȭ
		String[][] fruits = {
				{"Apple", "Banana", "Cherry"},
				{"Grapes", "Orange", "Strawberry"},
				{"Kiwi", "Mango", "Pineapple"}
		};
		
		System.out.println("fruits.length : " + fruits.length + "\n");

		for (int i = 0 ; i < fruits.length ; i++) { //���� ��Ÿ���� ù ��° ����
			System.out.println(i + "��");
			for(int a = 0 ; a < fruits[i].length ; a++) { //���� ��Ÿ���� �� ��° ����
				System.out.print(fruits[i][a] + " ");
				System.out.print(a + "��" + " / ");
			}
			System.out.println(); //���������� �̵��� �� �ְ� enter�� ��� �޼ҵ� �Է�
		}
		
	}

} 
