package com.kh.classSample;

public class CarMain {

	public static void main(String[] args) {
		
		//public Car(String brand, String model) > Car.java �Ű����� ����(�귣��� ���� �ʼ��� �ֱ�� ���ݾ�..)
		
		Car System = new Car("Toyota", "Carmy"); //�ڵ���(Car)�� ��ü ���� (new: �ϳ��� ��ü�� ���� �����ϰھ��~)
		//�ٸ��� ���� �귣��, ���� string�� ������ �־��ݴϴ�
		
		System.startEngine();
		System.acclerate(50);

	}

}
