package com.kh.gettersetter;

public class PlayerRun {

	public static void main(String[] args) {
		
		// player1 �ν��Ͻ� ����
		PlayerCharacter player1 = new PlayerCharacter();
		
		player1.setName("��ī���ƽ�");
		player1.setHp(0); //ü���� �����ϴ�
		player1.setAttackPower(300);
		
		player1.displayInfo();
		
		
		
		// player2 �ν��Ͻ� ����
		PlayerCharacter player2 = new PlayerCharacter();
		
		player2.setName("������"); //���ݹ��� ĳ����
		player2.setHp(225);
		player2.setAttackPower(280);
		
		player2.displayInfo();
		
		System.out.println("���� ��");
		
		player1.attack(player2); //player2 ���� target���� ��
		//player.attack(player1);
	}

}