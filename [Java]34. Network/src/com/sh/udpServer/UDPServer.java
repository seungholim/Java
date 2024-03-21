package com.kh.udpServer;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 ��Ʈ��ũ ����� ���� �߿��� Ŭ����..
 UDP(User Datagram Protocol) ����ؼ� �����͸� �ۼ��� �ϴµ� ���
 
 DatagramSocket
 	UDP ����� ���� ���� Ŭ����
 	TCP ���ϰ� �ٸ��� ������ �����ϰų� ���� ������ �������� �ʰ�, ������ ��Ŷ�� �׳� ������ �޴� ����
 	
 DatagramPacket
 	UDP ������ ��Ŷ�� ��Ÿ���� Ŭ����
 	�������� ���� ����� �����͸� ���� ���, �Ǵ� �����͸� ������ ����� �ּ� ���� ����
	��Ŷ(Packet): ��ǻ�� ��Ʈ��ũ�� �����ϴ� �������� ����ȭ�� ���
				 > �����͸� �ְ���� �� ���س��� ��Ģ
				 Pack + Bucket �ռ���..
 */

// UDP ������ ��Ÿ��
public class UDPServer {
	
	// start(): UDP ������ �����ϴ� �޼���޼���޼���! > ���ܸ� ���� �� �����Ƿ�(throw) ����ó���� �ʿ�
	public void start() throws Exception {
		
		// 8888�� ��Ʈ�� ����ϴ� ���� ������ ���� UDP ����� �̷����
		DatagramSocket socket = new DatagramSocket(8888);
		// inPacket  : Ŭ���̾�Ʈ�κ��� �����͸� ������ �� ���
		// outPacket : Ŭ���̾�Ʈ���� �����͸� ���� �� ���
		DatagramPacket inPacket, outPacket;
		
		byte[] inMsg = new byte[10];
		byte[] outMsg;
		
		// while ������ ����ؼ� ������ ����ؼ� ����
		// �� ������ ������ ����ؼ� Ŭ���̾�Ʈ�κ��� �����͸� �����ϰ� �����ϴ� ������ ��
		while(true) {
			
			// �����͸� �����ϱ� ���� ��Ŷ�� ����
			inPacket = new DatagramPacket(inMsg, inMsg.length);
			// Ŭ���̾�Ʈ�κ��� ��Ŷ�� ���� �����͸� ����
			socket.receive(inPacket);
			
			// ������ ��Ŷ���� Ŭ���̾�Ʈ�� IP & Port
			// inPacket�� ���� Ŭ���̾�Ʈ�� IP �ּҿ� Port��ȣ ���
			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();
			
			// ������ ���� �ð��� �ú��� ���·� ��ȯ
			// ���� ���� �ð��� hh:mm:ss ������ ���ڿ��� ��ȯ
			SimpleDateFormat simpleDate = new SimpleDateFormat("[hh:mm:ss]");
			String time = simpleDate.format(new Date());
			outMsg = time.getBytes(); // byte �迭�� ��ȯ
			
			// ��Ŷ�� �����ؼ� Ŭ���̾�Ʈ���� ����
			outPacket = new DatagramPacket(outMsg, outMsg.length,address,port);
			
		}
		
	}	
	
	// main �޼��� : UDPServer Ŭ������ �ν��Ͻ��� �����ϰ�, start() �޼��带 ȣ���Ͽ� UDP ���� ����
	// ���� �߻��ϸ� ���� ó��
	public static void main(String[] args) {
		try {
			new UDPServer().start(); // UDP ���� ����
			// new UDPServer.start(); > error
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}