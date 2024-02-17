package com.kh.api.exam1;

import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpledateFormatMain {

/*
 SimpleDateFormat
 	��¥�� �ð��� ���ϴ� �������� �������ϰų�
 	���ڿ��κ��� ��¥�� �ð��� �Ľ��ϴµ� ���Ǵ� Ŭ����
 	
 	yyyy-MM-dd a HH:mm:ss:S (E)
 	y : ����
 	M : ��
 	d : ��
 	a : ����/����
 	H : 24�ð� ������ �ð�
 	m : ��
 	s : ��
 	S(�빮��) : �Ҽ������� �� (������ŭ �ڼ��� ���)
 	(E) : ����
 	
 */
	public static void main(String[] args) {
		Date currentDate = new Date(); //sql import X
		SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		//�����õ� ���ڿ��� ��ȯ
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
	}

}
