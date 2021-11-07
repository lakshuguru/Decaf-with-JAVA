public class SiCi {
    public static void main(String a[]){
        int p,n,r,sim;
        double com;
        p=2964;
        n=1;
        r=10;
        sim=(p*n*r)/100;
        com=p*Math.pow(1+(r/100),n);
        System.out.print("lakshanaa-20bit066 \nsimple intrest : "+sim+"\ncompound intrest : "+com);
    }
}
