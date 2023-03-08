package com.hibernate.hibernatesecond;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class EmpDel {
	@Id
private int id;
	private String Ename;
	private int Esal;
	private String Eaddr;
public int getId() {
	return id;
}

public void setId(int id) {
	this.id=id;
}
public String getEaddr() {
	return Eaddr;
}

public void setEaddr(String eaddr) {
	this.Eaddr = eaddr;
}

public String getEname() {
	return Ename;
}

public void setEname(String ename) {
	this.Ename = ename;
}
public int getEsal() {
	return Esal;
}

public void setEsal(int esal) {
	this.Esal = esal;

}

}