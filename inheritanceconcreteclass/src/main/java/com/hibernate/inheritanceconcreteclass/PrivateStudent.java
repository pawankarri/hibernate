package com.hibernate.inheritanceconcreteclass;

public class PrivateStudent extends Student{
	private int pfee;
	private String psubject;
	public int getPfee() {
		return pfee;
	}
	public void setPfee(int pfee) {
		this.pfee = pfee;
	}
	public String getPsubject() {
		return psubject;
	}
	public void setPsubject(String psubject) {
		this.psubject = psubject;
	}
	

}
