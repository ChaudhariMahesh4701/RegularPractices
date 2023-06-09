package Package;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> Birds = new ArrayList<>();
		System.out.println("name");
		Birds.add("hawk");
		Birds.add("swan");
		Birds.add("crow");
		Birds.add("dove");
		System.out.println(Birds);
		System.out.println(Birds.size());
		 System.out.println("The element C is available in ArrayList? " + Birds.contains("hawk"));
	    
	}
}
