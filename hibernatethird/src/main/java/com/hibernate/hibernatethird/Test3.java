package com.hibernate.hibernatethird;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test3 {
public static void main(String[] args) {
	Configuration con=null;
	SessionFactory sf=null;
	Session ss=null;
	try
	{
		con=new Configuration();
		con.configure("EmployeeGet.cfg.xml");
		sf=con.buildSessionFactory();
		ss=sf.openSession();
		EmployeeGet get=(EmployeeGet)ss.get(EmployeeGet.class,111);
		if(get==null)
		{
			System.out.println("record not found");
		}
		else
		{
			System.out.println("eid: "+ get.getId());
			System.out.println("ename: "+ get.getEname());
			System.out.println("esal: "+   get.getEsal());
			System.out.println("eaddr: "+  get.getEaddr());
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	sf.close();
}
}
