package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		
		Dog myDog = new Dog("����");
		myDog.info();
		myDog.speak();
		
		Cat myCat = new Cat("����");
		myCat.info();
		myCat.run();
		
		Monkey myMonkey = new Monkey("�ʿ���");
		myMonkey.info();
		myMonkey.sleep();
		
		Lion myLion = new Lion("�ɹ�");
		myLion.info();
		myLion.roar();
	}

}