package com.kh.BFS;

import java.util.LinkedList;
import java.util.Queue;
/*
 Graph Ŭ����
 	�ڷ� ������ ��Ÿ��
 */
public class BFSGraph {
	
	private int V; // �׷����� '����' ��
	private LinkedList<Integer>[] adj; // ���� ����Ʈ �迭 ����
	
	// �׷��� �ʱ�ȭ
	// Graph Ŭ������ �����ڿ��� �׷����� ���� �� (V)�� �޾Ƽ� �ʱ�ȭ
	//adj ���� ����Ʈ�� ��Ÿ����, �� �������� ������ �������� ����� ������
	public BFSGraph(int v) {
		V = v;
		adj = new LinkedList[v];
		for(int i=0 ; i<v ; i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	// �׷��� ���� �߰�
	// addEdge �׷����� ������ �߰�
	// v�� w�� �糡 ������ ��Ÿ��
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	//BFSŽ���� ����
	public void BFS(int start) {
		// �湮 ���θ� ǥ���ϱ� ���� �迭
		// visit �迭�� �� ������ �湮 ���θ� ����
		boolean[] visited = new boolean[V];
		//BFS
		Queue<Integer> queue = new LinkedList<>();
		// Ž���� ���۳��(start)���� �����ϰ�
		// ���۳�带 �湮�ϰ� ť�� �߰�
		visited[start] = true;
		queue.add(start);
		//ť�� ����� ������ �ݺ������� ���� �ܰ迡 ������ ��带 �湮
		while(!queue.isEmpty()) {
			start = queue.poll();
			System.out.print(start + " ");
			
			for(Integer neighbor : adj[start]) {
				if(!visited[neighbor]) {
					visited[neighbor] = true;
					queue.add(neighbor);
				}
			}
		}
	}
}