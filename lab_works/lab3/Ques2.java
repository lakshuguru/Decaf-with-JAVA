import java.util.*;

class Polygon

{
static int len ,wid,side;
static float rad;
void inp()
{
System.out.print("Enter the length and Width of rectangle : ");
//Scanner Myclass=new Scanner(System.in);
len = Ques2.get.nextInt();
wid = Ques2.get.nextInt();
System.out.print("Enter the sides of square : ");
side = Ques2.get.nextInt();
System.out.print("Enter the radius of circle : ");
rad = Ques2.get.nextFloat();
}
}
class Rectangle extends Polygon
{
int a1 = len*wid;
int p1 = 2*(len+wid);
void display()
{
System.out.println("\nArea of Rectangle : "+a1+" units"+"\nPerimeter of Rectangle : "+p1+" units");
} 
}
class Square extends Polygon
{
int a2 = side*side;
int p2 = 4*side;
void display()
{
System.out.println("\nArea of Square : "+a2+" units"+"\nPerimeter of Square : "+p2+" units");
}
}
class Circle extends Polygon
{
float a3 = 3.14f*rad*rad;
float p3 = 2 *3.14f*rad;
void display()
{
System.out.println("\nArea of Circle : "+a3+" units"+"\nPerimeter of Circle : "+p3+" units");
}
}
public class Ques2 {
static Scanner get = new Scanner(System.in);
public static void main(String[] args)
{
System.out.println("lakshanaa-20BIT066");
Polygon o = new Polygon();
o.inp();
Rectangle o1 = new Rectangle();

o1.display();

Square o2 = new Square();
o2.display();
Circle o3 = new Circle();
o3.display();
}
}

