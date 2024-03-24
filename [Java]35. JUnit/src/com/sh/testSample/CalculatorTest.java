package com.kh.testSample;

import static org.junit.Assert.*; //Assert �ؿ� �ִ� ��� ���� �������ھ��~
import static org.junit.Assert.assertEquals;

import org.junit.Test; //@Test

public class CalculatorTest {

		@Test //Junit import �ʿ�
		public void testAddition() {
			Calculator cal = new Calculator();
			int result = cal.add(5, 2);
			assertEquals(7, result);
			//���󰪰� ���� ����� �� (7�� result�� ���غ���~)
		}
		
		@Test
		public void testSubtraction() {
			Calculator cal = new Calculator();
			int result = cal.subtract(8, 3);
			assertEquals(5,result);
			// 5�� result�� ���غ���~
		}


}