package com.kh.IteratorMain;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMain {
/*
 Iterator
 	�÷���(������ �׷�)�� �ݺ�(iterate)�ϸ鼭 ��ҿ� �����ϴµ� ���Ǵ� �������̽�
 	> while�̳� for�� ���� ������ ���� ����
 	�پ��� �÷��� ����(ArrayList, HashSet ��)�� ����� �� ����
 	�÷����� ��Ҹ� �а� �����ϴµ� ����
 	Iterator�� ����ϸ� �÷����� ũ�⳪ ���� ������ ���� ���� ��ҿ� ������ �� ����
 */
	public static void main(String[] args) {
		
		// ArrayList ���� �� ��� �߰�
		ArrayList<String> music = new ArrayList<>();
		music.add("Kpop");
		music.add("OST");
		music.add("Jazz");
		
		// Iterator ����
		Iterator<String> iter = music.iterator();
		
		// Iterator�� ����Ͽ� ��� �ݺ�
		while(iter.hasNext()) {
			String msc = iter.next();
			System.out.println(msc);
		}
		
		// Iterator�� ����Ͽ� ��� ����
		iter = music.iterator(); //�ٽ� Iterator �ʱ�ȭ
		while(iter.hasNext()) {
			String msc = iter.next(); //��� while���� msc�� ���������̹Ƿ� ���⼭�� ��� ����
			// ���࿡ Kpop�� ������ �����ϱ� ����
			if(msc.equals("Kpop")) {
				iter.remove(); //������ ����
			}
				
			System.out.println(msc);
		}
			
		// ���� �� ArrayList ���
		System.out.print("���� �� ��� : ");
		for(String a : music) {
			System.out.print(a + ", ");
		}
		

	}

}