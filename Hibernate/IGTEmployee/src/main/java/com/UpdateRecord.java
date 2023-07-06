package com;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateRecord {

	public static void main(String[] args) {
		 Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");

	        SessionFactory factory = cfg.buildSessionFactory();
	        Session session = factory.openSession();

	        Transaction tx = session.beginTransaction();

	        IGTEmployee e = new IGTEmployee();
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Id");
	        int uid = sc.nextInt();
	        
	        System.out.println("Enter Desig ");
	        String desig = sc.next();
	        
//	        System.out.println("Enter Salary ");
//	        String sal = sc.next();
	      
	        e.setUid(uid);
	        e.setDesig(desig);
//	        e.setSalary(sal);
	       
	        session.update(e);
	        tx.commit();

	        System.out.println("Updated");

	}

}
