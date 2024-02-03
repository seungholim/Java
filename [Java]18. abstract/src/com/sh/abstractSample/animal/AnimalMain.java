package com.kh.abstractSample.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Dog dog = new Dog("����" , "����");
		dog.displayName(); //displayName�� �̹� ��� ����� �ֱ� ������ system.out.print�� ���� ��� �Ұ�
		dog.animalVoice();
		
		//1.cat�����
		Cat cat = new Cat("����", "�Ŀ�");
		
		//2.��ü�迭�� Animal �����ؼ� ����ϱ� (�������� Ȱ���� ��ü �ٷ��)
		Animal[] animal = new Animal[3];
		//�߻�Ŭ������ ��ü�� �ƴ϶� animal[0] = new Animal(��¼��)�� ���� ���·� ��� �Ұ�
		animal[0] = new Dog("����","����");
		animal[1] = new Dog("����","�۸�");
		animal[1] = new Cat("����","�߿�");
		
		for(Animal i : animal) {
			i.displayName();
			i.animalVoice();
		}
		
	}
	
	
	

}