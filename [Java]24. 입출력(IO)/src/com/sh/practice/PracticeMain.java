package com.kh.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain r = new PracticeMain();
		r.practice1();
		r.practice2();
	}
	
	public void practice1() { //��μ����ؼ� ���� �����
		final String path = "C:\\Users\\user1\\Desktop";
		try {
			//������ �����ς����
			//C:\\Users\\user1\\Desktop ����ȭ�� ���
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\��������.txt");
			
			//���� �ȿ� ������ �Ẹ�پ��
			w.write("�̻��ؾ� �̻���Ǯ �̻��ز�\n���̸� ���ڵ� ���ڸ�\n���α� ��Ϻα� �źϿ�");
			w.close();
			
			//�Ʊ� ����ȭ�鿡 ��������ϱ�.. ��� + �����̸����� �ҷ��;���!
			//������: ��� ������ ��ΰ� Ȯ����
			FileReader reader = new FileReader("C:\\Users\\user1\\Desktop\\��������.txt");
			BufferedReader br = new BufferedReader(reader);
			
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			
			br.close();
			
			//������ ��� �а������.. �����ϴ�
			//System.out.println("���ϰ�� :" + w.getPath);
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

	public void practice2() {
		//������ ����� ���� �ȿ� ������ �����
		//1.���� ���� ��� ���� (����ȭ�鿡 �����̶�� ������ ���邰���)
		String folderPath = "C:\\Users\\user1\\Desktop\\����";
		//2.���� �����
		File folder = new File(folderPath);
		//3.������ ��ġ�� ������ �̹� �����ϴ°���?
		if(!folder.exists()) {
			folder.mkdir(); //make directory
			System.out.println("���� ���� ���� �Ϸ�!");
		} else {
			System.out.println("������ �̹� �����մϴ�");
		}
		
		
		try {
			//4.������ ���� �� ���ϸ����
			FileWriter pk = new FileWriter("C:\\Users\\user1\\Desktop\\����\\��������.txt");
			pk.write("���ڻ��� ����\n");
			pk.write("���ϸ� ���� �� ���� ȯ���Ѵܴ�");
			pk.write("");
			pk.close(); //�� ������ �ݾ��ּ���
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}