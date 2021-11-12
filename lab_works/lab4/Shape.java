import java.util.*;
class OverLoad
{
int area(int a){
return (a*a);
}
int area(int l,int b)
{
return(l*b);
}
}
public class Shape {
public static void main(String[] args)
{
Scanner get = new Scanner(System.in);
//get.close();
int a,l,b;
OverLoad ob = new OverLoad();
System.out.println("lakshanaa-20bit066");
System.out.print("Side of Square : ");
a = get.nextInt();
System.out.print("Length of rectangle : ");
l = get.nextInt();
System.out.print("Width of rectangle : ");
b = get.nextInt();
System.out.println("\n"+"Area of Square : " + ob.area(a)+" units");
System.out.println("Area of Rectangle : "+ ob.area(l,b)+" units");
}
}
