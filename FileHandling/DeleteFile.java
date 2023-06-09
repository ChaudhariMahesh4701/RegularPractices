package FileHandling;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f0 = new File("D://MEclipseFiles/FileOperationExample.txt");
		f0.delete();
		System.out.println("Delete Sucessfully");

	}

}
