import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Sample s=new Sample();
        int t=s.quantity();
        if(t>10){
            s.dprice(t);
        }
    }
    int quantity()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter f1 & f2");
        int f1=sc.nextInt();
        int f2=sc.nextInt();
        sc.close();
        int total=f1+f2;
        return total;
        
    }
    
    void dprice(int t){
        double discount=0.5;
        int price=(int)(t*discount);
        System.out.println("Price after discount:"+price);
    }
    
}
