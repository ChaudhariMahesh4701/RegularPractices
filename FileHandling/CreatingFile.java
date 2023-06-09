package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreatingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {  
		File f0 = new File("D://MEclipseFiles/FileOperationExample.txt");
		if (f0.createNewFile()) {  
			System.out.println("File " + f0.getName() + " is created successfully.");  
		} else {  
			System.out.println("File is already exist in the directory.");  
		}  
	} catch (IOException exception) {  
		System.out.println("An unexpected error is occurred.");  
		exception.printStackTrace();  
		// it can create any type of files
	}
}
}
