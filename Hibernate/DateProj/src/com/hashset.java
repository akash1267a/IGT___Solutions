package com;

 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

 

public class hashset {

 

    public static void main(String[] args) {

//        LIST :                                     will allow the dup , + order yes
        //ArrayList al = new ArrayList<>();
        //HashSet al = new HashSet<>();            // dup 
        LinkedHashSet al = new LinkedHashSet<>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);

     Iterator    i=al.iterator();
     while(i.hasNext()) {
         System.out.println(i.next());
     }
     System.out.println("=====================================");

     HashMap map= new HashMap<>();
     map.put(111,"ABCD");
     map.put(22,"XYZ");
     map.put(321,"LMP");
     map.put(241,"XBCD");
     map.put(22,"AAA");
     map.put(411,"TBCD");

     Set s=map.entrySet();
     Iterator    s1=s.iterator();
     while(s1.hasNext()) {
         System.out.println(s1.next());
     }
}
}