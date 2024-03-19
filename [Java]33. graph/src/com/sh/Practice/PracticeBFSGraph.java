package com.kh.Practice;

import java.util.LinkedList;
import java.util.Queue;

public class PracticeBFSGraph {

	private int N; //�׷����� ���� ��
	private LinkedList<Integer>[] adj; // ������ ����Ʈ�� ������ �迭 adj ����
	
	//������
	public PracticeBFSGraph(int n) {
		N = n;
		adj = new LinkedList[n];
		for(int i=0 ; i<n ; i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	//�׷��� ���� �߰��ϴ� �޼��� addEdge
	public void addEdge(int n, int m) { // n, m : �糡����
		adj[n].add(m);
	}
	
	//BFS Ž�� ����
	public void BFS(int start) {
		//�湮 ���θ� ǥ���ϱ� ���� �迭 ����
		boolean[] visited = new boolean[N];
		
		//BFS
		Queue<Integer> queue = new LinkedList<>(); //Queue import �ʿ�
		
		//���۳��(start)���� Ž�� �����ϰ� queue�� �߰�
		visited[start] = true; //������ �湮�޽��ϴ�
		queue.add(start);
		
		//ť�� ����� ������ �ݺ������� ���� �ܰ迡 ������ ��� �湮
		while(!queue.isEmpty()) {
			start = queue.poll(); //poll() : ť���� ��Ҹ� �����ϰ� ��ȯ
			System.out.print(start + " ");
			
			for(Integer nextdoor : adj[start]) {
				if(!visited[nextdoor]) { //����尡 ������
					visited[nextdoor] = true; //�湮�Ѱ���..
					queue.add(nextdoor); //�湮��Ͽ� �־��ֱ�?
				}
			}
		}
	}
}
