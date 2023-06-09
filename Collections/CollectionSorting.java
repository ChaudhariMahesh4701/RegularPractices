package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ss = new ArrayList<>();
		ss.add("Mahesh");
		ss.add("Ramesh");
		ss.add("Ganesh");
		ss.add("Suresh");
		ss.add("Nimesh");
		ss.add("Ganesh");
		System.out.println("Before Sorting : " + ss + "\n");
		Collections.sort(ss);
		System.out.println("After Sorting : " + ss);
	}

}