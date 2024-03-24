package com.kh.testSample;

import static org.junit.Assert.*; //import ������ �ϱ� ������

import org.junit.Test;

public class JunitMain {

	//���ڿ� �� �׽�Ʈ
	@Test
	public void testStringEqual() {
		String expected = "Hello, World!"; //����
		String actual = "Hellow, World!";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testStringInEqual() {
		String expected = "Hello, Java!";
		String actual = "Hello, World!";
		assertNotEquals(expected, actual);
	}
	
	@Test
	public void testArrayEqual() {
		int[] expected = {1,2,3};
		int[] actual = {1,2,3};
		assertArrayEquals(expected, actual);
		}
	
	@Test
	public void tsetArrayInEqual() {
		int[] expected = {1,2,3};
		int[] actual = {3,2,1};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testDoubleEqual() {
		double expected = 0.1 + 0.2 ;
		double actual = 0.3;
		assertEquals(expected, actual,0.001); // �ε��Ҽ��� �� (������������)
	}
	
	@Test
	public void testDoubleInEqual() {
		double expected = 0.1 + 0.2;
		double actual = 0.31;
		assertNotEquals(expected, actual,0.001); 
		// �ε��Ҽ����� �ٸ��ٴ� ���� ���� (�������� ����)	
		}

}