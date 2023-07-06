package com;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {

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
	        
	      
	        e.setUid(uid);
	       
	        session.delete(e);
	        tx.commit();

	        System.out.println("Deleted");

	}

}
