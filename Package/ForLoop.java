package Package;
import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		// First Method
		for (int a=1; a<=5; a++)
		// We declare int a in for loop so it is only for loop we cannot this use outside the loop 
		{
			System.out.println(a);
		}
		// Second Method
		// Loop starts from i
		Scanner var = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = var.nextInt();
		for (int i=n; i<=10;i++) ;
		{
			System.out.println("i");
		}
		// Third Method
		// Loop starts from j+1
		System.out.println("Enter the Number");
		n= var.nextInt();
		for (int j=n+1; j<=10; j++)
	  //for (int j++; j<=10; j++)
		{
			System.out.println(j);
		}
		// Fourth Method
		System.out.println("Enter the name and how many times to print");
		String ss = var.next();
		int n1 = var.nextInt();
		for (int i = 1; i <= n1; i++) 
		{
			System.out.println(ss);
		}
		//
		System.out.println("How its Working");
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
		var.close();
	}
}