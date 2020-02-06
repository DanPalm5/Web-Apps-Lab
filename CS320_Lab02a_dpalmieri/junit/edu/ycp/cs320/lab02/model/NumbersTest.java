package edu.ycp.cs320.lab02.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_dpalmieri.model.Numbers;

public class NumbersTest {
	private Numbers model;
	private static final double DELTA =  0.0000001;
	
	@Before
	public void setUp() {
		model = new Numbers();
	}
	
	@Test
	public void testSetFirst() {
		model.setFirst(4.0);
		assertEquals(4.0, model.getFirst(), DELTA);
	}
	
	@Test
	public void testSetSecond() {
		model.setSecond(8.7);
		assertEquals(8.7, model.getSecond(),DELTA);
	}
	
	@Test
	public void testSetThird() {
		model.setThird(9.8);
		assertEquals(9.8, model.getThird(), DELTA);
	}
	
	@Test
	public void testSetAddResult() {
		model.setAddResult(12.0);
		assertEquals(12.0, model.getAddResult(), DELTA);
	}
	
	@Test
	public void testSetMultiplyResult() {
		model.setMultiplyResult(67.0);
		assertEquals(67.0, model.getMultiplyResult(),DELTA);
		
	}
	
	
}
