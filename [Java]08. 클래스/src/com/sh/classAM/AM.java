package com.kh.classAM;

public class AM {
		
		public int pNum = 10;
		protected int pNum2 = 20;
		int pNum3 = 30; //���� �����ڸ� ������� ������ �ڵ����� default ������ �����
		private int pNum4 = 40;
		
		//ȣ�� �޼��� �ۼ��ؼ� ���� ȣ���ϱ�
		
		public void publicMethod() { //� Ŭ���������� ���� ����
			System.out.println("public Method() ȣ���");
		}
		
		protected void protectedMethod() { //���� ��Ű�� ������ ���� ����
			System.out.println("protected Method() ȣ���");
		}
		
		void defaultMethod() { //���� ��Ű�� ������'��' ���� ����
			System.out.println("default Method() ȣ���");
		}
		
		private void privateMethod() { //���� 'Ŭ����' �������� ���� ����
			System.out.println("private Method() ȣ���");
		}

}
