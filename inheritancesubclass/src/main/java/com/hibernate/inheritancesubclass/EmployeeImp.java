package com.hibernate.inheritancesubclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeImp {
public static void main(String[] args) throws Exception{
	Configuration con=new Configuration();
	con.configure("Employee.cfg.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tx=ss.beginTransaction();
	Employee e=new Employee();
	e.setName("pawan");
	RegularEmployee re=new RegularEmployee();
	re.setName("mahesh");
	re.setSalary(5000);
	re.setBonus(1000);
	ConctractEmployee ce=new ConctractEmployee();
	ce.setName("nikhil");
	ce.setPayperhour(5000);
	ce.setWork("10hours");
	ss.save(e);
	ss.save(re);
	ss.save(ce);
	tx.commit();
	sf.close();
	System.out.println("success");
}
}
