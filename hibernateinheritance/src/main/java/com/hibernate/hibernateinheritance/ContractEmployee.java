package com.hibernate.hibernateinheritance;

import javax.persistence.*;

@Entity  
@DiscriminatorValue("contractemployee")  
public class ContractEmployee extends Employe {
	
private int payperhour;
	
private String contracttime;
public int getPayperhour() {
	return payperhour;
}
public void setPayperhour(int payperhour) {
	this.payperhour = payperhour;
}
public String getContracttime() {
	return contracttime;
}
public void setContracttime(String contracttime) {
	this.contracttime = contracttime;
}

}
