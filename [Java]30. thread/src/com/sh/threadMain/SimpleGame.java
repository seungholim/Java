package com.kh.threadMain;

import java.io.IOException;
import java.util.Random;

// �̰��� ��Ƽ�������~
public class SimpleGame {
	
	private static boolean isGameOver = false; // static ������ �־������~
	
	public static void main(String[] args) {

		// ���� ���� ������ �����ϴ� ��~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// �ܺ� Ŭ������ �ν��Ͻ��� ����..
		SimpleGame s = new SimpleGame();
		
		// ������ ��������
		Thread gameThread = new Thread(s.new Gm()); // ������ �ν��Ͻ� �������� ��¼��
		gameThread.start();
		
		// ���� ���� ���� : �÷��̾ Enter Ű�� ������ ���� ����
		try {
			System.in.read();  
			//������� �Է��� Ű���带 byte ������ �о��ւ����? > trycatch�� �������ּ���^^
			//����ڰ� EnterŰ�� ���� ������ ���α׷� �Ͻ� ���� (�޽���, ��ȭ �Է¹��� �� �� ��..)
			
			isGameOver = true;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	class Gm implements Runnable{ //�� �� �� �Ẹ�����.....
		//��ø Ŭ���� �÷� ���麸��...
		@Override
		public void run() {
			while(!isGameOver) {
				//���� ���� ������ �ւ����.....
				int randomValue = new Random().nextInt(88);
				System.out.println("������ ���� : " + randomValue);
				
				//���� ���� ���� �ð�
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// ���� ���� ���� �ȳ�
				System.out.println("������ �����Ϸ��� EnterŰ�� �����ֽ���");
			}
			System.out.println("���� ��!");
		}
	}

}