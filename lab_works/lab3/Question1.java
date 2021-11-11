import java.util.*; 
class Student{ 
    static String nam; 
    static int rol;
static int m1,m2,m3; 
static float sum,per;
void info()
{
System.out.print("Enter name : "); 
nam = Question1.get.nextLine(); 
System.out.print("Enter Rollno : ");

rol = Question1.get.nextInt();
}
}
class Marks extends Student { 
    void marks() {
System.out.print("Enter Marks : ");
m1 = Question1.get.nextInt();
m2 = Question1.get.nextInt(); 
m3 = Question1.get.nextInt();
}
}
class Result extends Student
{
void result()
{
sum = m1+m2+m3; 
per = sum/3;
System.out.println("\nName : "+nam+ "\n"+"Roll no : "+rol);

System.out.println("m1 : "+ m1+"\n"+"m2 : "+m2+"\n"+"m3 : "+m3);
System.out.println("Total marks : "+sum+"\n"+"Percentage : "+per );
}
}
 
public class Question1 {
static Scanner get = new Scanner(System.in); 
public static void main(String[] args){ 
    System.out.println("lakshanaa-20BIT066");
    Student obj = new Student();
    obj.info();
    Marks obj1 = new Marks(); 
    obj1.marks();
    Result obj2 = new Result();
    obj2.result();
}
}
