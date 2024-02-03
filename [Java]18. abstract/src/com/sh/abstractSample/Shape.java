package com.kh.abstractSample;
//�߻�Ŭ���� ����
abstract class Shape {
	//�Ϲ� �ʵ�
	private String color;
	
	//�߻� �޼��� (���� Ŭ�������� �����ؾ� ��)
	abstract double calculateArea();
	
	//������
	public Shape(String color) {
		this.color = color;
	}
	
	//�Ϲ� �޼��� (Getter, Setter)
	public void setColor(String color) { //�޼���: �����̵� ���̵�� �� �� �ϳ� ���� �ʼ�
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

}