package com.kh.instance.cafe;

public class CafeMain {

	public static void main(String[] args) {
		// ������
		Cafe client1 = new Cafe("�ٴҶ��","Grande", false);
		// ����
		Cafe june = new Cafe("��Ǫġ��", "tall", false);
		// ������
		Cafe summer = new Cafe("�۶�", "tall", true);
		
		//makeDrinks �޼��� ȣ��
		client1.makeDrinks();
		june.makeDrinks();
		summer.makeDrinks();
	}

}