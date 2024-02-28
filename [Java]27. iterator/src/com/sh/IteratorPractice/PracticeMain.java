package com.kh.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {
		
		// ArrayList ���� �� ��� �߰�
		ArrayList<String> snack = new ArrayList<>();
		snack.add("ĭ��");
		snack.add("���ڷ���ũ");
		snack.add("����ũ��ġ������");
		
		// Iterator ���� (java.util���� import�ʿ�)
		Iterator<String> iter = snack.iterator();
		
		// Iterator�� ����Ͽ� ��� �ݺ� (while���� ������� ������ ���ѷ����� �ɸ� �� ����)
		while(iter.hasNext()) { 
			//hasNext : ������ ������ ���� ���� ������ true�� �޼���. booleanŸ���� ��ȯ�Ѵ�
			String snk = iter.next();
			System.out.println(snk);
		}
		
		// Iterator�� ����Ͽ� ��� ����
		iter = snack.iterator(); //�ٽ� Iterator �ʱ�ȭ
		while(iter.hasNext()) {
			String snk = iter.next(); //��� while���� snk�� ���������̹Ƿ� ���⼭�� ��� ����
			// ���࿡ ����ũ��ġ�������� ������ �����ϱ� ����
			if(snk.equals("����ũ��ġ������")) {
				iter.remove(); //������ ����
			}
			
			System.out.println(snk);
		}
		
		// ���� �� ArrayList ���
		System.out.print("���� �� ��� : ");
		for(String a : snack) {
			System.out.print(a + ", ");
		}

	}

}