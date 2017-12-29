package com.raghava.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AirthemeticCalculatorTest {
	private AirthemeticCalculator calculator;

	@Before
	public void setup() {
		calculator = new AirthemeticCalculator();

	}

	@After
	public void tearDown() {
		calculator = null;
	}

	@Test
	public void testAdd() {
		int expected = 5;
		int actual = calculator.add(2, 3);
		assertNotNull(actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testDivide() {
		int expected = 1;
		int actual = calculator.divide(3, 2);
		assertNotNull(actual);
		assertEquals(expected, actual);
	}

	@Test(expected = ArithmeticException.class)
	public void divideShoudFailWithExceptions() {
		calculator.divide(3, 0);
	}

}
