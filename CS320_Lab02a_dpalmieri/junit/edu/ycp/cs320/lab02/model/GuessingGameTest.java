package edu.ycp.cs320.lab02.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_dpalmieri.model.GuessingGame;

public class GuessingGameTest {
	private GuessingGame model;
	
	@Before
	public void setUp() {
		model = new GuessingGame();
	}
	
	@Test
	public void testSetMin() {
		model.setMin(1);
		assertEquals(1, model.getMin());
	}
	@Test
	public void testSetMax() {
		model.setMax(100);
		assertEquals(100, model.getMax());
	}
	
	@Test
	public void testIsDone() {
		model.setMax(20);
		model.setMin(20);
		assertTrue(model.isDone());
	}
	
	@Test
	public void testSetIsLessThan() {
		model.setMax(95);
		int guess = 75;
		model.setIsLessThan(guess);
		assertEquals(74, model.getMax());
	
	}
	
	@Test
	public void testSetIsGreaterThan() {
		model.setMin(65);
		int guess = 75;
		model.setIsGreaterThan(guess);
		assertEquals(76, model.getMin());
		
	}
}
