package com.kh.classCircle;

public class Circle {
	
	//1. ������� (�ʵ�) > �������� �ܺο��� �ǵ��� ���ϰ� privateó��
	//private static final double Pi = 3.14;�����ص� ��� ���� (�޸� ���� ��ġ�� �޶���)
	private final double Pi = 3.14; //Pi = ��� (���� ������ �ʴ� ��)
	private int radius = 1; //����
	
	//2. ������
	public Circle() {
		//�⺻������
	}
	
	//3. �޼ҵ�
	//�������� ���� ���
	public void inRadius() {
		//������ ����: ������ų ���� ������ �� �ִ�
		radius ++ ;
	}
	
	//���� ���̸� ����ϰ� ����ϴ� �޼ҵ�
	public void AreaCircle() {
		double area = Pi * radius * radius;
		System.out.println("���� ���� : " + area);
	}
	
	//
	public void SizeOfCircle() {
		System.out.println("���� ũ��(������) : " + radius);
	}

}