package com.kh.collectionPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeCollection {

	public static void main(String[] args) {
		
		PracticeCollection pc = new PracticeCollection();
		pc.practiceList();
		pc.practiceSet();
		pc.practiceMap();
		
	}
	
	public void practiceList() {
		List<String> pracList = new ArrayList<>();
		//String add �غ��� ���� ���		
		pracList.add("������");
		pracList.add("������");
		pracList.add("ġ�ڸ�Ÿ");
		
		System.out.println("starting_vol2 : ");
		for(String starting_vol2 : pracList) {
			System.out.println(starting_vol2);
		}
	}
	
	public void practiceSet() {
		Set<String> pSet = new HashSet<>();
		//String add �غ��� ���� ��� �ߺ��� �� add �ؾ���
		pSet.add("�ٲٸ�");
		pSet.add("�ָ����");
		pSet.add("������");
		pSet.add("�ٲٸ�"); //�ߺ����XXXXXXXXXXXX
		
		System.out.println("starting_vol5 : ");
		for(String starting_vol5 : pSet) { //type : String���� �ٲ��ֱ�
			System.out.println(starting_vol5);
		}
	}
	
	public void practiceMap() {
		//Ű�� ���� �̿��ؼ� map put �� ���� ���� �������� ����غ���
		Map<String, Integer> pMap = new HashMap<>();
		pMap.put("������", 3713);
		pMap.put("������", 6216);
		pMap.put("������", 8616);
		pMap.put("�����", 4770);
		
		System.out.println("<!!!�츮����!!!>");
		for(String familiy : pMap.keySet()) {
			int code = pMap.get(familiy);
			System.out.println(familiy + " number : " + code);
		}		
	}

}
