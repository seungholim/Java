package com.kh.dequeMain;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {

	public static void main(String[] args) {

		/**
		 
			  ����				  		��
			 
			   �� 				 		��
			 
			[First] <-> [Second] <-> [Third] 
		
		 ��									  ��
		
	   [   ]	 						    [   ]


		**/

		// ArrayDeque ����Ͽ� Deque ����
		Deque<String> deque = new ArrayDeque<>();
		
		// ��� �߰�
		deque.addFirst("ó��");
		deque.addLast("��");
		
		// �� �հ� �� �� ��� Ȯ��
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		
		// �� �հ� �� �� ��� ����
		deque.removeFirst();
		deque.removeLast();
		
		// ��Ұ� ����ճ� Ȯ��
		System.out.println(deque.isEmpty());
	}

}