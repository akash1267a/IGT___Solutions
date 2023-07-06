package com;
import java.*;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class App1 {

    static void insert() {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        IGTEmployee e = new IGTEmployee();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id");
        int uid = sc.nextInt();

        System.out.println("Name");
        String name = sc.next();

        System.out.println("Enter Designation");
        String desig = sc.next();

        e.setUid(uid);
        e.setName(name);
        e.setDesig(desig);

        session.save(e);
        tx.commit();

        System.out.println("Record Inserted");
        session.close();
        factory.close();
    }
}


class ReadRecord1 {

	static void read()  {
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

class UpdateRecord1 {

	static void update() {
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

class Delete1 {

	static void delete() {
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



public class Project {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        do {
            System.out.println("Enter choice");
            System.out.println("1) ADD RECORD");
            System.out.println("2) Display Record");
            System.out.println("3) UPDATE");
            System.out.println("4) DELETE");
            ch = sc.nextInt();

            if (ch == 1) {
                App1.insert();
            } else if (ch == 2) {
               ReadRecord1.read();
            } else if (ch == 3) {
                UpdateRecord1.update();
            } else if (ch == 4) {
                Delete1.delete();
            }

        } while (ch < 5);

        sc.close();
    }
}
