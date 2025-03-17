import java.util.Scanner;
public class SquareOrNot{
    public static void main(String[] args){
        SquareOrNot s=new SquareOrNot();
        boolean flag=s.square();
        if(flag==true){
            System.out.println("It is a Square");
        }
        else{
            System.out.println("It is Not a Square");
        }
        
    }
    boolean square(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length:");
        int l=sc.nextInt();
        System.out.println("Enter the breadth:");
        int b=sc.nextInt();
        sc.close();
        if(l==b){
            return true;
        }
        else{
            return false;
        }
    }
}