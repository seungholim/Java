package com.kh.classAM;

/**
import com.kh.classAM.AM;

**/
public class OtherAM {

	public static void main(String[] args) {
		
		//AM ����
		AM am = new AM();
		
		am.publicMethod(); //� Ŭ���������� ���� ����
		am.protectedMethod(); //���� ��Ű�� ������ ���� ����
		am.defaultMethod(); //���� ��Ű�� ������'��' ���� ����
		//am.privateMethod(); //���� 'Ŭ����' �������� ���� ���� > ��� �Ұ� (�ٸ� Ŭ������ �����ϱ� ����)
	}
	
	

}
