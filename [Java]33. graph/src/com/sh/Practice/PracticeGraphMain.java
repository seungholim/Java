package com.kh.Practice;

public class PracticeGraphMain {

	public static void main(String[] args) {
		
		// �׷��� ��� ���� num 10���� ����������
		int num = 10;
		PracticeDFSGraph dg = new PracticeDFSGraph(num);
		PracticeBFSGraph bg = new PracticeBFSGraph(num);
		
		
		dg.addEdge(1, 2);
		dg.addEdge(1, 3);
		dg.addEdge(2, 4);
		dg.addEdge(4, 5);
		dg.addEdge(4, 6);
		dg.addEdge(3, 4);
		dg.addEdge(5, 7);
		
		bg.addEdge(1, 2);
		bg.addEdge(1, 3);
		bg.addEdge(2, 4);
		bg.addEdge(4, 5);
		bg.addEdge(4, 6);
		bg.addEdge(3, 4);
		bg.addEdge(5, 7);
		
		System.out.println("DFS Ž�� ��� : ");
		dg.DFS(3); // ����� ����
		
		System.out.println(" ");
		System.out.println("BFS Ž�� ��� : ");
		bg.BFS(3); // ����� ����
		
		//���������� �� �ö󰡼� ��µ��� ����..
		
	}

}