package com.kh.stackMain;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>(); // stack import �ʿ�
		
		// stack�� �� �߰� push()
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		/**
		 
		 ��ġ��幰��~
		 
			 \
			 |	     |
			 |	 3   | ������ ������ ������ 3���� ��������~
			 |	 2   |
			 |___1___| ������ 1���� �־��µ�! �Ϳ�~
		 
		**/
		
		// stack �� ���� pop() : ������ ������ �� ���°Ŷ� item�� ���� ���� X
		System.out.println(stack.pop()); // 3����, ��ȯ
		System.out.println(stack.pop()); // 2����, ��ȯ
		
		// stack ��ü �� ���� (�ʱ�ȭ) : �����̸�.clear();
		stack.clear();
		
		// stack ���� ��� ��(���� �������� ���� ��) ���
		stack.peek();
		
		// stack ũ�� ���
		stack.size();
		
		// stack empty : ������ ����մ��� üũ~ (boolean)
		// ����� > true, ���Ӱ����� > false
		stack.empty();
		
		// stack�� Ư�� ���� �ִ���? (boolean) ex) stack�� 1�� �ճ���?
		stack.contains(1);
	}

}
