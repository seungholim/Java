package com.kh.example.practice3.model.vo;

public class Circle {
	//1.�ʵ�(�������)
	double Pi = 3.14; //������
	int radius = 2; //������
	
	//2.������
	public Circle(double Pi, int radius) {//���� ������ �ʱ�ȭ
		/*
		�⺻ �����ڷ� ���ΰ� �ƹ��� �ʱ�ȭ�� �������� �ʴ´�
		this.Pi = 3.14;
		this.radius = radius; //1�� �ʱ�ȭ........�ؾߵɱ�..............
		*/
		
	}
	
	//3.�� ���� ��� �޼ҵ�
	
	public void incrementRadius() {
		radius++ ;
		System.out.println("���� �𸣰�����.. ��ư ������ ����.. : " + radius);
	}
	
	public void getAreaOfCircle() {
		System.out.println("���� : " + (Pi*radius*radius));
	}
	
	public void getSizeOfCircle() {
		System.out.println("�ѷ� : " + (2*Pi*radius));
	}

}
