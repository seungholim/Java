package com.kh.gettersetter.goodExam;

import com.kh.gettersetter.GoodPlayer;

public class GoodRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GoodPlayer player1 = new GoodPlayer();
		
		player1.setName("����");
		player1.ValidName();
		
		player1.setHp(-10); //-10 ü�� �������ְ�
		player1.ValidHp();
		//-10�� ���Ἲ(���� ���� �ڵ尡 ������ ������)
		
		player1.displayInfo();
		
		//---------------------------------------
		
		//player2�� valid�� �����غ���!
		
		
		GoodPlayer player2 = new GoodPlayer();
		
		player2.setName(""); //���ݹ��� ĳ����
		player2.ValidName();
		
		player2.setHp(58);
		player2.ValidHp(); //ü�°� �����ϱ�
		
		player2.displayInfo();
		
		System.out.println("���� ��");
		
		player1.attack(player2);
		
		//player.attack(player1);
		
	}

}
