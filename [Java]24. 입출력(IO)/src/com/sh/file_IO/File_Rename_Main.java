package com.kh.file_IO;

import java.io.File;

public class File_Rename_Main {

	public static void main(String[] args) {
		String originFile = "C:\\Users\\user1\\Desktop\\cute.png";
		String newFile = "C:\\Users\\user1\\Desktop\\cuuuuuuuute.png";
		
		File currentFile = new File(originFile);
		File renameFile = new File(newFile);
		//���� �̸� �����ϱ�
		//���࿡ ������ �ִٸ�..!
		if(currentFile.renameTo(renameFile)) {
			System.out.println("���� �̸� ���� ���� ~.~");
		} else {
			System.out.println("���� �̸� ���� ���� ��_�� �ͱ�?");
		}

	}

}