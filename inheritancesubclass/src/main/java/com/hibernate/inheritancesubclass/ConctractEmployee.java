package com.hibernate.inheritancesubclass;

public class ConctractEmployee extends Employee {
private int payperhour;
private String work;
public int getPayperhour() {
	return payperhour;
}
public void setPayperhour(int payperhour) {
	this.payperhour = payperhour;
}
public String getWork() {
	return work;
}
public void setWork(String work) {
	this.work = work;
}

}
