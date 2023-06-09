package Package;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> aa = new ArrayList<String>();
		aa.add("Sham");
		aa.add("Ram");
		aa.add("Nam");
		aa.add("Ghansham");
		aa.add("Ram");
		System.out.println(aa);
		
		Iterator<String> ii =  aa.iterator();
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
		

	}

}
