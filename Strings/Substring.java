package Strings;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// First Method
		
		String s = "java is fun";
		System.out.println(s.substring(0,4));
		System.out.println(s.substring(5,7));
		System.out.println(s.substring(8, 11));
		System.out.println("\n");
		
		//Starts From 0 And ends with 3  OR 
		// Always starts from 0 starts 0 and end with 4-1=3 till 4
		
		// Second Method
		String name ="Mahesh";
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(4));
	}
}