package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("NewFile.xml");
		
		A a1 = (A) context.getBean("obj1",A.class);
		System.out.println(a1.name);
		
		A a2=(A) context.getBean("obj1",A.class);
		System.out.println(a1.name);
		
	}

}
