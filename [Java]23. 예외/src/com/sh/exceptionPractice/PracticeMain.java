package com.kh.exceptionPractice;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain exmain = new PracticeMain();
		exmain.ArithException();
		exmain.NPException();
		exmain.NumFormatException();
	}
	
	public void ArithException() {
		// int dividend / divisor �������� �� ����ó��
		int dividend = 100;
		int divisor = 0;
		
		try {
			int result = (dividend/divisor); //0���� ������ �õ�~
			System.out.println("������ ��� : " + result);
		} catch(ArithmeticException a) {
			System.out.println("��������������" + a.getMessage());
		}
	}
	
	public void NPException () {
		String text = "Hello World";
		String subText = null;
		
		try {
			int length = text.indexOf(subText); 
			//indexOf(): Ư��������ġã��
			//subText�� �ִ� null���� ������ ���ڿ� �˻�
		} catch(NullPointerException n) {
			System.out.println("���ڿ� ������\n" + n.getMessage());
		}	
	}
	
	public void NumFormatException() {
		String text = "123.45";
		
		try {
			int number = Integer.parseInt(text); 
			//�������� ������ ���ڿ��� ������ ��ȯ�õ�
			System.out.println(number);
		} catch(NumberFormatException f) { //�׳� Exception�� ġ�� ���� �� ã��
			System.out.println("���ڸ� �������\n" + f.getMessage());
		}
	}
	
}