import java.util.*;
abstract class Mark{
    float m1,m2,m3,m4;
    abstract float percentange();
}
class A extends Mark{
    public A(float mark1,float mark2,float mark3){
        m1=mark1;
        m2=mark2;
        m3=mark3;
    }
    public float getpercentage(){
        float p1=(m1+m2+m3)/3.0f;
        return p1;
    }
    @Override
    float percentange() {
        // TODO Auto-generated method stub
        return 0;
    }

}
class B extends Mark{
    public B(float mark1,float mark2, float mark3, float mark4){
        m1=mark1;
        m2=mark2;
        m3=mark3;
        m4=mark4;
    }
    public float getpercentage()
    {
        float p2=(m1+m2+m3+m4)/4.0f;
        return p2;
    }
    @Override
    float percentange() {
        // TODO Auto-generated method stub
        return 0;
    }
}
public class Q1{
    public static void main(String arg[]){
        Scanner g=new Scanner(System.in);
        float m1,m2,m3,m4;
        System.out.print("lakshanaa-20bit066 \nenter mark of student A : \n");
        m1=g.nextFloat();
        m2=g.nextFloat();
        m3=g.nextFloat();
        A o1=new A(m1,m2,m3);
        System.out.println("enter the mark of student B :\n");
        m1=g.nextFloat();
        m2=g.nextFloat();
        m3=g.nextFloat();
        m4=g.nextFloat();
        B o2=new B(m1,m2,m3,m4);
        System.out.println("percentage of student A : "+o1.getpercentage()+"%\npercentage of student B : "+o2.getpercentage()+"%");

    }
}