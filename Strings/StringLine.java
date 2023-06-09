package Strings;

import java.util.Scanner;

public class StringLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// NextLine is used for taking input with whole line and show as it is as output
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Line");
			// if we use only next only first word gets print
			String name = sc.next();
			//String name = sc.nextLine();
			System.out.println(name);
			sc.close();
	}
}
