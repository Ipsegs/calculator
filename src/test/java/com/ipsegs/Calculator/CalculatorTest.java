package com.ipsegs.Calculator;

import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
@SpringBootTest
public class 
CalculatorTest {
	@Test	
	public void testSum() {
			 int a = 15; 
			 int b = 20; 
			 int expectedResult = 35;
			 int result = (a+b);
		         Assertions.assertEquals(expectedResult, result);
	}

        @Test
	public void testSubtract() {
		         int a = 15;
			 int b = 20;
			 int expectedResult = -5;
			 int result = (a-b);
			 Assertions.assertEquals(expectedResult, result);
	}

        @Test
	public void testMultiply() {
		         int a = 15;
			 int b = 20;
			 int expectedResult = 300;
			 int result = (a*b);
			 Assertions.assertEquals(expectedResult, result);
	}

        @Test
	public void testDivide() {
                         int a = 15;
			 int b = 20;
			 double expectedResult = 0.0;
			 double result = (a/b);
			 Assertions.assertEquals(expectedResult, result);
	}
}
