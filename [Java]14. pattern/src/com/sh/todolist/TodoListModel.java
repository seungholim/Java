package com.kh.todolist;

public class TodoListModel {
	//�� �� ���
	private String items;
	
	//����� ������
	private String item;
	
	//������ ���ϰ� ����
	
	//���ʻ�����
	public TodoListModel(String text) {
		this.item = text; //item = text;
	}
	
	public String getItem() {
		return item;
	}
}
