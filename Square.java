import java.util.Scanner;
public class Square{
    public static void main(String[] args){
        Square s=new Square();
        boolean flag=s.SquareorNot();
        if(flag==true){
            System.out.println("It is a square");
        }
        else{
            System.out.println("It is not square");
        }

        
    }
    boolean SquareorNot(){
        Scanner sc=new Scanner(System.in);
        int l,b;
        System.out.println("Enter the length & breadth");
        l=sc.nextInt();
        b=sc.nextInt();
        sc.close();
        if(l==b){
            return true;
        }
        return false;
    }
}