package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		Main main = new Main();
		int result = main.add(1, 1);
		assertEquals(2, result);
		int res2 = main.add(-Integer.MAX_VALUE, 5);
		assertEquals(-2147483642, res2);

	}

}
