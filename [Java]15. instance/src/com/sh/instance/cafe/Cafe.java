package com.kh.instance.cafe;
//ī�並 �湮�߽��ϴ�
public class Cafe {
	private String menu; //��������
	private String size; //������
	private boolean isSugar; //���� �����Ŵ�
	
	public Cafe(String menu, String size, boolean isSugar) {
		
		this.menu = menu;
		this.size = size;
		this.isSugar = isSugar;
	}
	
	public void makeDrinks() {
		System.out.println("���ϴ� ���Ḧ ��������~");
		System.out.println("�޴� : " + menu);
		System.out.println("ũ�� : " + size);
		//���࿡ ������ �ִ´ٸ�
		if(isSugar) {
			System.out.println("�÷��߰� : " + isSugar +"\n");
		} else {
			System.out.println("�÷��߰� ����"+"\n");
		}
		
	}
}