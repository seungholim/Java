package com.kh.classSample;

public class Car {
	
	//1. ���� �ʵ� �������
	String brand; //�귣��
	String model; //��
	int speed; //�ӵ�
	boolean engineOn; //���� ����
	/*================================================
	 * ������� �ؿ��� ��� �޼���� ����
	 */
	
	//2. ������ (�޼����� ����)
	public Car(String brand, String model) { 
				//���� �� �� �ʼ��� ���� �Ķ���ʹ� �귣��� ��
		System.out.println("Car�� ����"); //��� �޼���
		this.brand = brand; //�ǳ� �ʱ�ȭ �����ش�
		//this.brand = "KN" ;//������ KN �귣�� �ȿ����� ���ھ�... > CarMain���� KN�� ����
		this.model = model;
		this.speed = 0;
		this.engineOn = true;
	}
	
	//3. ���� ���� �޼��� (���� ������ �� ������ �� ���ư����� üũ)
	public void startEngine() { //void 
		System.out.println("�� ���� " + brand + "�Դϴ�.");
		//���࿡ ������ true : ���� �õ�
		if(engineOn) {
			System.out.println("������ �õ��մϴ�."); //��� �޼ҵ� �ۼ�
		} else { //false : �̹� ������ �����ִ�
			System.out.println("�̹� ������ ���� �ֽ��ϴ�.");
		}
	}
	
	//4. ���� �޼���
	public void acclerate(int amount) {//�Ķ���� �̸�(amount) : ���� ǥ���ϰ���� �̸� ����� ���� ��...
		if(engineOn) {
			//������ true�� ���� �ӵ��� �󸶴�.
			speed = speed + amount; //????
			System.out.println("�ӵ� " + amount + "�Դϴ�."); //????
		} else {
			//������ false�� ������ �����־� �ӵ��� �� �� ����.
			System.out.println("�ӵ��� �� �� ����");
		}
		
		
	}
}

/**
�޼���(Method) :
Ư�� �۾��� �����ϱ� ���� �ڵ��� �Լ�. 
Ŭ���� ���� ���ǵǸ�, Ŭ������ ��ü���� �ش� �޼��带 �����Ͽ� ����� �� ����
	��ü�� ���¸� �����ϰų� ��ü�� ���� �۾��� �����ϴµ� ���
	
	ex) System.out.println(); :  ��� �޼���
	
�Ű�����(Parameter) :
	 �Լ��� ���ǿ��� ���� ���� �μ��� �Լ� ���η� �����ϱ� ���� ����ϴ� ����
**/