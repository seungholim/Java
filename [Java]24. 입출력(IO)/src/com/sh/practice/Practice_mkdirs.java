package com.kh.practice;

import java.io.File;

public class Practice_mkdirs {

	public static void main(String[] args) {
		Practice_mkdirs pm = new Practice_mkdirs();
		pm.Practice1(); //����ȭ�鿡 ���� '�̸�1, �̸�2' ����
		pm.Practice2(); //JavaWorkspace�� 'Chap25, ��, ����' ����
		pm.Practice3(); //������ ���� 5�� ����
		
	}
	
	public void Practice1() {
		//���� �������� 2�� ����� C:\\Users\\user1\\Desktop\\�̸�1\�̸�2
		
		String dirPath = "C:\\Users\\user1\\Desktop\\�̸�1\\�̸�2";
		
		//file ��ü ����
		File dir = new File(dirPath);
		
		//mkdir �޼��� ����ؼ� ���͸� ����
		boolean success = dir.mkdirs();
		
		if(success) {
			System.out.println("���� ���� ����~");
		} else {
			System.out.println("���� ���� ���� ��");
		}
	}
	
	public void Practice2() {
		//���� �������� 3�� ����� C:\\Users\\user1\\Java_Workspace\Chap25_
	
		String dirPath = "C:\\Users\\user1\\Java_Workspace\\Chap25\\��\\����";
		
		File dir = new File(dirPath);
		
		boolean success = dir.mkdirs();
		
		if(success) {
			System.out.println("���� ���� �����޾��");
		} else {
			System.out.println("���� ���п�");
		}	
	}
	
	public void Practice3() {
		//���� �������� 5�� ����� C:\\Users\\user1\\Documents\myPlace\Music\Korean\KPOP\Group
		
		//document���� 5�� file �׷�
		String dirPath = "C:\\Users\\user1\\Documents\\myPlace\\Music\\Korean\\KPOP\\Group";
		
		File dir = new File(dirPath);
		
		boolean success = dir.mkdirs();
		
		if(success) {
			System.out.println("���� ���� �����޾��");
		} else {
			System.out.println("���� ���п�");
		}	
	}

}