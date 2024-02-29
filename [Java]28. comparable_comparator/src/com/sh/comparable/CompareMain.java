package com.kh.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareMain {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("�����", 19));
		people.add(new Person("���ڰ�", 20));
		people.add(new Person("�ȳ���", 17));
		
		// ���̸� �������� ����
		Collections.sort(people); //collection import�ʿ�
		
		for(Person person : people) {
			System.out.println(person);
		}

	}

}