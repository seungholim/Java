package com.kh.pattern.mvc;

import com.kh.pattern.mvc.Model.StudentModel; 
import com.kh.pattern.mvc.View.StudentView;
import com.kh.pattern.mvc.controller.StudentController;

public class StudentClient {
	
	// MVC ������ ����ؼ� �л������� �ٷ�� ��

	public static void main(String[] args) {
		// model ��ü ����
		StudentModel model = new StudentModel("������",13);
		// view ��ü ����
		StudentView view = new StudentView();
		// controller ��ü ���� (model, view ����)
		StudentController controller = new StudentController(model,view);
		// �л� ������ ������Ʈ�ؼ� ���
		controller.updateView();
		// �л� ������ ������Ʈ ����~
		controller.setstudentName("�̸�������Ʈ");
		controller.setstudentAge(18);
		// ������Ʈ �� �л� ������ �������~
		controller.updateView();

	}
}

