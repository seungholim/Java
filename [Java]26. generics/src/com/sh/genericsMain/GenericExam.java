package com.kh.genericsMain;

public class GenericExam {

	public static void main(String[] args) {
		// ������ �����͸� �����ϴ� Book �ν��Ͻ� ����
		Book<Integer> intBook = new Book<>();
		intBook.put(82);
		intBook.put(1);
		int intValue = intBook.get(); //����ȯ�� �ʿ� ����
		
		//���ڿ� �����͸� �����ϴ� Book �ν��Ͻ� ����
		Book<String> strBook = new Book<>();
		strBook.put("��������");
		strBook.put("ȣ������");
		strBook.put("��������");
		strBook.put("�ſ�����");
		
		String strValue  = strBook.get();//����ȯ �ʿ�X
		
		//���ʸ� Ŭ������ ����ؼ� �پ��� ������ ������ ó���� �� �ְ�
		//��µ� ����
		System.out.println("Int value : " + intValue);
		System.out.println("String Valie : " + strValue);
		
	}

}
