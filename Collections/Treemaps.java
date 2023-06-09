package Collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Treemaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> ss = new TreeMap<String, String>();
		ss.put("Id", "101");
		ss.put("Name", "ABC");
		ss.put("Salary", "5.4 LPA");
		ss.put("Address", "Pune");
		ss.put("Work", "Home");
		//allows null values
		ss.put("Phone",null);
		// dont allows null keys
		//ss.put(null, "");
		// first method
		System.out.println(ss);
		System.out.println();
		// second method
		// Original Method using to print Map tree maps r using alphabetical orders 
		for (Entry<String, String> m : ss.entrySet()) {
			System.out.println(m.getKey() + "  " + m.getValue());

	}

}}
