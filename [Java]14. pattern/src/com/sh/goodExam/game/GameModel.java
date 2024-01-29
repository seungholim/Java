package com.kh.goodExam.game;
//���� ���� ���߱� ���� ��
public class GameModel {
	private int secretNumber; //������ ��ȣ
	private int attempts; //�� �� �õ��ߴ°�?
	
	public GameModel() {
		//1~100 ������ ������ ���� �����ϱ� with����ȯ
		secretNumber = (int) (Math.random() *100)+1;
		attempts = 0; //���� �õ��� 0��
	}
	
	//��ǻ�Ͱ� �������� ������ ���� �� ��
	public int getSecretNumber( ) {
		return secretNumber;
	}
	
	public int getAttempts() {
		return attempts;
	}
	
	public void incrementAttempts() {
		attempts++;
	}
	
	public boolean inCorrectGuess(int guess) {
		//guess�� ���� �Է��߱� �빮�� ���� �޼��带 �߰�
		incrementAttempts(); 
		return guess == secretNumber;
		//���ڸ´��� Ȯ�����ִ� ���� �޼���
	}
}