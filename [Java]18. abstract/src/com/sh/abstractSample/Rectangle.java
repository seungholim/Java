package com.kh.abstractSample;

public class Rectangle extends RectangleShape {
	private double width;
	private double heigth;
	
	//������
	public Rectangle(String color, double width, double heigth) {
		super(color); //RectangleShapeŬ�������� color ��ӹ޾ƿ���
		this.width = width;
		this.heigth = heigth;
	}
	
	@Override //�߻�޼��� ���� �����ָ� Ŭ���� ������
	//�� �� claculateArea �׳� ��� ����? �̷��Ÿ� �� �� ��?
	public double calculateArea() {
		return width*heigth;
	} //���� ���� �Ϸ������..
	
}
