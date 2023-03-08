package com.hibernate.hibernateinheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeStore {
public static void main(String[] args)throws Exception {
	Configuration con=new Configuration();
	con.configure("Employe.cfg.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tx=ss.beginTransaction();
	Employe e=new Employe();
	e.setName("pawan");
	RegularEmployee re=new RegularEmployee();
	re.setName("gopal");
	re.setSalary(5000);
	re.setBonus(1000);
	ContractEmployee ce=new ContractEmployee();
	ce.setName("nikhil");
	ce.setPayperhour(500);
	ce.setContracttime("5hours");
	ss.save(e);
	ss.save(re);
	ss.save(ce);
	tx.commit();
	System.out.println("success");
	sf.close();
}
}
