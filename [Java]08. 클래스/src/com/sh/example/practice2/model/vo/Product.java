package com.kh.example.practice2.model.vo;

public class Product {
	//1. ������� ����
	private String  pname ;
	private int  price ;
	private String brand ;
		
	//2. ������ this�� Ȱ���ؼ� ������ ��
	//+ Product()
	public Product(String pname, int price, String brand) {
		this.pname = pname;
		this.price = price; //�ʱⰪ 0�� ������ � ���� �־ ������ ��µ��� X
		this.brand = brand;
	}
	
	 //3. ���� ��� �޼ҵ� �����
	 //+ information() : void
	 public void information() {
		 //sysout + ctrl + space = ��¸޼ҵ� �ϼ�
		 
		 System.out.println("��ǰ�� :" + pname);
		 System.out.println("���� :" + price + "��");
		 System.out.println("�귣�� :" + brand + "\n");
	 }

}
