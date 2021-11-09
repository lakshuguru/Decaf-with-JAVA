import java.util.*;
class info{
 String nam;
 int rol_no;
 String info1;
}
public class Studentinfo1 {
 public static void main(String[] args) {
 Scanner get = new Scanner(System.in);
 info s1 = new info();
 System.out.println("Subhashini_20BIT010");
 System.out.print("Enter your name : ");
 s1.nam = get.next();
 System.out.print("Enter your Roll no. : ");
 s1.rol_no = get.nextInt();
 System.out.print("Enter your area of interest : ");
 get.nextLine();
 s1.info1 = get.nextLine();
 System.out.println("\n"+"Hey, my name is "+s1.nam+" and my roll number is" 
+s1.rol_no+",My field of interest are "+s1.info1);
 }
}