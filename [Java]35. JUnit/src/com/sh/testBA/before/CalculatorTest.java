package com.kh.testBA.before;

import static org.junit.Assert.assertEquals;

//import org.junit.Before;
//import org.junit.After;
import org.junit.Test;



public class CalculatorTest {
	
	private Calculator cal = new Calculator();
	
	/*
	@Before
	public void setUp() {
		// �� �׽�Ʈ �޼��� ���� ���� ������ �۾� ����
		cal = new Calculator();
		System.out.println("�׽�Ʈ ����!");
	}
	
	@After
	public void tearDown() {
		// �� �׽�Ʈ �޼��� ���� �� ������ �۾��� ����
		System.out.println("�׽�Ʈ ����");
	}
	*/
	
	
	@Test
	public void testAddition() {
		int result = cal.add(3, 4);
		assertEquals(8, result);
	}
	
	@Test
	public void testSub() {
		int result = cal.subtract(10, 5);
		assertEquals(4, result);
	}
}