package com.airtel.pipelinedemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AdditionTest {

	Addition add;

	@Before
	public void setUp() throws Exception {
		add = new Addition();
	}

	@Test
	public void testAddNumberIfCondition() {
		int expected = add.addNumber(12, 13);
		assertEquals(25, expected);
	}

	@Test
	public void testAddNumberElseCondition() {
		int expected = add.addNumber(13, 12);
		assertEquals(1, expected);
	}

	@After
	public void tearDown() throws Exception {
		add = null;
	}

}
