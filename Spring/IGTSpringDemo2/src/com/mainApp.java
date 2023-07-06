package com;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
class mainApp {

	public static void main(String[] args) {
		ApplicationContext contex = new ClassPathXmlApplicationContext("applicationContext.xml");
		products p  = (products)contex.getBean("prd");
		p.display();

	}

}
