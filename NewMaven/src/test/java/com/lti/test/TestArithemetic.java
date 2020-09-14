package com.lti.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.lang.annotation.Target;

import org.junit.Before;
import org.junit.Test;

import com.lti.code.Arithemetic;

public class TestArithemetic {
	private Arithemetic arth;
	
	
	@Before
	public void init() {
		arth =new Arithemetic();
	}
	
	@Test
	public void testSum() {
		assertEquals(10, arth.sum(4,0));
	}
	
	
}
