package inter;

import java.util.Scanner;

public class fib 
{
	Scanner d=new Scanner(System.in);
	 void meth1()
	 {
		 System.out.println("enter no");
		 int n=d.nextInt();
		 int n3,n2=1,n1=0;
		// n3=n2+n1;
		 //System.out.print(n1+" "+n2);
		 for(int i=3;i<=n+2;i++)
		 {
			 n3=n2+n1;
			 System.out.print(n3+" ");
			 n1=n2;
			 n2=n3;
		 }
	 }
	 public static void main(String[] args) {
		new fib().meth1();
	}
}
