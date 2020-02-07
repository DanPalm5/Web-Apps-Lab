package edu.ycp.cs320.lab02a_dpalmieri.controller;

import edu.ycp.cs320.lab02a_dpalmieri.model.Numbers;


public class NumbersController {
	private Numbers model;
	
	public void setModel(Numbers model) {
		this.model = model;
	}
	
	
	public String add(String first, String second, String third) {
			model.setFirst(first);
			model.setSecond(second);
			model.setThird(third);
			Double firstToAdd = Double.parseDouble(model.getFirst());
			Double secondToAdd = Double.parseDouble(second);
			Double thirdToAdd = Double.parseDouble(third);
			Double result= firstToAdd + secondToAdd + thirdToAdd;
			model.setAddResult(result.toString());
			return model.getAddResult();
		}
	
	public String multiply(String first, String second) {
		model.setFirst(first);
		model.setSecond(second);
		Double firstToMult = Double.parseDouble(model.getFirst());
		Double secondToMult = Double.parseDouble(model.getSecond());
		Double result = firstToMult*secondToMult;
		model.setMultiplyResult(result.toString());
		return model.getMultiplyResult();
	}

}
