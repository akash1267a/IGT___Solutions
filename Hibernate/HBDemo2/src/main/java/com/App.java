package com;

 

import java.util.Scanner;

 

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

        Scanner sc = new Scanner(System.in);

        //System.out.println("Id: "); int uid = sc.nextInt();
        System.out.println("Name: "); String name = sc.next();
        System.out.println("Desigation: "); String desig = sc.next();
        System.out.println("Location: "); String location = sc.next();

        //e.setUid(uid);
        e.setName(name);
        e.setDesig(desig);
        e.setLocation(location);

        session.save(e);
        tx.commit();

        System.out.println("Inserted");
    }

 

}