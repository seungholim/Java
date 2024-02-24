package com.kh.collectionMain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionMain {

	public static void main(String[] args) {
		// List
		List<String> myList = new ArrayList<>();
		myList.add("���");
		myList.add("�ٳ���");
		myList.add("����");
		
		System.out.println("List : ");
		// ���� for�� Ȱ���ؼ� ���
		for(String fruit : myList) {
			System.out.println(fruit);
		}
		
		// set ����
		Set<Integer> myset = new HashSet<>();
		myset.add(1);
		myset.add(2);
		myset.add(3);
		myset.add(2); //�ߺ��� ��Ҵ� ��� �ź�
		
		for(Integer number : myset) {
			System.out.println(number);
		}
		
		//Map ����
		Map<String, Integer> myMap = new HashMap<>();
		//������ȣ�� �����..
		myMap.put("�ѱ�", 82); //put��� (add X)
		myMap.put("�Ϻ�", 81);
		myMap.put("�߱�", 86);
		myMap.put("�̱�", 1);
		myMap.put("������", 43);
		myMap.put("����", 49);
		myMap.put("������", 34); //������ �ߺ� ���x, ���� �������� ���� ����� �����
		
		for(String country : myMap.keySet()) {
			int code = myMap.get(country);
			System.out.println(country + " : " + code);
			//��������X
		}
	}

}
