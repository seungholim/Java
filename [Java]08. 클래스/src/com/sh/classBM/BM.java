package com.kh.classBM;

import com.kh.classAM.AM;

public class BM extends AM { // AM �����ڸ� classBM���� ����� �;�!
	public void am() {
		
		AM am = new AM();
		
		 publicMethod();
		 protectedMethod(); //��Ű�� �ȿ� ���𰡸� �ؾ����� ��� ����
		 	//main �޼��忡�� ���� ȣ���� �ϰų�.. ������ ���� ȣ��
		 	//���� �����ڸ� �������־ ���� ��Ű�� ������ ȣ���� ���������� extends ����ؼ� ȣ���� �Ѵ�
		 
		 //am.defaultMethod(); //���� ��Ű�� �ȿ��� ����� ������ (�ٸ� ��Ű���̹Ƿ� ��� �Ұ�)
		 //am.privateMethod();
	}
}
