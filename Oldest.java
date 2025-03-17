import java.util.Scanner;
public class Oldest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter person1 age:");
		int a=sc.nextInt();
		System.out.println("Enter person2 age:");
		int b=sc.nextInt();
		System.out.println("Enter person3 age:");
		int c=sc.nextInt();
		Oldest o=new Oldest();
		int old=o.findingOld(a, b, c);
		System.out.println("The oldest person is "+old);
		int young=o.findingYoung(a,b,c);
		System.out.println("The youngest person is "+young);
		sc.close();
		}
	public int findingOld(int a,int b,int c) {
		if(a>b && a>c) {
			return a;
		}
		else if(b>a && b>c) {
			return b;
		}
		else {
			return c;
		}
	}
	public int findingYoung(int a,int b,int c) {
			if(a<b && a<c) {
				return a;
			}
			else if(b<a && b<c) {
				return b;
			}
			else {
				return c;
			}
	}
}
