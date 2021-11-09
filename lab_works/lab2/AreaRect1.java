package lab_ex2;

class tt {
    int lenght;
    int breath;

    tt(int l, int b) {
        this.lenght = l;
        this.breath = b;
    }

    public int area()
    {
        return lenght * breath;
    }
}
public class AreaRect1{
    public static void main(String[] args) {
        tt obj = new tt(8,10);
        tt obj1 = new tt(15,18);
        System.out.println("LAKSHANAA-20BIT066");
        System.out.println(obj.area());
        System.out.println(obj1.area());
    }    
}

