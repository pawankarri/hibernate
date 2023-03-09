package com.hibernate.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProgramStore {
public static void main(String[] args) throws Exception {
	Configuration con=new Configuration();
	con.configure("Program.cfg.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tx=ss.beginTransaction();
	Answer a1=new Answer();
	a1.setAnswer("java is object oreinted language");
	a1.setUsername("pawan");
	Answer a2=new Answer();
	a2.setAnswer("java is secured language");
	a2.setUsername("gopal");
	Answer a3=new Answer();
	a3.setAnswer("servlet is an interface");
	a3.setUsername("imran");
	Answer a4=new Answer();
	a4.setAnswer("servlet is an api");
	a4.setUsername("nikhil");
	List<String> l1=new ArrayList<String>();
	l1.add(a1+"");
	l1.add(a2+"");
	List<String> l2=new ArrayList<String>();
	l2.add(a3+"");
	l2.add(a4+"");
	Program p1=new Program();
	p1.setQname("what is java");
	p1.setAnswer(l1);
	Program p2=new Program();
	p2.setQname("what is servlet");
	p2.setAnswer(l2);
	tx.commit();
	sf.close();
	System.out.println("success"); 
}
}
