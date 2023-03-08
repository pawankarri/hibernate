package com.hibernate.hibernatesecond;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test2 {
public static void main(String[] args) throws Exception {
	Configuration con=new Configuration();
	con.configure("EmpDel.cfg.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tx=ss.beginTransaction();
		EmpDel ed=new EmpDel();
		ed.setId(112);
		/*
		 * ed.setEname("pawan"); ed.setEsal(2000); ed.setEaddr("gudivada");
		 */
		ss.delete(ed);
		tx.commit();
		System.out.println("removed");
		sf.close();
	
	
}
}