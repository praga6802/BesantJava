import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,fact=1;
        System.out.println("Enter a number:");
        n=sc.nextInt();
        fact=factorial(n);
        System.out.println("factorial of "+n+" is "+fact);
        sc.close();
    }
    static int factorial(int n){
        if(n==0)
            return 1;
        else
            return (n*factorial(n-1));
        }
}