package com.kh.file_IO;

import java.io.File;

public class MakeFoldersMain {
/*
 mkdirs
 	����ȭ�� > kh > image ������ �ϰ������.. kh�� ����~!
 	> �θ� ���丮�� �������� �ʴ� ��쿡 �߰� ��� ���丮 ����
 */
	public static void main(String[] args) {
																  //�����̸��� 'HG'�� ���� ����
		String dirPath = "C:\\Users\\user1\\Desktop\\Pokemon\\HGSS\\HG";

		//file ��ü ����
		File dir = new File(dirPath);
		
		//mkdirs �޼��带 ����Ͽ� ���丮 ���� �õ�
		boolean success = dir.mkdirs();
		
		if(success) {
			System.out.println("���� ���� ����!");
		} else {
			System.out.println("���� ���� ���� ��");
		}
		
		// �� �����ϸ� dirPath���� ������ ���丮 ������ �� ����� (Pokemon, HGSS, HG���� �� 3�� ����)
	}

}
