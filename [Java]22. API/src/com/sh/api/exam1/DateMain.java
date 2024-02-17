package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/*
 Date : ��¥�� �ð� ������ ��Ÿ���µ� ���
	java1.1 ���ķδ� ������� ����...
		java.time ��Ű�� LocalDate LocalTime LocalDateTime
 */
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println("���� ��¥ : " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("���� �ð� : " + currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("���� ��¥ �� �ð� : " + currentDateTime);
		
		//��¥ ���
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7�� �� ��¥ : " + futureDate);

		//minus plus �̿��ؼ� �� 2���� ������ �� 4��
		LocalDate nextYear = today.plusYears(1);
		LocalDate nextMonth = today.plusMonths(6);
		LocalDate lastDate = today.minusDays(1);
		LocalDate lastMonth = today.minusMonths(1);
		
		System.out.println("1�� �� ��¥ : " + nextYear);
		System.out.println("6�� �� ��¥ : " + nextMonth);
		System.out.println("���� ��¥ : " + lastDate);
		System.out.println("���� �� ��¥ : " + lastMonth);
		
		//�ð� ����
		LocalTime nowTime = LocalTime.now();
		LocalTime laterTime = nowTime.plusHours(3);
		System.out.println(laterTime);
		
		//��¥��
		LocalDate date1 = LocalDate.of(2023, 9, 13); //Ư�� ��¥�� �ð� �����ϱ� of
		LocalDate date2 = LocalDate.of(2024, 2, 14);
		
		if(date1.isBefore(date2)) { //��¾�� boolean
			System.out.println(date1 + ": " + date2 +"�� ���� ��¥�Դϴ�");
		} else if(date1.isEqual(date2)) {
			System.out.println("������ ��¥�Դϴ�");
		} else { //date1.isAfter(date2)
			System.out.println("�ڿ� ��¥�Դϴ�");
		}
	}

}
