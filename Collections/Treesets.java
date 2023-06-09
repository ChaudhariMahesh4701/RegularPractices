package Collections;

import java.util.Set;
import java.util.TreeSet;

public class Treesets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> ee = new TreeSet<>();
		ee.add("One");
		ee.add("Two");
		ee.add("Three");
		ee.add("Four");
		// repeated value
		ee.add("Three");
		ee.add("Five");
		System.out.println(ee);
		
		Set<String> dd = new TreeSet<>();
		dd.add("A");
		dd.add("B");
		dd.add("C");
		dd.add("D");
		dd.add("E");
		dd.add("1");
		dd.add("2");
		dd.add("33");
		dd.add("1111");
		System.out.println(dd);
		System.out.println();
		
		TreeSet<Integer> tt = new TreeSet<>();
		tt.add(20);
		tt.add(17);
		tt.add(6);
		tt.add(8);
		tt.add(10);
		tt.add(7);
		tt.add(18);
		tt.add(13);
		System.out.println(tt);
	}
}