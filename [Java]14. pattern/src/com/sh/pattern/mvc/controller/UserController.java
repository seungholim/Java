package com.kh.pattern.mvc.controller;

import com.kh.pattern.mvc.Model.UserModel;
import com.kh.pattern.mvc.View.UserView;

public class UserController { 
	// Model�� View�� �����ϴ� ��
	// ����� �Է��� ó���ϴ� ��
	
	private UserModel usermodel;
	private UserView userview;

	public void setModel(UserModel usermodel) {
		this.usermodel = usermodel;
	}
	
	public void setView(UserView userview) {
		this.userview = userview;
	}
	
	public UserModel getModel() {
		return usermodel;
	}
	
	public UserView getView() {
		return userview;
	}
	


	//��Ʈ�ѷ� ��ü ���� �� �� �� ����
	public UserController(UserModel usermodel, UserView userview) {
		this.usermodel = usermodel; //�� ��������
		this.userview = userview; //���°� ��������
	}

}
