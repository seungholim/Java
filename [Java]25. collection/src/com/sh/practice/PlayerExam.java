package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class PlayerExam {

	public static void main(String[] args) {
		// �̸� ���� ã�� ��¼��
		// HashMap ����
		Map<String, Integer> playerInfo = new HashMap<>();
		
		// �̸��� ���̸� �߰�������
		playerInfo.put("������", 17);
		playerInfo.put("����", 18);
		playerInfo.put("�����", 19);
		playerInfo.put("���ڰ�", 20);
		playerInfo.put("������", 17);
		
		
		//containsKey(), containsValue() : �⺻������ boolean�������� ����
		System.out.println(playerInfo.containsKey("�����"));
		System.out.println(playerInfo.containsValue(20)); //truefalse(�ֳ�����..)��ȯ
		
		//----------------------------------------------------------
		
		// Ư�� �л� �̸� �˻�(key) > ���� ����(value)
		String playerName = "����"; //���࿡ ������ �ִٸ�..
		if(playerInfo.containsKey(playerName)) {
			int age = playerInfo.get(playerName); //������ ���̸� ������
			System.out.println(playerName + "�� ���� : " + age +"��");
		} else {
			System.out.println(playerName + "�� ������ ã�� �� �����ϴ�.");
		}
		
		/*
		// Ư�� �л� ����(value) �˻� > �̸� ����(key)
		int playerAge = 17;
		if(playerInfo.containsValue(playerAge)) {
			String name = playerInfo.get(playerAge); //value�� ��� get����?
			//���µ�...
			System.out.println(playerAge + "�� �л� : " + name );
		} else {
			System.out.println(playerAge + "���� ������ ã�� �� �����ϴ�.");
		}
		*/
		
	}

}
