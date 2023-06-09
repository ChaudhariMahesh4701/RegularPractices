package FileHandling;

import java.io.File;
import java.io.FileWriter;

public class WritingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f0 = new File("D://MEclipseFiles/FileOperationExample.txt");
		try {
			FileWriter fileW = new FileWriter(f0);
			fileW.write("Welcome to India");
			fileW.close();
			System.out.println("Done");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
