package com.kh.threadMain;

public class ThreadPirorityExam {

	public static void main(String[] args) {
		
			StudentThread st1 = new StudentThread("�л� 1");
			StudentThread st2 = new StudentThread("�л� 2");
			
			// �����忡 �켱���� ����
			st1.setPriority(Thread.MAX_PRIORITY);
			st2.setPriority(Thread.MAX_PRIORITY);
			
			//������ ����
			st1.start();
			st2.start();
		
	}

}