package mypro;


import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		double result = cal.add(10, 50);
		assertEquals(60, result, 0);
	}

}
