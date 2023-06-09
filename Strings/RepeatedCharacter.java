package Strings;

import java.util.Arrays;

public class RepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// First Method
		String s1 = "pratapa";
		// String [] s1 = {"G","a","u","r","a","v"}
		char b[] = s1.toCharArray();
		Arrays.sort(b);
		System.out.println(b);
		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] == b[j]) {
					System.out.println(b[i]);				}
			}
		}
	}
}
		