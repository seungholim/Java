package com.kh.whilesample;

public class While04 {
	public static void main(String[] args) {
		
		// 1���� 100���� �� ���ϱ�
		
		int sum = 0; //������
		int num = 1;
		
		while(num<=5) { //true ����
			sum += num; //sum = sum + num;
			num = num + 1;
		}
		System.out.print("1���� 100������ ���� " + sum + "�Դϴ�");
		/*
		 while�� ����Ǿ��ٰ��ؼ� Ŭ������ ����� ���� �ƴ�
		 while���� ����� �� �����ִ� �ڵ� System.out.print(sum)�� ��µ�
		 */
		
	}

}