package com;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args) {
		ApplicationContext contex = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e = (Employee)contex.getBean("emp");
		e.display();

	}

}
