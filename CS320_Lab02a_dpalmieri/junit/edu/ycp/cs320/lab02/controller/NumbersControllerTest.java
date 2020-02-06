package edu.ycp.cs320.lab02.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_dpalmieri.controller.GuessingGameController;
import edu.ycp.cs320.lab02a_dpalmieri.controller.NumbersController;
import edu.ycp.cs320.lab02a_dpalmieri.model.GuessingGame;
import edu.ycp.cs320.lab02a_dpalmieri.model.Numbers;

public class NumbersControllerTest {
	private Numbers model;
	private NumbersController controller;
	
	private static final double DELTA =  0.0000001;


	@Before
	public void setUp() {
		model = new Numbers();
		controller = new NumbersController();
		
		controller.setModel(model);
	}
	
	@Test public void testAdd() {
		model.setFirst(4.0);
		model.setSecond(6.0);
		model.setThird(1.0);
		controller.add(model.getFirst(), model.getSecond(), model.getThird());
		assertEquals(11.0, model.getAddResult(), DELTA);
	}

	@Test public void testMultiply() {
		model.setFirst(4.0);
		model.setSecond(6.0);
		controller.multiply(model.getFirst(), model.getSecond());
		assertEquals(24.0, model.getMultiplyResult(),DELTA);
	}
}

