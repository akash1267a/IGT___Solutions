package Practice;
interface I
{
   public static final int a=10;
   public abstract void add();
   void sub();
}

 

interface J
{
   int b=20;
   void mul();
   void div();  
}

 

interface K extends I,J
{

}

 

class Cal implements K
{
  public void sub()
{
   System.out.println(I.a - J.b);
}
  public void add()
{
   System.out.println(I.a + J.b);
}
  public void div()
{
   System.out.println(I.a / J.b);
}
  public void mul()
{
   System.out.println(I.a * J.b);
}
}

 

class Demo27
{
public static void main(String args[])
{
    System.out.println("=========Cal========");
    Cal c = new Cal();
    c.add();
    c.sub();
    c.div();
    c.mul();

 

    System.out.println("=========I interface========");
    I i =c;
    i.add();
    i.sub();
    //i.div();
    //i.mul();

 

    System.out.println("=========J interface========");
    J j = c;
    //j.add();
    //j.sub();
    j.div();
    j.mul();

 

    System.out.println("=========K interface========");
    K k = c;
    k.add();
    k.sub();
    k.div();
    k.mul();

 

} 
}

