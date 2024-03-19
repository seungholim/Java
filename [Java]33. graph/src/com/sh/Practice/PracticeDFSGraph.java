package com.kh.Practice;

import java.util.LinkedList;

public class PracticeDFSGraph {
	
	private int n; //�׷����� ��� ��
	private LinkedList<Integer>[] adjList;
	//adjList : ��������Ʈ�� �����ϴ� �迭��... �����ؔf���
	
	//�׷��� ������~
	public PracticeDFSGraph(int num) {
		n = num;
		adjList = new LinkedList[n];
		for(int i=0 ; i<num ; i++) {
			adjList[i] = new LinkedList<>();
		}
	}
	
	// a���� b�� ���� ������ �߰��ϴ� �޼���
	public void addEdge(int a, int b) {
		adjList[a].add(b);
	}
	
	// ���� �켱 �׷��� Ž��
	public void DFS(int startNode) {
		boolean[] visited = new boolean[n];
		DFSUtil(startNode, visited);
	}
	
	// ���� ���� �켱 Ž�� ����
	private void DFSUtil(int currentNode, boolean[] visited) {
		visited[currentNode] = true; 
		System.out.print(currentNode + " "); //����ȣ ���
		
		for(int nextdoor : adjList[currentNode]) {
			if(!visited[nextdoor]) { //���� ���� ��带 �湮���� �ʾѴٸ�
				DFSUtil(nextdoor, visited);
			}
		}
	}
}
