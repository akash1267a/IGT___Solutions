package com;

 

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

 

public class App {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        Employee e = new Employee();

        e.setUid(100);
        e.setName("Mahesh");
        e.setDesig("Developer");

        session.save(e);
        tx.commit();

        System.out.println("Inserted");
    }

 

}


