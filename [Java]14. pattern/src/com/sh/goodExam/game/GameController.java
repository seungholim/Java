package com.kh.goodExam.game;

import java.util.Scanner;

public class GameController {
	
	private GameModel model; //����������� ��ü �� ��������
	private GameView view;

	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view;
	}
	
	public void runGame() {
		
		//���� �޼��� �����ִ°� ����ϰ�
		view.displayMessage();
		//��ĳ�� �Է��ؼ� �Է°� ȣ��
		Scanner sc = new Scanner(System.in);
		
		while(true) { //boolean isTrue�� ��� ����
		//��ǻ�Ͱ� ������ ���ڸ� ������ �� �ҷ��� view
		//���ڸ� �����ϴ� ���� �Է�����
		view.displayGuessPrompt();
		int guess = sc.nextInt();
		
		if(model.inCorrectGuess(guess)) {
			view.displayCorrectGuess(); 
			view.displayAttempts(model.getAttempts());
			break;
		} else {
			//Ʋ���� �� view
			view.displayIncorrectGuess(); //��~ �ٽ� �õ��ϼ���^^
			//updown if�� �ۼ��ϰ�ʹ�
			view.displayAttempts(model.getAttempts());
		}
		}
		
	}
	
	public static void main(String[] args) {
		GameModel m = new GameModel();
		GameView v = new GameView();
		GameController c = new GameController(m,v);
		
		c.runGame();
	}
}
