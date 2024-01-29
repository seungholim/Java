package com.kh.circle.co;

import com.kh.circle.mo.CircleModel;
import com.kh.circle.vo.CircleView;

public class CircleController { //����� �Է��� ó���ϴ� ��
	
	//Model�� View�� �����ϱ� ���� import
	private CircleModel model; //�𵨿���.. �ʿ��� �����͸� ������
	private CircleView view; //������ �����͸� �信 �����ؾ���
	
	public CircleController (CircleModel model, CircleView view) {
		this.model = model;
		this.view = view;
	}
	
	public void run() { //�信 ��û�� �����͸� ������ �Լ�
		double userInput = view.getUserInput();
		model.setR(userInput);
		double result = model.calculateArea();
		System.out.println("���� ���� : " + result);
	}

}