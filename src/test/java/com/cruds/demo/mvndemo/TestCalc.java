package com.cruds.demo.mvndemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalc {

	@Test
	public void test() {
		
		Calculator c = new Calculator();
		
		assertEquals(5, c.subtract(10, 5));
		
		
	}

}
