package com.kh.whilesample;

public class While03 {
	public static void main(String[] args) {
		
		//�ݺ������� ���
		
		int i =1;
		
		while (i<=10) { //i�� 5���� ���ų� ���� �� true
			System.out.println(i); //while ������ ���� ���� ���
			i ++ ; // i = i +1;
			
			//i = i++; ������ ���ѷ����� ������ ���� > 1=1++, 1=1++, 1=1++ .....���ѹݺ� > ++�� �۵����� X
			//i = ++i; �� ���� (i�� +1�� ���� �����߱� ����)
		}
	}

}
