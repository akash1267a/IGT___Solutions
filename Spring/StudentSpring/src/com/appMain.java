package com;

 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class appMain {

 

    public static void main(String[] args) {

      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      Student e = (Student)context.getBean("emp");
      e.display();

    }

 

}