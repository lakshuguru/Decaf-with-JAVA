class Bank{
    int getBalance()
    {return 0;}
    }
    class BankA extends Bank
    {
    void getbalance()
    {
    super.getBalance();
    System.out.println("Amount in BankA : $1000");
    }
    }
    class BankB extends Bank
    {
    void getbalance()
    {
    System.out.println("Amount in BankB : $1500");
    }
    }
    class BankC extends Bank
    {
    void getbalance()
    {
    System.out.println("Amount in BankC : $2000");
    }
    }
    
public class Money {
    public static void main(String l[]){
        System.out.println("lakshanaa-20bit066");
        BankA o1=new BankA();
        BankB o2=new BankB();
        BankC o3=new BankC();
        o1.getbalance();
        o2.getBalance();
        o3.getBalance();
    }
        
}
