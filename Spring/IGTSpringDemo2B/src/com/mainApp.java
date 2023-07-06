package com;

 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class mainApp {

 

    public static void main(String[] args) {

      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      Employee e = (Employee)context.getBean("emp");
      e.display();

    }

 

}