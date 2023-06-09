package FileHandling;

import java.io.File;
import java.util.Scanner;

public class ReadingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f0 = new File("D://MEclipseFiles/FileOperationExample.txt");
		try (Scanner sc = new Scanner(f0)) {
			String fd = sc.nextLine();
			System.out.println(fd);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

	}

}
}