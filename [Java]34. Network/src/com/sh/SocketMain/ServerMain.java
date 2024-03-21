package com.kh.SocketMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) throws IOException {
		
		// Socket ���� ����
		ServerSocket serverSocket = new ServerSocket(12345); //throw
		System.out.println("������ ���۵Ǿ����ϴ�.");
		
		// Ŭ���̾�Ʈ ���� ���
		Socket clientSocket = serverSocket.accept(); //Socket import
		System.out.println("Ŭ���̾�Ʈ�� ����Ǿ����ϴ�.");
		
		// Ŭ���̾�Ʈ�κ��� �����͸� �ޱ� ���� �Է� ��Ʈ�� ����
		// BufferedReader, InputStreamReader import
		BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		
		// Ŭ���̾�Ʈ�κ��� �����͸� ������ ���� ��� ��Ʈ�� ����
		// PrintWriter import
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
		
		String clientMsg;
		while((clientMsg = in.readLine()) != null) {
			System.out.println("Ŭ���̾�Ʈ�� ��ȭ : " + clientMsg);
			
			// Ŭ���̾�Ʈ���� ���� ����
			out.print("������ ���� ���� : " + clientMsg);
		}
		
		// Ŭ���̾�Ʈ�� ���� ����
		serverSocket.close();
		clientSocket.close();
	}

}