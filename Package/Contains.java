package Package;

import java.util.Scanner;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		int MyArray[] = {1,2,3,4,5,6,7,8,9,0};
		for(int x:MyArray)
		{
			if(x==a)
			{
				System.out.println("This number is present in Array");
			}
			else
			{
				System.out.println("This number is not present in Array");
			}
			sc.close();
		}
	}
}
