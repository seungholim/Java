package com.kh.BFS;

import java.util.LinkedList;
import java.util.Queue;

/*
 BFSmain �޼���
 �׷����� BFSŽ���� �����ϰ�, �־��� ���� ���κ��� ��� ����� ��带 �ʹ� �켱���� ����
 */

public class BFSMain {
	
	public static void main(String[] args) {
		
		//Graph ����
		BFSGraph g = new BFSGraph(6);
		
		//�����߰�
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 5);
		
		System.out.print("BFS Ž�� ��� : ");
		//BFS�� ���� ��� 0���� ȣ���ؼ� ����
		g.BFS(0);
		//���: BFS�� Ž�� ����� ��� ���� ���
	}
}
