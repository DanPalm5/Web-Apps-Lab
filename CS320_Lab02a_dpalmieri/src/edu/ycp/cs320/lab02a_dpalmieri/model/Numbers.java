package edu.ycp.cs320.lab02a_dpalmieri.model;

//model class for both addNumbers and multiplyNumbers
//only the controller should be allowed to call the set methods
//the JSP will call the "get" and "is" methods implicitly
public class Numbers {
	private String first, second, third, addResult, multiplyResult;
	
	public Numbers() {
		
	}
	
	public String getFirst() {
		return first;
	}
	
	public String getSecond() {
		return second;
	}
	
	public String getThird() {
		return third;
	}
	
	public String getAddResult() {
		return addResult;
	}
	
	public String getMultiplyResult() {
		return multiplyResult;
	}
	
	public void setFirst(String first) {
		this.first = first;
	}
	
	public void setSecond(String second) {
		this.second = second;
	}
	
	public void setThird(String third) {
		this.third = third;
	}
	
	public void setAddResult(String addResult) {
		this.addResult = addResult;
	}
	
	public void setMultiplyResult(String multiplyResult) {
		this.multiplyResult = multiplyResult;
	}
	
}
