package com.kh.person.vo;

import java.util.Scanner;

public class PersonView {//����� ������ ȭ�鿡 ���
	
	//Ŭ���̾�Ʈ�� ���� �Է°�
	public String getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("��� �̸��� �Է��ϼ���: ");
		return sc.next();
	}

}
