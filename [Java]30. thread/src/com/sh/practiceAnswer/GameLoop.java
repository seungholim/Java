package com.kh.practiceAnswer;

public class GameLoop implements Runnable {
	 private static boolean isGameOver = false;
	    
	public static void setGameOver(boolean isGameOver) {
		GameLoop.isGameOver = isGameOver;
	}
	@Override
   public void run() {
       //boolean isGameOver = false;
       while (!isGameOver) {
           // ���� ���� ����
           int randomValue = new java.util.Random().nextInt(10); // ������ ���� ����
           System.out.println("������ ����: " + randomValue);

           // ���� ���� ���� �ð�
           try {
               Thread.sleep(1000); // 1�� ���
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       System.out.println("���� ���Ḧ ���ϸ� EnterŰ�� �����ּ���");
       }
       System.out.println("���� ����");
   }
}