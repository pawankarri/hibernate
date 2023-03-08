package com.hibernate.inheritanceconcreteclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentStore {
public static void main(String[] args) throws Exception {
	Configuration con=new Configuration();
	con.configure("Student.cfg.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tx=ss.beginTransaction();
	Student s=new Student();
	s.setName("pawan");
	RegularStudent rs=new RegularStudent();
	rs.setName("pawan");
	rs.setFee(5000);
	rs.setMarks(100);
	PrivateStudent ps=new PrivateStudent();
	ps.setName("pawan");
	ps.setPfee(4500);
	ps.setPsubject("science");
	ss.save(s);
	ss.save(rs);
	ss.save(ps);
	tx.commit();
	sf.close();
	System.out.println("success");

}
}
