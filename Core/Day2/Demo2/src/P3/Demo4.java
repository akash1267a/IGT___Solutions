package P3;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

 

class Emp
{

 

}

 

public class Demo4 {

  public static void main(String args[])
  {
     //Array
      ArrayList a1 = new ArrayList();
      a1.add(100);
      a1.add(200);
      a1.add(300);
      a1.add(400);
      a1.add(10.5);
      a1.add("Ram");
      a1.add('A');
      a1.add(true);
     // a1.add(new Thread());
     // a1.add(new Date());
     // a1.add(new Emp());

      System.out.println(a1);
      
      for(int i = 0 ; i<a1.size();i++) {
    	  
    	  System.out.println(a1.get(i));
      }
      
      System.out.println("============");
      Iterator  i = a1.iterator();
      while(i.hasNext())
      {
    	  System.out.println(i.next());
    	  }
      }
}


