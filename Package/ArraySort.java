package Package;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sorting in Ascending order
		int[] marks = new int[5];
		marks[0] = 300;
		marks[1] = 200;
		marks[2] = 100;
		marks[4] = 800;
		marks[3] = 500;
		Arrays.sort(marks);
		for (int i : marks)
			System.out.println(i);		
	}
}