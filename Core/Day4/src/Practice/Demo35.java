package Practice;
import java.io.*;
import java.util.*;
import java.sql.*;
class A
{
    void abc() throws InvalidAgeException,FileNotFoundException,NullPointerException,SQLException
    {
        for(int i=1;i<=25;i++)
        {
            if(i==15) throw new FileNotFoundException();
            if(i==10) throw  new InputMismatchException();
            if(i==20) throw  new NullPointerException();
            if(i==9) throw new SQLException();
            if(i==18)  throw new InvalidAgeException("Please Check age Once  again ...!");
            System.out.println("I  :"+i);
        }
    }
}
class Demo35
{
    public static void main(String args[])
    {
        try
        {
            A a= new A();
            a.abc();
        }
        catch(InvalidAgeException iae)
        {
            System.out.println(iae);
        }
        catch(NullPointerException np)
        {
            System.out.println("Null pointer came");
        }
        catch(FileNotFoundException fn)
        {
            System.out.println("File not fouund  came");   
        }
        catch(InputMismatchException ime)
        {
            System.out.println("INPU mISS MATHC ");   
        }
        catch(SQLException sql)
        {
            System.out.println("SQL CAME ");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Thank you....!");
        }
    }
}
class InvalidAgeException extends Exception
{
    InvalidAgeException(String msg)
    {
        super(msg);
    }
}