package com.kh.api.objExam;

public class PracticeMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PracticeMain2 sb = new PracticeMain2();
		
		sb.practice1();
		sb.practice2();
		sb.practice3();
		sb.practice4();
		sb.practice5();
	}
	
	public void practice1() {
		//StringBuffer Ȱ�� ����
		//���ڿ� �� ���̱� ��� append
		
		StringBuffer sb = new StringBuffer();
		sb.append("���� "); //���� ������
		sb.append("���� ������");
		System.out.println(sb.toString());
	}
	
	public void practice2() {
		//���ڿ� ������ reverse ���� ���� ������
		StringBuffer sb = new StringBuffer();
		sb.append ("���� ���� ������");
		sb.reverse();
		System.out.println(sb.toString());
	}
	
	public void practice3() {
		//���ڿ� ���� insert '?����'
		String str = "���� ���� ������";
		StringBuffer sb = new StringBuffer(str);
		sb.insert(9, "? ����");
		System.out.println(sb.toString());
	}
	
	public void practice4() {
		//���ڿ� ��ü replace(,,);
		/*���1
		String str = "���� ���� ������";
		String reStr = str.replace("������", ",,,");
		System.out.println(reStr);
		*/
		//���2 StringBuffer���
	}
	
	public void practice5() {
		//���ڿ� ���� delete(,,);
		String str = "���� ���� ������,,";
		StringBuffer sb = new StringBuffer(str);
		sb.delete(9, 12);
		System.out.println(sb.toString());
	}

}