package com.kh.file_IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MakeFolderMain { //mkdir
/*
 ���� = ����,
 �̹��� jpg png, �ؽ�Ʈ txt, ���� avi mp4 mkr ���...
 */
	
	public static void main(String[] args) {
		// ������ ������ ��� ����
		String folderPath = "C:\\Users\\user1\\Desktop\\new_folder"; // "���\\�����ϰ����ϴ� ���� �̸�"
		// ���� �����	
		File folder = new File(folderPath);
		//exists : �̹� �����ϴ��� Ȯ��
		if(!folder.exists()) {
			folder.mkdir(); //������ ��ο� ���� ���� (make directory)
			System.out.println("������ ���������� �����Ǿ����ϴ�");
		} else {
			System.out.println("������ �̹� �����մϴ�");
		}
		
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\new_folder");
			w.write("User ������ ��� ���Դϴ�.");
			w.write("Kh �л�");
			w.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
