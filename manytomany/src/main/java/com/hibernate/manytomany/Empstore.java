package com.hibernate.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Empstore {
public static void main(String[] args)throws Exception {
	Configuration con=new Configuration();
	con.configure("Employee.cfg.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tx=ss.beginTransaction();
	Answer ans1=new Answer();  
    ans1.setName("Java is a programming language");  
    ans1.setUsername("Ravi Malik");  
      
    Answer ans2=new Answer();  
    ans2.setName("Java is a platform");  
    ans2.setUsername("Sudhir Kumar");  
     
    Employee q1=new Employee();  
    q1.setQname("What is Java?");  
    List<Answer> l1=new ArrayList<Answer>();  
    l1.add(ans1);  
    l1.add(ans2);  
    q1.setAns(l1);  
      
    Answer ans3=new Answer();    
    ans3.setName("Servlet is an Interface");    
    ans3.setUsername("Jai Kumar");    
            
    Answer ans4=new Answer();    
    ans4.setName("Servlet is an API");    
    ans4.setUsername("Arun");    
      
    Employee q2=new Employee();  
    q2.setQname("What is Servlet?");  
    List<Answer> l2=new ArrayList<Answer>();  
    l2.add(ans3);  
    l2.add(ans4);  
    q2.setAns(l2);  
    ss.persist(q1);    
    ss.persist(q2);    
        
    tx.commit();    
    ss.close();    
    System.out.println("success");        
}
}
