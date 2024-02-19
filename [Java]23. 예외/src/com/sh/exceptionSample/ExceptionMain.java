package com.kh.exceptionSample;

public class ExceptionMain {
/*
 	try {
		//���ܰ� �߻��� �� �ִ� �ڵ�
	} catch {
		//�߻��ϴ� ���� ó��
		//�ٸ� ���ܸ� ó���� �� �ִ� ����ó��
	} finally {
		//�׻� ����Ǵ� �ڵ� ���
	}
	
 */
	public static void main(String[] args) {
		ExceptionMain exmain = new ExceptionMain();
		//exmain.ExceptionAE();
		//exmain.ExceptionNE();
		//exmain.ExceptionF();
		exmain.ExceptionExam();
	}
	
	public void ExceptionAE() {
		try {
			int result = 10/0 ; //0���� ������ �õ�
			System.out.println("result : " + result);
			} catch(ArithmeticException a) { //a: ����� ���� �� �ִ� ���� ��
			/*
			 ArithmeticException: �������� ��� �������� �߻��ϴ� ����
			 ArithmeticException a: + ���� ������ ���� ��
			 e�� ������ ������ �޼����� getMassage()�� ���޹޴´�
			 */
			System.out.println("!��� �������� ���� �߻��� ����!" + a.getMessage());
			} //a.getMessage(): �����ȳ��޼���
		}
	
	public void ExceptionNE() {
		try {
			String text = null;
			int length = text.length(); //������ ���µ� text�κ��� ���ڿ� ���̸� ����
			System.out.println("text ����: " + length);
		} catch(NullPointerException n) {
			System.out.println("!�ؽ�Ʈ�� ���� �ʾ� �߻��� ����!\n" + n.getMessage());
		}
	}
	
	public void ExceptionF() {
		try {
			//850904
			String juminNumber = "�ȿ���904"; //����� �ȹٷ� �����ʴ� ������..
			int number = Integer.parseInt(juminNumber); //���ڿ��� ������ ��ȯ�õ�
			System.out.println("���� : " + number); //�ȿ� String�� ����ֱ� ������ ������ ���� ����
		} catch(NumberFormatException format) {
			System.out.println("���ڸ� �־��ּ���^^\n" + format.getMessage());
		}
	}

	public void ExceptionExam() {
		try {
			
			int[] numbers = {1,2,3,4,5};
			int index = 7; //�ε��� �ѹ� (��ȿ���� ����..����)
			int result = numbers[index]; //�迭��ҿ� ����
			System.out.println("Result : " + result);
			
		} catch(ArrayIndexOutOfBoundsException a) { //���� �迭���� �����ϰŰ���.. �� �ѹ� Ȯ���غ���
			//a: ��������
			System.out.println("�迭 �ε��� ������ ��� ���� �߻�\n" + a.getMessage());
		} catch(Exception e) { //Exception: ��� ���� �� Ȯ��
			System.out.println("�迭 �ε��� ���� ������ �ƴ����� ��ư �ٸ� ����");
		} finally { //�׻� ����Ǵ� ���
			System.out.println("Finally : ���α׷�������Ǿ����ϴ� �ȴ�");
		}

	}
}
