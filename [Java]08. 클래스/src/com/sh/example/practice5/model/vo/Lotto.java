package com.kh.example.practice5.model.vo;

import java.util.Random;

public class Lotto {

	//�ݺ����� �̿��Ͽ� �迭 ���
		//1. �������
		int[] lotto = new int[6]; //lotto �迭 ����
		Random random = new Random(); //���ο� Random Ŭ����
		
		//2. ������
		public Lotto() { //������ �ʱ�ȭ..
			for(int i=0;i<lotto.length;i++) {
				lotto[i] = random.nextInt(45)+1; //�������� ������ �迭�� �Է�(1~45 ������ ����)
			}
		}
		/*
		public Lotto(int[] lotto) { //������ �ʱ�ȭ..
			for(int i=0;i<lotto.length;i++) {
				lotto[i] = random.nextInt(45)+1; //�������� ������ �迭�� �Է�(1~45 ������ ����)
			}
		}
		*/
		
		//2. �ζ� ��ȣ ��� �޼ҵ�
		public void information() {
			for(int i=0;i<6;i++) {
				System.out.println(lotto[i]);
			}
		}

}
