package com;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 

public class mainApp {

 

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");    
        Person p = (Person)context.getBean("person");
        p.display();

        System.out.println("===============Array==============");
        String[] hb = p.getHobbies();
        for(String hoby : hb) {
            System.out.println("    "+hoby);
        }

        System.out.println("===============Array List==============");
        ArrayList<String> email = p.getEmails();
                for(String e : email) {
            System.out.println("    "+e);
        }

        System.out.println("===============SET==============");
        HashSet<String> ph = p.getPhones(); 
        for(String phone : ph) {
                    System.out.println("    "+phone);
                }        

        System.out.println("===============MAP==============");
        HashMap<String, String> ed = p.getEducation();
        System.out.println("Education details are ");
        Iterator it = ed.entrySet().iterator();
        while(it.hasNext()) {
             System.out.println("    "+it.next());
         }
    }

 

}