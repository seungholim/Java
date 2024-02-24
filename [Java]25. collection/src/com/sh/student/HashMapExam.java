package com.kh.student;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {

	public static void main(String[] args) {
		// HashMap ����
		Map<String, Integer> studentGrades = new HashMap<>();
		
		// �л�, ���� �߰�
		studentGrades.put("KENSO", 95);
		studentGrades.put("KYO", 100);
		studentGrades.put("RUGAL", 41);
		studentGrades.put("EN", 67);
		
		// Ư�� �л��� ���� �˻�
		// containsKey : �ʿ��� ''Key(Ű)'', value(��)�� �ִ��� Ȯ��
		String studentName = "KENSO";
		// ���࿡ �л��� �߿��� Bob�� �ִٸ� ������ ������
		if(studentGrades.containsKey(studentName)) {
			int grade = studentGrades.get(studentName);
			System.out.println(studentName + "�� ���� : " + grade);
		} else {
			System.out.println(studentName + "�� ������ ã�� �� �����ϴ�;;");
		}
		
		
		/* Map.Entry : �������̽��� �Բ� ���Ǵ� �������̽�
		//getKey():��ü�� Ű�� ��ȯ
		//getValue(): ��ü�� ���� ��ȯ
		*/ 
		//��� �л��� ���� ���
		System.out.println("===��ü �л� ����===");
		for(Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
			//���for����¼��
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}
		
		
		// �л� ������ �߸� �Է��ߴ�.. ������ �ʿ���
		String StudentUpdate = "KENSO";
		int newGrade = 98;
		studentGrades.put(StudentUpdate, newGrade);
		System.out.println(StudentUpdate + "�� ������ " + newGrade + "�� �����߽��ϴ�..");

		// �л� ����
		String removeStudent = "KYO";
		studentGrades.remove(removeStudent);
		System.out.println(removeStudent + "�� ������ �����߽��ϴ�");
		
		// ���� �л� ���� ���
		System.out.println("���� �л� ���� : ");
		for (Map.Entry<String,Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + ":" + age);
		}
	}

}