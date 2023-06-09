package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i = 10/0;
		} catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();// errors with all details
			System.out.println("");
			System.out.println(e);//just error
			System.out.println("");
			System.out.println(e.getMessage());// only error with output no showing any error
		}
		System.out.println("Hello");
		
		// 
		try (Scanner sc = new Scanner(System.in)) {
			String ss = sc.nextLine();
			System.out.println(ss);
		} // this try block is called try-with-resources is used to automatically close the canner object
		

	}

}
