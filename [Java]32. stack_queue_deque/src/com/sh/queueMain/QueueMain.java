package com.kh.queueMain;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		
		// ť(Queue) ����
		// Queue��.. stack�� �ٸ��� �������̽���.. new Queue�� ���� �Ұ�
		Queue<String> queue = new LinkedList<>(); // Queue import �ʿ�
		
		/**
		 
		  Front						   Rear(tail)
		    ��							   ��
		 +-----+		+-----+			+-----+
		 |     |		|     |			|     |
		 |  1  |		|  2  |			|  3  |
		 |     |		|     |			|     |
		 +-----+		+-----+			+-----+
		 
		 
		 
		 
		 */
		
		
		// ť�� ��� �߰�
		queue.offer("Apple");
		queue.offer("Banana");
		queue.offer("Cherry");
		
		// ť���� ��� ���� �� ��� (FIFO ������� ��µ�)
		String removedElement =queue.poll(); // ť����.. ù��°�� ����.. Apple�� �����ϰ� ��ȯ
		System.out.println(removedElement);
		
		removedElement = queue.poll(); // Banana �����ϰ� ��ȯ
		
		// ť�� Front ��� Ȯ�� (�������� �ʰ� Ȯ�θ�~~~~~)
		String fontElement = queue.peek(); // queue�� front ��� Cherry ��ȯ
		System.out.println("?");
		
		// ť�� ũ�� Ȯ��
		int size = queue.size(); // ��� �ٳ��� �����ؼ� 1�� ����
		System.out.println("size : " + size);
		
		while(!queue.isEmpty()) {
			String element = queue.poll(); // poll() : �������
			System.out.println(element);
		}

	}

}

/**


**/