package com.cruds.demo.mvndemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdd {

	@Test
	public void test() {
		App obj = new App();
		
		assertEquals(10, obj.add(5, 5)); // Some changes added
		
	}

}
