package com.kh.threadPractice;

import java.util.Random;

public class GameLoop implements Runnable{
	
	static boolean isGameOver = false; //static������ �ھƹ�����
	
	@Override //run()�� �������̵� ���
	
	public void run() {
		
		while(!isGameOver) {
			
			int randomValue = new Random().nextInt(88);
			System.out.println("������ ���� : " + randomValue);
			
			try {
				Thread.sleep(1000); // 1�� sleep ����
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		System.out.println("���� ���Ḧ ���ϸ� EnterŰ�� �����ּ���");
		
		}
		// while�� Ż�� �� ������ �޽���
		System.out.println("������ ����Ǿ����ϴ�");
	}
}