package com.kh.whilesample;

import java.util.Scanner;

public class While05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("5������ ������ �Է����ּ��� : ");
		int num = sc.nextInt(); // num: ���� �� �������� X
		
		while(sum <= 10) {
			
			sum += num;
			num = num + 1;
			System.out.println("sum :" + sum);
		}
	}
}