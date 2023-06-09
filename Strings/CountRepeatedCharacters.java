package Strings;

import java.util.Arrays;

public class CountRepeatedCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ahemednagar";
		char b[] = s.toCharArray();
		Arrays.sort(b);
		System.out.println(b);
		for (int i = 0; i < b.length; i++) {
			int c = 1;
			// char t = b[i];
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] == b[j]) {
					c++;
					i++;
				}
			}
			if (c > 1) {
				System.out.println(b[i] + " : " + c);

			}
		}
	}
}