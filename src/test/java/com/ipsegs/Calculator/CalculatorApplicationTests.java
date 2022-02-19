package com.ipsegs.Calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {

	@Test
	void contextLoads() {
	}

}
class CalculatorTest {
	calculator = new Calculator();
	@Test
	void testSum() {
		assertEquals(5, calculator.sum(2, 3));
	}
}
