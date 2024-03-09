package com.kh.randomMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 Random : ������ �����ϱ� ���� ���Ǵ� Ŭ���� ����������������������
 	���� : �������� ������� �� ��������������������������������
 */

public class RandomMain {

	public static void main(String[] args) {
		RandomMain rm = new RandomMain(); //���� ��ü ����
		rm.Lotto();
	}
	
	public void Lotto() {
		
		// ���� ��ü ����
		Random rd = new Random(); //Random import �ʿ�
		
		// ArrayList ����ؼ� ��ٱ��Ϸ� ���
		List<Integer> lottoNum = new ArrayList<>();
		
		// �ߺ��� ���ϱ� ���� set�� ����� �� ����..
		// ���� �� ���ڸ� �� ��
		int lottosize = 6; // �ζ� ��ȣ �� �� ���� ������ ����
		while(lottoNum.size() < lottosize) { // 0, 1, 2, 3, 4, 5
			
			// 1 ~ 45 ������ �����ؼ� ���� ����
			int ranNumber = rd.nextInt(45) + 1; // 0~44 +1 �ڸ��� �������� ��ȣ �ϳ�
			
			// �����ϴ��� ���� �ߺ�x
			if(!lottoNum.contains(ranNumber)) { //���Ϥ����Ӥ��ϤӤ��٤Ӥ��ϤӤ��R.,�Ϥ��̤�����Ĥ��Ǥ��Ѥ�,.���Ѥ��������̤���
				// !�� ������� ���� ������ ���� list�� ����Ǵ� ���̱� ������ ���ѷ��� �̤����̤�������������äϤ��ä��äǤ�����
				lottoNum.add(ranNumber);
			}
		}
			
		System.out.println("�ζ� ��ȣ : " + lottoNum);
	}
	
	/*
	public void RandomExam() {
		
		
		// 1. ���� ���� ������ ������ ������ ���邰���
		int ranInt = rm.nextInt(100); // 0���� 99 ���̿��� 1��
		System.out.println(ranInt);
		
		// 2. �Ǽ� ���� ������ ������ ���� �����
		double ranD = rd.nextDouble();
		System.out.println(ranD);
		
		// 3. Boolean �� �������� ����
		boolean ranB = rd.nextBoolean();
		System.out.println(ranB);
	}
	*/
	
}
	


