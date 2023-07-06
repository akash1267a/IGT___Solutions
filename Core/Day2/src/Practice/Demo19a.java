package Practice;

class Draw
{
    void Draw()
    {    
    	this(1000)
        System.out.println(" Draw()");
    }
    void Draw(int a )
    {    
    	this(20,12)
        System.out.println(" Draw() area of  square "+ (a * a ));
    }
 

    void Draw(int l, int b)
    {
        System.out.println(" Draw() area of Rectanlge "+ (l*b));
    }
}
class  Demo16
{
    public static void main(String args[])
    {
         Draw d1= new Draw();
         a.draw();
         a.draw(10);
         a.draw(10,20);

    }    
}

// over loading?
//same constructor name  +  multiple time +with diffrent par  in praamere + in same class is called constuctor over loading  
//same constructor name  +  multiple time +with diffrent paramere+ in same class + is called method overloading 

