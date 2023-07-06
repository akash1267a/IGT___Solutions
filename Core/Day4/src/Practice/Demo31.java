package Practice;
interface Univercity
{
    //Univercity(){}
    //int a;
    //void xyz(){}
    public static final int a=1000;
    //public abstract void xyz();
    void exam();
    void result();
    // java 1.8
    static void display()
    {

    }
    default void aaaa()
    {

    }
}
class IITB implements  Univercity
{
    public void exam()
    {   
        // online
    }
    public   void result()
    {
        // mail
    }
}
class IITD implements  Univercity
{
    public  void exam()
    {   
        //ofline
    }
    public  void result()
    {
        //web
    }   
}
class IITM implements  Univercity
{
    public  void exam()
    {   
        //ofline
    }
    public  void result()
    {
        // newPapaer
    }
}
class Demo31
{
    public static void main(String args[])
    {
        IITM m= new IITM ();
        m.exam();
        m.result();   
    }
}