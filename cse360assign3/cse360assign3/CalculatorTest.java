package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator calculator1 = new Calculator();
		assertNotNull(calculator1);
	}
	
	@Test
	public void testGetTotal() {
		Calculator calc1 = new Calculator();
		assertEquals(0, calc1.getTotal());
		
		calc1.add(5);
		assertEquals(5, calc1.getTotal());
	}
	
	@Test
	public void testAdd() {
		Calculator calc1 = new Calculator();
		calc1.add(11);
		calc1.add(-5);
		calc1.add(3);
		assertEquals(8, calc1.getTotal());
	}
	
	@Test
	public void testSubtract() {
		Calculator calc1 = new Calculator();
		calc1.subtract(11);
		calc1.subtract(-5);
		calc1.subtract(3);
		assertEquals(-8, calc1.getTotal());
	}
	
	@Test
	public void testMultiply() {
		Calculator calc1 = new Calculator();
		calc1.add(1);
		calc1.multiply(-5);
		calc1.multiply(3);
		calc1.multiply(-9);
		assertEquals(135, calc1.getTotal());
	}
	
	@Test
	public void testDivide() {
		Calculator calc1 = new Calculator();
		calc1.add(10);
		calc1.divide(2);
		calc1.divide(2);
		assertEquals(2, calc1.getTotal());
		calc1.divide(0);
		assertEquals(0, calc1.getTotal());
	}
	
	@Test
	public void testGetHistory() {
		Calculator calc1 = new Calculator();
		calc1.add(10);
		calc1.divide(2);
		calc1.divide(2);
		assertEquals(2, calc1.getTotal());
		assertEquals("", calc1.getHistory());
	}
}
