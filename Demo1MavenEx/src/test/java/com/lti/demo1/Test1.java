package com.lti.demo1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;

class Test1 {

	Calculator c = new Calculator();
	
	@Test
	public void testHello() {
		Assertions.assertEquals("hello World", c.sayHello(), "Passed");
	}
	
	@Test
	public void testAddition() {
		Assertions.assertEquals(600, c.addNos(200, 400), "Passed");
	}
	
	@Test
	public void testSubstraction() {
		Assertions.assertEquals(5, c.subNos(95, 90));
	}
	
	@Test
	public void testMultiplication() {
		Assertions.assertEquals(77, c.mulNos(7,11), "Passed");
	}
	@Test
	void testAssertFalse() {
	Assertions.assertFalse("FirstName".length() == 90);
	Assertions.assertFalse(10 > 20, "assertion message");
	}
}
