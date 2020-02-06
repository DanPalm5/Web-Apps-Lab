package edu.ycp.cs320.lab02a_dpalmieri.controller;

import edu.ycp.cs320.lab02a_dpalmieri.model.Numbers;


public class NumbersController {
	private Numbers model;
	
	public void setModel(Numbers model) {
		this.model = model;
	}
	
	
	public Double add(Double first, Double second, Double third) {
		model.setFirst(first);
		model.setSecond(second);
		model.setThird(third);
		model.setAddResult(model.getFirst()+model.getSecond()+model.getThird());
		return model.getAddResult();
	}
	
	public Double multiply(Double first, Double second) {
		model.setFirst(first);
		model.setSecond(second);	
		model.setMultiplyResult(model.getFirst()*model.getSecond());
		return model.getMultiplyResult();
	}

}
