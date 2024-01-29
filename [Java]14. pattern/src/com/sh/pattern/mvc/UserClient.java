package com.kh.pattern.mvc;

import com.kh.pattern.mvc.Model.UserModel;
import com.kh.pattern.mvc.View.UserView;
import com.kh.pattern.mvc.controller.UserController;

public class UserClient {
	//MVC ������ ����ؼ� �л������� �ٷ�� �� > �ܼ��� ������ ���� �� (MVC���Ͽ� ���� X)
	
	//�� ��ü ����
	UserModel user = new UserModel("ȫ�浿",20);
	
	//View ��ü ����
	UserView view = new UserView();
	
	//Controller ��ü ����
	UserController controller = new UserController(user, view);
	
	public static void main(String[] args) {
		//Ŭ���̾�Ʈ : �ܼ� ��� �뵵
	}

}
