package Collections;

import java.util.HashSet;
import java.util.Set;

public class Hashsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> ee = new HashSet<>();
		ee.add("One");
		ee.add("Two");
		ee.add("Three");
		ee.add("Four");
		ee.add("Three");
		ee.add("Five");
		ee.add(null);
		System.out.println(ee);

	}

}
