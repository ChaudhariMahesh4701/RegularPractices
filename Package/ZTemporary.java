package Package;

import java.util.Scanner;

class ZTemporary{

	public static void main(String[] args) {
try (Scanner sc = new Scanner(System.in)) {
	do {
	boolean flag= false;
	int count=0;
	int password= 123;
	System.out.println("Enter the password");
	int match=sc.nextInt(); 
	if(match==password) {
		
		System.out.println("Yes");
	}
	
	else { 
		count++;
		System.out.println("Invalid");
		flag=true;
		if(count==3) {
			System.out.println("Yo can't do anymore");
		}
	
	
	}
	}while(true);
}
	}
}