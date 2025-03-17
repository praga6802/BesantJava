import java.util.Scanner;
public class PrimeorNot{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the number:");
        n=sc.nextInt();
        int d=n/2;
        boolean flag=true;
        if(n==0 || n==1){
            System.out.println("Not prime number");
        }
        else{
            for(int i=2;i<=d;i++){
                if(n%i==0){
                    System.out.println("Not prime number");
                    flag=false;
                    break;
                }
            }
        }
        if(flag==true){
            System.out.println("Prime Number");
        }
        sc.close();
    }
}