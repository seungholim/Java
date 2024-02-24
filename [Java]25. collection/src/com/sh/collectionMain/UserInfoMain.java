package com.kh.collectionMain;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInfoMain {

	public static void main(String[] args) {
		// HashMap ���� UserLevel
		Map<String, Integer> UserLevel = new HashMap<>();
		
		// ������ �̸��� ����
		UserLevel.put("����", 62);
		UserLevel.put("����ȣ", 45);
		UserLevel.put("������", 43);
		UserLevel.put("����", 76);
		UserLevel.put("ĭ��", 82);
		UserLevel.put("��Ź", 81);
		UserLevel.put("��ĥ�θ�����", 97);
		
		// Ư�� ���� �˻�
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��Ϸ��� ���� ���̵� �Է��ϼ��� : ");
		String UserID = sc.next();
		
		if(UserLevel.containsKey(UserID)) {
			int level = UserLevel.get(UserID);
			System.out.println(UserID + "�� ���� : " + level);
		} else {
			System.out.println(UserID + "�� ������ ã�� �� �����ϴ�..");
		}
		
		// ��� �л��� ���� ���
		System.out.println("=====��ü ���� ����=====");
		for(Map.Entry<String, Integer> entry : UserLevel.entrySet()) {
			String ID = entry.getKey();
			int level = entry.getValue();
			System.out.println(ID + " : lv." + level);
		}
		
		// ���� ���� ����
		String UserUpdate = "����";
		int newlevel = 100;
		UserLevel.put(UserUpdate, newlevel);
		System.out.println(UserUpdate + "�� ������ " + newlevel + "�� �����߽��ϴ�..");
		
		// ���� Ż��
		String removeUser = "����ȣ";
		UserLevel.remove(removeUser);
		System.out.println(removeUser + "�� ������ �����߽��ϴ�");
		
		// ���� ���� ���� ���
		System.out.println("���� ���� ���� : ");
		for(Map.Entry<String, Integer> entry : UserLevel.entrySet()) {
			String ID = entry.getKey();
			int level = entry.getValue();
			System.out.println(ID + " : lv." + level);
		}
	}

}
