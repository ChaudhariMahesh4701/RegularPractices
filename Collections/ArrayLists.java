package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> aa = new ArrayList<String>();
		aa.add("Sham");
		aa.add("Ram");
		aa.add("Nam");
		aa.add("Ghansham");
		aa.add("Ram");

		// print in array
		System.out.println(aa);
		System.out.println("");

		// print one by one // one method for each loop
		for (String bb : aa)
			System.out.println(bb);
		System.out.println("");

		// print one by one // two method using lambda expressions and for each loop
		aa.forEach(bb -> System.out.println(bb));
		System.out.println("");
		
		// fourth method method reference
		aa.forEach(System.out::println);

	}
}
/*Functions
 * add() remove() contains() size()
 */
	