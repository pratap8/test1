package com.lti.demo1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;

class TestBeforeAfter {
	@BeforeAll
	public static void dbTest() {
		System.out.println("BeforeAll");
	}
	@BeforeEach
	public void testStartup() {
		System.out.println("BeforeEach");
	}
	
	@AfterAll
	public static void dbTestConn() {
		System.out.println("AfterAll");
	}
	
	@AfterEach
	public  void dbTestHello() {
		System.out.println("AfterEach");
	}

	@Test
	public void  test() {
		Calculator c1 = new Calculator();
		int result = c1.addNos(500, 250);
		Assertions.assertEquals(750, result,"Passed Test");
	}
	@Test
	public void  Subtest() {
		Calculator c1 = new Calculator();
		int result = c1.subNos(500, 250);
		Assertions.assertEquals(250, result,"Passed SubTest");
	}

}
