package edu.ycp.cs320.lab02a_dpalmieri.model;

//model class for both addNumbers and multiplyNumbers
//only the controller should be allowed to call the set methods
//the JSP will call the "get" and "is" methods implicitly
public class Numbers {
	private Double first, second, third, addResult, multiplyResult;
	
	public Numbers() {
		
	}
	
	public Double getFirst() {
		return first;
	}
	
	public Double getSecond() {
		return second;
	}
	
	public Double getThird() {
		return third;
	}
	
	public Double getAddResult() {
		return addResult;
	}
	
	public Double getMultiplyResult() {
		return multiplyResult;
	}
	
	public void setFirst(Double first) {
		this.first = first;
	}
	
	public void setSecond(Double second) {
		this.second = second;
	}
	
	public void setThird(Double third) {
		this.third = third;
	}
	
	public void setAddResult(Double addResult) {
		this.addResult = addResult;
	}
	
	public void setMultiplyResult(Double multiplyResult) {
		this.multiplyResult = multiplyResult;
	}
	
}
