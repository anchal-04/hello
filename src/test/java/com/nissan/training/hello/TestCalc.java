package com.nissan.training.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalc {

	@Test
	public void testAdd() {
		Calc c=new Calc();
		assertEquals(10,c.add(5, 5));
	}

	@Test
	public void testMult() {
		Calc c=new Calc();
		assertEquals(25,c.mult(5, 5));
	}
	@Test
	public void testDiv() {
		Calc c=new Calc();
		assertEquals(1,c.div(5, 5));
	}
	@Test
	public void testSub() {
		Calc c=new Calc();
		assertEquals(0,c.sub(5, 5));
	}
}
