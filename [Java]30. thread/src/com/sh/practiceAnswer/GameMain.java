package com.kh.practiceAnswer;

public class GameMain {
    private static boolean isGameOver = false;
    public static boolean isGameOver() {
		return isGameOver;
	}
    public static void main(String[] args) {
        // �ܺ� Ŭ������ �ν��Ͻ� ����
//    	GGMain simpleGame = new GGMain();

    	GameLoop gameLoop = new GameLoop();
		//Thread gameThread = new Thread(new GameLoops());
		Thread gameThread= new Thread(gameLoop);
		
        // ���� ���� ������ ����
        gameThread.start();

        // ���� ���� ����: �÷��̾ Enter Ű�� ���� ��
        // ���⿡���� �ܼ��� Enter Ű�� ������ ������ ����˴ϴ�.
        System.out.println("������ �����Ϸ��� Enter Ű�� ��������.");
        try {
            System.in.read();
            //isGameOver = true;
            gameLoop.setGameOver(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}