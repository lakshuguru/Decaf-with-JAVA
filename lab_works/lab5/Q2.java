abstract class Vehicle{
    String name;     
    int wheels;
    float weight;
    int passengers;
    float payload;
    abstract void Display();
}
class Car extends Vehicle{
     Car(String nam,float wg,int pas,int wh)
     {
         name =nam;
         weight = wg;
         passengers = pas;
         wheels = wh;
     }
    void Display() {
        System.out.println("\n   Details of Car");
        System.out.println("Name          : "+name);
        System.out.println("Weight        : "+weight+"tons");
        System.out.println("Passengers    : "+passengers);
        System.out.println("No. of wheels : "+wheels+"wheels");
    }
}
class Truck extends Vehicle{
    Truck(String nam,float wg,int wh,float pl)
    {
        name =nam;
        weight = wg;
        wheels = wh;
        payload = pl;
    }
    void Display() {
        System.out.println("\n   Details of Truck");
        System.out.println("Name          : "+name);
        System.out.println("Weight        : "+weight+"tons");
        System.out.println("No. of wheels : "+wheels+"wheels");
        System.out.println("Payload       : "+payload+" tons");
    }
}


public class Q2 {
    public static void main(String[] args) {
        System.out.println("lakshanaa-20BIT066");
        Car ob1 = new Car("shift",2.4f,4,4);
        ob1.Display();
        Truck ob2 = new Truck("Diamond",4.45f,8,4.0f);
        ob2.Display();
    }
}
