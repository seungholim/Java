package com.kh.interfaceSample;

public class InterFaceMain {

	public static void main(String[] args) {
		MyInterface myin = new MyClass();
		//MyInterface ������ = new MyInterface(); > ��ü�� �ƴϱ� ������ ���� �Ұ�
		myin.doMyInterface();
	}

}
