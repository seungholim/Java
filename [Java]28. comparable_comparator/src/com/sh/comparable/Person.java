package com.kh.comparable;

public class Person implements Comparable<Person> { // implements : �������̽� �����ϴ� ��ɾ�
	

	//����� �̸��� ���̸� �Ẹ�پ��
	private String name;
	private int age;
	
	//������
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override //������
	public int compareTo(Person otherPerson) { 
		/*compareTo(T o) 
			T : the type of object that this object may be compared to
			o : the object to be compared
		*/
		
		//���̸� �������� ��
			return this.age -otherPerson.age; //�ٸ� ����� ���̸� �����ٰ���
	}
	
	@Override
	public String toString() { //������ ���ְ���!
		return "Person {name=" + name + "age= " + age + "}";
	}

} 