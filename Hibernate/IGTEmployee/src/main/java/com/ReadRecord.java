package com;

import java.util.List;
import java.util.Scanner;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ReadRecord {

	public static void main(String[] args) {
		 Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");

	        SessionFactory factory = cfg.buildSessionFactory();
	        Session session = factory.openSession();

	        Transaction tx = session.beginTransaction();
	        
//
//	        Employee e=session.load(Employee.class, 100);
//	        System.out.println("=============");
//	        System.out.println("UID :"+e.getUid());
//	        System.out.println("U Name :"+e.getName());
//	        
	        
	        
	        
	        List emp=session.createQuery("from IGTEmployee").list();
	        Iterator i=emp.iterator();
	        while(i.hasNext()) {
	        	
	        	IGTEmployee e = (IGTEmployee)i.next();
	        	System.out.println(e.getUid());
	        	System.out.println(e.getName());
	        	System.out.println(e.getDesig());
	        	System.out.println("=================");
	        }

	}

}
