package com.kh.i_Address;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {
	
	public static void main(String[] args) {
		
		InetAddressMain ia = new InetAddressMain();
		//ia.InetExample();
		ia.InetSample();
	}
	
	public void InetExample() {
		
		try {
			// ȣ��Ʈ �̸� �̿��ؼ� ��ü ���� (���� ���� ��������)
			InetAddress address = InetAddress.getByName("github.com"); //.getByName > trycatch
			
			// ip�ּ� ���
			System.out.println("Host Name : " + address.getHostName());
			System.out.println("IP Address : " + address.getHostAddress()); //.getAddress�� ����..
		
			// ���� ȣ��Ʈ�� InetAddress ��ü ��� (��������ϴ���ǻ���� InetAddress ��ü ���)
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host Name : " + localHost.getHostName());
			System.out.println("Local IP Address : " + localHost.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
	
	public void InetSample() {
		
		try {
			// ȣ��Ʈ �̸��� �����ͼ� ��ü ����
			InetAddress address = InetAddress.getByName("www.naver.com");
			
			// IP�ּҸ� byte �迭�� ���
			// InetAddress ��ü���� IP �ּҸ� ����Ʈ �迭�� ����
			// IP �ּҸ� ����Ʈ �迭�� ������ �� ����Ʈ�� ���� IP �ּҸ� �ٷ� �� ����
			byte[] ipAddress = address.getAddress();
			System.out.println("IP Address�� byte�� ����");
			for(byte ip : ipAddress) {
				System.out.print(ip + ".");
			}
			
			System.out.println(); //�ٹٲ�
			
			// ������ �� ������ ��� ȣ��Ʈ�� IP �ּҸ� �迭�� ���
			InetAddress[] alladdress = InetAddress.getAllByName("www.google.co.kr");
			System.out.println("���ۿ� ������ ��� ȣ��Ʈ�� ������ �ּҸ� �迭�� ����");
			for(InetAddress arrs : alladdress) {
				System.out.println(arrs.getHostAddress());
			
			// ȣ��Ʈ �̸� ��� (ȣ��Ʈ : ��Ʈ��ũ�� ����Ǿ��մ�...��ǻ��)
			String hostName = address.getHostName();
			System.out.println("Host Name : " + hostName);
			
			// ���� ȣ��Ʈ�� IP �ּ� ���
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host address : " + localHost.getHostAddress());
			
			// ��Ƽ ĳ��Ʈ �ּ� ���� Ȯ��
			boolean isMultiCast = address.isMulticastAddress();
			System.out.println("��Ƽ ĳ��Ʈ �ּ��Դϱ�? " + isMultiCast);
			
			// ȣ��Ʈ �̸��� �̿��ؼ� InetAddress ��ü ����
			InetAddress name = InetAddress.getByName("www.daum.net");
			System.out.println("IP �ּ� �̸� : " + name.getHostAddress());
			
			// ȣ��Ʈ�� ������ �̸� �������� (��ü ������ �̸�)
			// ȣ��Ʈ�� ����ȭ��(FQDN) �������� �̸��� ����
			// FQDN : Full Qualified Domain Name
			String hostFullName = address.getCanonicalHostName();
			System.out.println("Ǯ���� : " + hostFullName);
			
			// LoopBack �ּ� ���� Ȯ��
			boolean isLoopBack = address.isLoopbackAddress();
			System.out.println("�������ΰ���.. : " + isLoopBack);
			
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
				
	}

}