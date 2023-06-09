package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorsArrayLists {

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

		// print one by one // one method
		  Iterator<String> ii = aa.iterator(); 
		  while(ii.hasNext()) {
		  System.out.println(ii.next()); }
		  System.out.println("");
		  
	}
}