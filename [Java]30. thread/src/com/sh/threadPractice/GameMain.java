package com.kh.threadPractice;

public class GameMain extends GameLoop { //GameLoop ���

	public static void main(String[] args) {
		
		// ���� ���� �����带 �����ϴ� ��
		// ������ ��������.......~
		Thread gameThread = new Thread(new GameLoop()); // gameThread��� �ν��Ͻ� ����
		gameThread.start(); //GameLoop�����带 �����ς����~
	
		/**
		 GameMain s = new GameMain(); //�ν��Ͻ� ���� ��
		 Thread gameThread = new Thread(s.new GameLoop()); //�� ���� �ʴ� ����?
		**/
		
		// ������ ���� ���� ���� (Enter�� �Է��ϸ� isGameOver�� true�� ��)
		
		
		try {
			System.in.read(); //�Է°��� �޴� �޼���
			isGameOver = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// trycatch���� GameLoop�� ������ �ȵǴ� ����
	}

}
