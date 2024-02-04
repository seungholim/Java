package com.kh.foodStore;

import java.util.ArrayList;
import java.util.List;

//�ֹ� ��ü
public class Order implements FoodStore{
	private List<Menu> OrderMenus;
	
	public Order() {
		OrderMenus = new ArrayList<>();
	}
	
	@Override
	public void addMenu(String menu) {
		Menu menuA = new Menu(menu); //�Ķ���� ���� �Ȱ������ ������
		OrderMenus.add(menu);
	}
	
	@Override
	public void removeMenu(String menu) {
		System.out.println(menu);
	}
}