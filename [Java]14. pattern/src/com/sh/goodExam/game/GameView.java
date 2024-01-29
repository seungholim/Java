package com.kh.goodExam.game;

public class GameView { //������ ����� ������
	//Vies : ���� ��� �޼���� ����
	//������� ���� �� �޼��忡 ������ ����..
	
	private String startMsg = "���� ���߱� ������ �����մϴ�.";
	private String startMsg2 = "1 ~ 100 ������ ���ڸ� ���纸����!";
	
	public void displayMessage() {
		System.out.println(startMsg);
		System.out.println(startMsg2);
	}
	
	//���ڸ� �����ϴ� �� �Է��ϰ� ������� Ʋ�ȴ��� ���°Ŷ� �õ�Ƚ�� & ��������
	
	//1. ���� �����ϴ� �� �Է��ϱ�
	private String scanMsg = "������ ���ڸ� �Է��ϼ��� : ";
	public void displayGuessPrompt() {
		System.out.print(scanMsg);
	}
	
	private String correctMsg = "���ڸ� ������ϴ�.";
	public void displayCorrectGuess() { 
		System.out.println(correctMsg);
	}
	
	private String incorrectMsg = "��~ �ٽ� �õ��ϼ���^^";
	public void displayIncorrectGuess() {
		System.out.println(incorrectMsg);
	}
	
	private String attemptMsg = "�õ�Ƚ�� : ";
	public void displayAttempts(int attempts) {
		System.out.println(attemptMsg + attempts);
	}
	
	private String upMsg = "up";
	public void displayUp() {
		System.out.println(upMsg);
	}
	
	private String downMsg = "down";
	public void displayDown() {
		System.out.println(downMsg);
	}
	
	private String gameoverMsg = "������ ����Ǿ����ϴ�";
	public void displayGameOver() {
		System.out.println(gameoverMsg);
	}

}
