package com.hibernate.inheritanceconcreteclass;

public class RegularStudent extends Student {
	private int fee;
	private int marks;
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	

}
