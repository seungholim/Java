package com.kh.variable; //���: OS(C����̺�)>�����>user1>Java_Workspace>src>com>kh>variable

public class Variable {
	public static void main(String[] args) {
		
		/* ������ ����
		// 1. ������ �̸��� ������, ����, _, $ �� ���� ����
		int a; // int, String ���: ���� ������ ���� ����!!!!(ex 1byte��ŭ, 8byte��ŭ...)
		a = 10;
		
		// 2. ������ �̸��� ���ڷ� ������ �� ����
		// 3. ���� �̸� ���̿��� ���� �Ұ� (����� ��Ģ���� ����� ���� ���� ������ �� ����ϱ� ����)
		// 4. �ڹٿ��� �̸� ������ ���� ���� �̸����� ������� ���Ѵ�
		
		// �Ǽ��� (float, double)
		float pie1 = 3.1415929999f; //float�� �Ҽ��� �������� f�� �빮�� F�� �ۼ����ش�~
		double pie2 = 3.1415929999; 
		
		System.out.println("float: " + pie1);
		System.out.println("double: " + pie2);
		
		// byte: -128 ~127���� ��� ����
		// byte bt = -129; //int�� �����ϰų� ���� byte + byte�� ������ �־��ֱ�
		byte bt = 127;
		System.out.println(bt); // -129���� �� 128�̻���� ����� ���� ����
		
		//short = -32,768 ~ 32,767���� ��밡��
		short shrt = -32767;
		System.out.println(shrt);
		
		// int: -2,147,483,648 ~ 2,147,483,647 ���� ��� ����
		int nt = -2147483648;
		System.out.println(nt);
		
		// long: -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		long lng = 2000L; // long�� �ڿ� L�̳�, l�� �ٿ��ش� (���� int �ڵ���ȯ ���� �� ����)
		*/
		
		// ������ ����
		// String: �⺻���� �ڷ����� ������ ������ �⺻������ ���� (�׷��� �Ƹ���.. �빮�ڷ� �����ϵ��� ǥ���ϴ� ��)
		// String " "�� ' ' �ȿ� ���ڸ� �ۼ��� ��
		//String name = "���̾�";
		
		// char : ������ ���ڸ� �� ���ڸ� ������ �� ����
		// char ' '; (ū����ǥ ���Ұ�)
		char chr1 = '��';
		System.out.println(chr1);
		
		// ���� ����
		// boolean �� true�� false�� ǥ���Ѵ�.
		// boolean bln = true; or false;
		boolean bln = true;
		System.out.println(bln);
		boolean bln2 = false; 
		System.out.println(bln2);
		
		System.out.println("�ȳ��ϼ���. ���� �������Դϴ�.");
		String name = "������";
		System.out.println("�ȳ��ϼ���. ���� " + name + "�Դϴ�.");
		// �� �� Ÿ���� ������ ������ �缱���� ���� �ʰ� ���� ����
		// �� �� ������ Ÿ���� ~�ٸ� Ÿ������~ �缱�� �Ұ���
		// ������ Ÿ���� �ٸ� Ÿ������ �����ؼ� ������ �� ����
		name = "������";
		System.out.println("�ȳ��ϼ���. ���� " + name + "�Դϴ�.");
		
		int age = 13;
		String favor = "�����峭��";
		System.out.println("�ȳ��ϼ���. ���� " + name + "�Դϴ�.");
		System.out.println("���� ���̴� " + age + "�� �̰�, ");
		System.out.println("���� ��̴� " + favor + "�Դϴ�.");
		
		char score = 'a';
		System.out.println("���� ������ " + score + "�Դϴ�.");
				
	}
}
