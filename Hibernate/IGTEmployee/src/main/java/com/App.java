package com;

 

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

 import java.util.*;

public class App {

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
        
        System.out.println("Name");
        String name = sc.next();
        
        System.out.println("Enter Desig ");
        String desig = sc.next();

        e.setUid(uid);
        e.setName(name);
        e.setDesig(desig);

        session.save(e);
        tx.commit();

        System.out.println("Inserted");
    }

 

}


