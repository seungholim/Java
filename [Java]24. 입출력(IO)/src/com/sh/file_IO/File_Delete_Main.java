package com.kh.file_IO;

import java.io.File;

public class File_Delete_Main {
//���� ����
	public static void main(String[] args) {
		String mainPath = "C:\\Users\\user1\\Desktop\\";
		String originFile = mainPath + "cute.png";
		
		//���ϰ�ü ����
		File fileToDelete = new File(originFile);
		
		//���� ����
		boolean deleted = fileToDelete.delete();
		if(deleted) {
			System.out.println("���ϻ�������");
		} else {
			System.out.println("���ϻ�������");
		}
	}

}