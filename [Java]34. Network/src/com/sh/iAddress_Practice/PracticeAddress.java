package com.kh.iAddress_Practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PracticeAddress {

	public static void main(String[] args) {
		
		PracticeAddress pa = new PracticeAddress();
		pa.InetPractice();
	}
	
	public void InetPractice() {
		
		try {
			InetAddress address = InetAddress.getByName("www.google.co.kr");
			byte[] ipAddress = address.getAddress();
			System.out.print("IP Address�� byte�� ��� : ");
			for(byte ip : ipAddress) {
				System.out.print(ip + ".");
				
			// ȣ��Ʈ �̸� ���
			String hostName = address.getHostName();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
