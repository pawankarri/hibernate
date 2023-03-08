package com.hibernate.hibernateinheritance;

import javax.persistence.*;

@Entity  
@DiscriminatorValue("regularemployee")  
public class RegularEmployee extends Employe {
	   
private int salary;
	
private int bonus;
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getBonus() {
	return bonus;
}
public void setBonus(int bonus) {
	this.bonus = bonus;
}

}
