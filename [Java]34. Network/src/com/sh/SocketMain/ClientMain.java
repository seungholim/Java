package com.kh.SocketMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 1. ServerMain ���� ��
 2. CMD ���ؼ� SocketMain �������� ���� ��
 3. java ClientMain.java > Enter > �ܼ�â�� "Ŭ���̾�Ʈ�� ����Ǿ����ϴ�" ��µ�
*/

public class ClientMain {
	public static void main(String[] args) throws UnknownHostException, IOException {
		// ������ �����ϱ� ���� ���� ����
		Socket socket = new Socket("localhost",12345); //throw
		
		// ������ �����͸� ������ ���� ��� ��Ʈ�� ����
		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
		
		// �����κ��� �����͸� �ޱ� ���� ��� ��Ʈ�� ����
		BufferedReader in = new BufferedReader((new InputStreamReader(System.in)));
		
		// Ű����κ��� �Է� �ޱ� ���� ����
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		String userInputString;
		while((userInputString = userInput.readLine())!= null) {
			// ����� �Է��� ������ �����ϰڽ��ϴ�
			out.println(userInputString);
			
			// �����κ��� ���� ���� ���
			String serverResponse = in.readLine();
			System.out.println("������ ���� : " + serverResponse);
		}
		
		// ���� �� �Է� ��Ʈ�� �ݱ�
		socket.close();
		userInput.close();
	}
}