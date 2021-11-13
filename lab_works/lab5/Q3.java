import java.util.*;
interface Student1 {
    int studentId=27;
    String studentNam = "priya";
    String cls = "IT";
   //void getValue();
}
class Department implements Student1 {
    int attend;
    public void getAttendence()
    {
        Scanner get = new Scanner(System.in);
        //get.close();
        System.out.print("Enter Attendence : ");
        attend= get.nextInt();
    }
    public void getvalue()
    {
        System.out.println("ID : "+studentId + "\nName : "+studentNam+"\nclass : "+cls);
    }
}
class Exam extends Department
{
    public void booleligible()
    {
        if (attend<60)
        {
            System.out.println("Not Eligibile");
        }
        else
        {
            System.out.println("Eligibile");
        }
    }
}
public class Q3 {
    public static void main(String[] args) {
        System.out.println("lakshanaa-20BIT066");
        Exam ob = new Exam();
        ob.getvalue();
        ob.getAttendence();
        System.out.print("\nEligibility : ");
        ob.booleligible();
    }
}
