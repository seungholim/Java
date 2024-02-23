package com.kh.file_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_IO_Main {
	//FileWriter fWriter = new FileWriter(filePath, true);
	//true: ���� ���� �̾��, false: ���� �����
	public static void main(String[] args) {
		
		try { //FileWriter���� trycatch �ڵ�����
			//������ �����ϰ�
			FileWriter writer = new FileWriter("abcde.txt");
			
			//���� �ȿ� ���� ����
			writer.write("���� ����������� �׽�Ʈ"); //������ ��� ���������

			//���� �ȿ� ���� �� ���� �ݱ�
			writer.close();
			
			//���� ���� �о��ֱ�
			FileReader reader = new FileReader("abcde.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			String line;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line); //���۸��� ���� �ҷ��� ������ ������ null�� �ƴϸ� ���� �� �о����
			}
			
			bufferedReader.close(); //�� �о����� �ݾ�! �޸� �����Ǵϱ�
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

	/**
	//���2
	File f = new File("new.txt"); //File import �ʿ�
	//���ο� newFile�� �����..
	//File f = new File("��μ���","��������ϴ� ������ �̸�");
	
	try {
		if(f.createNewFile()) {
			System.out.println("������ ��� ��������ϴ�..");
		} else {
			System.out.println("������ �̹� �����մϴ�..");
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	**/