package com.kh.circle.mo;

public class CircleModel { //���� ������ ��� ǥ���� ���ΰ�..
	
	//private double pi = 3.14; //������
	private double r; //���� ������ �������� ���� ǥ���ϰڴ�~
	
	public CircleModel() { //default�����ڶ� ���� ���� �ʾƵ� ok >�Ű������� �ӿ� x
		//this.r  = r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	public double calculateArea() {
		return (3.14*r*r);
	}

}
