package com.hibernate.collectionmap;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QuesStore {
public static void main(String[] args) throws Exception {
	Configuration con=new Configuration();
	con.configure("Ques.cfg.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tx=ss.beginTransaction();
	Map m=new HashMap<String,String>();
	m.put("java is a object based language", "gopal");
	m.put("java is a secured language","pawan");
	Map m1=new HashMap<String,String>();
	m1.put("servlet is an interface", "gopal");
	m1.put("servlet is an api","pawan");
	Ques q=new Ques();
	q.setName("what is java");
	q.setUsername("nikhil");
	q.setAnswer(m);
	Ques q1=new Ques();
	q1.setName("what is servlet");
	q1.setUsername("mahesh");
	q1.setAnswer(m1);
	ss.save(q);
	ss.save(q1);
	tx.commit();
	sf.close();
	System.out.println("success");
	
}
}
