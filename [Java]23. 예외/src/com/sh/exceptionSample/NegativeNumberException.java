package com.kh.exceptionSample;

public class NegativeNumberException extends Exception {
											 //Exception ����� �޴� Ŭ���� ����
	//NegativeNumberException : ����� ���� ���� Ŭ����
	
	//Exception : ��Ÿ�� ������ �¸��� �� ��
	//RuntimeException : �ļ�
	//IndexOutOfBound��¼�� : ���ļ�
	//  ~~~ : �����ļ�
	// �����ļ� > ���ļ��� Ÿ�� �ö󰡰� > �ļ��� Ÿ�� ���� > ������ Ÿ����.. �׷��� Exception�� ����մϴ�
	
	public NegativeNumberException(String msg) {
		super(msg);
	}
}