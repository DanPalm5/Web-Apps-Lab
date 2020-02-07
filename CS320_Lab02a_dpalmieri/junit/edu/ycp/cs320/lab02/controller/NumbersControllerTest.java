package edu.ycp.cs320.lab02.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_dpalmieri.controller.NumbersController;
import edu.ycp.cs320.lab02a_dpalmieri.model.Numbers;

public class NumbersControllerTest {
	private Numbers model;
	private NumbersController controller;
	
	@Before
	public void setUp() {
		model = new Numbers();
		controller = new NumbersController();
		
		controller.setModel(model);
	}
	
	@Test public void testAdd() {
		model.setFirst("4");
		model.setSecond("6");
		model.setThird("1");
		controller.add(model.getFirst(), model.getSecond(), model.getThird());
		assertEquals("11.0", model.getAddResult());
	}

	@Test public void testMultiply() {
		model.setFirst("4");
		model.setSecond("6");
		controller.multiply(model.getFirst(), model.getSecond());
		assertEquals("24.0", model.getMultiplyResult());
	}
}

