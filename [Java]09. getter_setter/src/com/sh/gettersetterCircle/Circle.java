package com.kh.gettersetterCircle;

public class Circle {
	
	//1. �������(�ʵ�)
	private final double Pi = 3.14; //Pi = ��� (���� ������ �ʴ� ��)
			//final : ������ ���� ���, �� ������ ������ �� ������ ����
	private int radius = 1; //����
	
	//Getter
	public double getPi() {
		return Pi;
	}
	
	public int getRadius() {
		return radius;
	}
	
	//Setter (PI���� ����� �����ؼ� Setter��� X)
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//�޼���
	
	//�������� ���� ���
	public void incrementRadius() {
		//������ ����: ������ų ���� ������ �� �ִ�
		radius ++ ;
	}
	
	//������ ��� �޼���
	public void getSizeOfCircle() {
		System.out.println("���� ũ��(������) : " + radius);
	}

	//���� ���̸� ����ϰ� ����ϴ� �޼���
	public void getAreaCircle() {
		double area = Pi * radius * radius;
		System.out.println("���� ���� : " + area);
	}
		

	
	
	

}
