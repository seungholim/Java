package com.kh.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {

	public static void main(String[] args) {
		// stack�� ���� ���� ���� �ʱ�ȭ �� �޼��� ��� ������ �غ�����~~~^^
		PracticeMain pm = new PracticeMain();
		
		pm.PracticeStack();
		pm.PracticeQueue();
	}
	
	public void PracticeStack() {
		Stack<String> pokedex = new Stack<>();

		// �����͸� �־��~
		pokedex.push("������");
		pokedex.push("��������");
		pokedex.push("���̹�");
			
		// ������ �����͸� �̾ƺ���~
		System.out.println("���������� �߰��ѳ� : " + pokedex.peek());
			
		// �� ���﷡
		pokedex.clear();
			
		// ���� �������?
		System.out.println("������ �ϰ͵� ������? : " + pokedex.empty()); //boolean������ ���´�
			
		// �ٽ� �����͸� �־��~
		pokedex.push("�̴�");
		pokedex.push("�Ŵ�");
		pokedex.push("������");
			
		// �̴��̰� �ճ���?
		System.out.println("�̴��̰� �ճ���? : " + pokedex.contains("�̴�"));
			
		// �ο��̰� �ճ���?
		System.out.println("�ο��̰� �ճ���? : " + pokedex.contains("�ο�"));
			
		// ����� ���� �ǳ���?
		System.out.println("���� ��� : " + pokedex.size() + "����");
	}
	
	public void PracticeQueue() {
		// Queue��.. stack�� �ٸ��� �������̽���.. new Queue�� ���� �Ұ�
		Queue<String> pokedex = new LinkedList<>();
		
		pokedex.offer("������");
		pokedex.offer("��������");
		pokedex.offer("��ũ�δ���");
		pokedex.offer("ĥ����");
		pokedex.offer("����");
		
		int number = pokedex.size();
		System.out.println("���� �ϼ��� : " + number + "����");
		
		String removedPokemon = pokedex.poll(); //������ �����ϰ� ��ȯ
		System.out.println(removedPokemon);
		
		removedPokemon = pokedex.poll(); //�������� �����ϰ� ��ȯ
		System.out.println(removedPokemon);
		
		System.out.print("���� ���(��) : ");
		while(!pokedex.isEmpty()) {
			String pokemon = pokedex.poll();
			System.out.print(pokemon + " ");
		}
	}
	
	public void PracticeDeque() {
		
	}
	

}