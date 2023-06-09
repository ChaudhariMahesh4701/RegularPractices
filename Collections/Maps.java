package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> ss = new HashMap<String, String>();
		ss.put("Id", "101");
		ss.put("Name", "ABC");
		ss.put("Salary", "5.4 LPA");
		ss.put("Address", "Pune");
		ss.put("Work", "Home");
		ss.put(null, "BCD");
		ss.put(null, "CDE");
		// first method
		System.out.println(ss);
		System.out.println();
		// second method
		// Original Method using to print Map
		for (Entry<String, String> m : ss.entrySet()) {
			System.out.println(m.getKey() + "  " + m.getValue());
		}

	}

}
