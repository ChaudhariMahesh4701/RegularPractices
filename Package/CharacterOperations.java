package Package;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Pattern p = Pattern.compile(". . s"); //Represents Single character
	      Matcher m = p.matcher("ass");
	      
	      boolean b = m.matches();
	      System.out.println(b);
	      
	      boolean b1 = Pattern.compile(".s").matcher("as").matches();
	      System.out.println(b1);
	      
	      boolean b2= Pattern.matches(".s.","css");
	      System.out.println(b2);
		
			boolean b0 = Pattern.matches("[amn]+","mna");
			System.out.println(b0);   //true
			
			boolean b3 = Pattern.matches("[amn]","a"); 
			System.out.println(b3);   // true
			
			boolean b4 = Pattern.matches("[amn]","ammmna");
			System.out.println(b4);   //false
			
			boolean b5 = Pattern.matches("[a-f]+","abs");
			System.out.println(b5);    // false
			
			boolean b6 = Pattern.matches("[a-f]+","aaabbbbcccdddeeefff");
			System.out.println(b6);    //true
			
			boolean b7 = Pattern.matches("[a-f]{5}","abcde");
			System.out.println(b7);    //true
			
			boolean b8 = Pattern.matches("[a-f]*","af");
			System.out.println(b8);     // true
			
			boolean b9 = Pattern.matches("[amn]?", "a");
			System.out.println(b9);   // true (a or m or n comes one time)
			
			boolean b10 = Pattern.matches("[amn]?", "aaa");
			System.out.println(b10);   // false (a come more than one time)
			
			boolean b11 = Pattern.matches("[amn]?","aammmnn");
			System.out.println(b11);    // false (a m and n comes more than one time)
			
			boolean b12 = Pattern.matches("[amn]?", "aazziz");
			System.out.println(b12);    // false
			
			boolean b13 = Pattern.matches("[amn]?","am");
			System.out.println(b13);    // false
			
		// Regex Example
		
				boolean b01 = Pattern.matches("[a-zA-Z0-9]{6}","arun32");
				System.out.println(b01);  // true
				
				boolean b02 = Pattern.matches("[a-zA-Z0-9]{6}","Khvarun32");
				System.out.println(b02);  // false (more than 6char)
				
				boolean b03 = Pattern.matches("[a-zA-Z0-9]{6}","JA2UK2");
				System.out.println(b03);  // true 
				
				boolean b04 = Pattern.matches("[a-zA-Z0-9]{6}","arun$2");
				System.out.println(b04);  // false ($ is not matched)
	}
}