package com.kh.thisSample;
/*
 int x = 10; //���� x�� 10�� �Ҵ�
 int y = x;  //�������� y : x�� ����Ų��.
		
 x = 20;
		
 System.out.println("y : " +  y); // y = 10
		
 int[] list1 =  {1,2,3};
 int[] list2 = list1; //�������� list2
 //��������: ���� ���������� �Է��ؼ� ���� �ʰ�, �ٸ� ���� �����ؼ� ���� ��� ����
 
 
  this	��ü(=�ν��Ͻ�) �ڽ��� ����Ű�� '����'���� ��ü(=�ν��Ͻ�)�� �ּҰ� ����Ǿ�����
  this() ���� Ŭ������ �ٸ� �����ڸ� ȣ���ϴµ� ���
*/

class Myclass{
	int myField; //this.myField
	
	//ù ��° ������
	Myclass(){
		//this.myField = 0;
		this(0); //this() ����ؼ� �ٸ� ������ ȣ��
	}
	
	//�� ��° ������
	Myclass(int value){
		this.myField = value;
	}
	
	void printValue(){
		System.out.println("myField�� �� : " + this.myField);
	}
}

public class ThisMain {
	public static void main(String[] args) {
		
		Myclass obj1 = new Myclass(); //ù ��° ������ ȣ��
		Myclass obj2 = new Myclass(10); //�� ��° ������ ȣ��
		
		obj1.printValue();
		obj2.printValue();

	}
}