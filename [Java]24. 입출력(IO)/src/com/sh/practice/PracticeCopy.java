package com.kh.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeCopy {
	// �̹������� jpg �Ǵ� png ������ ����ȭ�鿡 ������ ��
	// ����ȭ�鿡�ٰ� ������ ����
	// ���� �ȿ� ������ �̹��� �����ϱ�
	public static void main(String[] args) {
		PracticeCopy pc = new PracticeCopy();
		pc.practice();
	}
	
	public void practice() {
		
		//������ ������?
		String inputFile = "C:\\Users\\user1\\Desktop\\cute.png";
		
		//���� ���ٳ��� ���� �����
		String folderPath = "C:\\Users\\user1\\Desktop\\Pokemon";
		File folder = new File(folderPath);
		folder.mkdir();
		
		//������ ������? (��ġ �� �̸����� ����)
		String outputFile = "C:\\Users\\user1\\Desktop\\Pokemon\\Realcute.jpg";
		
		try (FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(outputFile)){
			byte[] buffer = new byte[1024];
			int byteRead;
			
			while((byteRead = fis.read(buffer))!= -1) {
				fos.write(buffer,0,byteRead);
			}
			
			System.out.println("���� ���� �Ϸ�");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
