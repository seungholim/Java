package com.kh.staticVar;

public class StudentMain {

	public static void main(String[] args) {
		StaticVar stKim = new StaticVar();
		stKim.setStudentName("Kh�л�1");
		System.out.println(stKim.serialNum);
		
		//�б����� �л��� ȸ������
		//�ϴ� �츮�б� �л��� �´��� Ȯ�� �ʿ� > �ø��� �ѹ��� ��������
		stKim.serialNum++;
		
		StaticVar stLee = new StaticVar();
		stLee.setStudentName("Kh�л�2");
		
		System.out.print("Kh �л�1 : ");
		System.out.println(stKim.serialNum);
		
		System.out.print("Kh �л�2 : ");
		System.out.println(stLee.serialNum);
		
		//���: static������ main()�ּ� ����ϰ�, �� ���� ���� ����?�� ������
	}

}
