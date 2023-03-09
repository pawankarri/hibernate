package com.hibernate.collectionlist;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QuestionStore {
public static void main(String[] args)  throws Exception {
	Configuration con=new Configuration();
	con.configure("Question.cfg.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tx=ss.beginTransaction();
	List l=new ArrayList<String>();
	l.add("java is a object oriented language");
	l.add("highly secured");
	List l2=new ArrayList<String>();
	l2.add("servlet is an interface");
	l2.add("servlet is an api");
	Question q=new Question();
	q.setQname("what is java");
	q.setAnswers(l);
	Question q2=new Question();
	q2.setQname("what is servlet");
	q2.setAnswers(l2);
	ss.save(q);
	ss.save(q2);
	tx.commit();
	sf.close();
	System.out.println("success");
	
}
}
