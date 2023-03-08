package com.hibernate.firsthibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
public static void main(String[] args)throws Exception {
	Configuration con=new Configuration();
	con.configure("Employee.cfg.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tx=ss.beginTransaction();
	Employee e=new Employee();
	e.setId(112);
	e.setEname("gopal");
	e.setEsal(2000);
	e.setEaddr("khammam");
	ss.persist(e);
	tx.commit();
	ss.close();
	System.out.println("added");
}
}
