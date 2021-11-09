package lab_ex2;

import java.util.Scanner;

class area{
    int length;
    int breadth;
    area(int a, int b)
    {
         length = a;
         breadth = b;
    }
    public int areareturn()
    {
        return length * breadth;
    }
}

public class AreaRect2{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        obj.close();
        int a,b;
        System.out.println("LAKSHANAA-20BIT066");
        System.out.println("Enter the lenght of Recatangle");
        a = obj.nextInt();
        obj.nextLine();
        System.out.println("Enter the breadth of Recatangle");
        b = obj.nextInt();
        area ob1 = new area(a,b);
        System.out.println("Area = "+ ob1.areareturn());
    }
}