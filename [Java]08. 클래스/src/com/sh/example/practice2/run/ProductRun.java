package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product; //�޼��� ��������~ (���� 1ȸ�� �������� ���� ..��ĳ��ó��)

public class ProductRun {

	public static void main(String[] args) {
		// Product ���� 3�� �ϰ� ���� ��ǰ��, ����, �귣��� ����ϱ� 
		//string,int,string
		
		System.out.println("< Product ���� > \n");
		
		//��ǰ 3�� ��ü ����
		Product product1 = new Product("ĭ��",1000,"����");
		product1.information();
		
		Product product2 = new Product("��īĨ",1500,"������");
		product2.information();
		
		Product product3 = new Product("����Ĩ",1500,"û��");	
		product3.information();
	}

}
