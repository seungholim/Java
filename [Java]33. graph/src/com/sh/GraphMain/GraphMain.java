package com.kh.GraphMain;

public class GraphMain {

	public static void main(String[] args) {
		int ver = 5; // �׷��� ����� ���� 5�� ���� �� �ʱ�ȭ �غ���
		Graph graph = new Graph(ver);
		
		//addEdge ���� �߰��ϰ�����
		graph.addEdge(0, 1); //��� 0���� ��� 1�� ������ �ִ� ������ �߰�
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		
		System.out.println("DFS Ž�� ��� : ");
		graph.DFS(0); // DFS Ž���� ������ ����� ��ȣ�� ���� > ��� 0���� �����غ������?
	}

}

/**
 DFS Ž���� �����Ͽ� �� ����� ���
 Ž�� ����� ���� ��忡�� ����Ͽ� ���� �켱���� Ž�� �� ��带 �湮�� ������� ���
 **/