class degree
{
    void getdegree()
    { System.out.println("I got a degree");
    }
}
class undergraduate extends degree
{  void degrees()
      { super.getdegree();
        System.out.println("Iam a undergraduate");
      }
}
class postgraduate extends degree
{   void degrees()
    { 
      System.out.println("Iam a postgraduate");

    }
    
}
    public class OverRide{

     public static void main(String []args){
      System.out.println("lakshanaa-20BIT066");
         undergraduate obj1= new  undergraduate();
         postgraduate obj2= new  postgraduate();
         obj1.degrees();
         obj2.degrees();
     }
}
