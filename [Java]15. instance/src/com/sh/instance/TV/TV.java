package com.kh.instance.TV;

public class TV {
	// TV�� ������!
	
	// TV�� �Ӽ�(�ʵ�)
	String color; //tv���� 
	boolean power; //��������
	int channel;
	
	//TV�� ���(�޼���)
	public void power() {
		power = !power; //��������
	}
	
	//
	public void channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}
}
