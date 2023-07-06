
package Practice;
class Emp


{​​​​​


    Emp(int id, String name , int age , int salary , String desig, String pan)


    {​​​​​


        System.out.println(" yes perferct  HR ");


    }​​​​​


    Emp(int id, String name , String project, String loc)


    {​​​​​


        System.out.println(" yes perferct  manager ");    


    }​​​​​



}​​​​​


class  Demo17


{​​​​​


    public static void main(String args[])


    {​​​​​


         Emp e = new Emp(100,"Rama",35,45678,"Dev","ABC123");


        Emp e2 = new Emp(100,"Rama","Facebok","Banglore");


    }​​​​​    


}​​​​​


// HR  : id, name ,age , salry , loc,


// manager  :id , name , project , location 


------------------------------------------
class Emp
{
    Emp(int id, String name , int age , int salary , String desig, String pan)
    {
        System.out.println(" yes perferct  HR ");
    }
    Emp(int id, String name , String project, String loc)
    {
        System.out.println(" yes perferct  manager ");    
    }

}
class  Demo17
{
    public static void main(String args[])
    {
         Emp e = new Emp(100,"Rama",35,45678,"Dev","ABC123");
        Emp e2 = new Emp(100,"Rama","Facebok","Banglore");
    }    
}
// HR  : id, name ,age , salry , loc,
// manager  :id , name , project , location 