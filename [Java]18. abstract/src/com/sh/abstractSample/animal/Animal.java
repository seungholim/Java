package com.kh.abstractSample.animal;
//�߻�Ŭ���� �����
abstract class Animal { //������ ����� �ȵȰſ� ���� ����������? �ᵵ �׸� �Ƚᵵ �׸�
	//���� �̸�~
	String name;
	
	//�߻� �޼��� (���� �����Ҹ�)
	abstract void animalVoice();
	
	//������
	public Animal(String name) {
		this.name = name;
	}
	
	//�Ϲ� �޼���
	public void displayName() {
		System.out.println("�����̸� : " + name);
	}

}
