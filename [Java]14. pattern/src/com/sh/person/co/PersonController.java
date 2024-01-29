package com.kh.person.co;

import com.kh.person.mo.PersonModel;
import com.kh.person.vo.PersonView;

public class PersonController { //����� �Է��� ó���ϴ� ��
	
	//Model�� View�� �����ϱ� ���� import
	private PersonModel model;
	private PersonView view;
	
	public PersonController (PersonModel model, PersonView view) {
		this.model = model;
		this.view = view;
	}
	
	public void run() {
		String userInput = view.getUserInput();
		//model.setName(userInput); �̰�..���Ϸ� ���°���
		System.out.println("��� �̸� : " + userInput);
	}

}
