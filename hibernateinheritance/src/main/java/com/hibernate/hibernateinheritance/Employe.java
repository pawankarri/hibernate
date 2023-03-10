package com.hibernate.hibernateinheritance;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="employee")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)  
@DiscriminatorValue(value="employee")
public class Employe {
	@Id  
	  
private int id;
	 
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
