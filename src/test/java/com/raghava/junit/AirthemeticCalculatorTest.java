package com.raghava.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AirthemeticCalculatorTest {

	@Test
	public void testAdd() {
		int expected=5;
		AirthemeticCalculator calculator=new AirthemeticCalculator();
		int actual = calculator.add(2, 3);
		assertNotNull(actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testDivide() {
		int expected=1;
		AirthemeticCalculator calculator=new AirthemeticCalculator();
		int actual = calculator.divide(3, 2);
		assertNotNull(actual);
		assertEquals(expected, actual);
	}

}
