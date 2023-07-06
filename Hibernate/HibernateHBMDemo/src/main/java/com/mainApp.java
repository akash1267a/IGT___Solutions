package com;

 

import java.util.Scanner;

 

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

 

public class mainApp {

public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        Employee e = new Employee();

        Scanner sc = new Scanner(System.in);

        System.out.println("Id: "); int id = sc.nextInt();
        System.out.println("First Name: "); String fName = sc.next();
        System.out.println("Last Name: "); String lName = sc.next();

        e.setId(id);
        e.setFirstName(fName);
        e.setLastName(lName);

        session.save(e);
        tx.commit();

        System.out.println("Inserted");
    }

 

}