package com.hibernate.firsthibernate;
import javax.persistence.*;
@Entity
@Table(name="emp")
public class Employee {
	@Id
	private int id;
	private String Ename;
	private int Esal;
	private String Eaddr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public int getEsal() {
		return Esal;
	}
	public void setEsal(int esal) {
		Esal = esal;
	}
	public String getEaddr() {
		return Eaddr;
	}
	public void setEaddr(String eaddr) {
		Eaddr = eaddr;
	}
	
}
