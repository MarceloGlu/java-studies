package b;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteTextToFile2 {

	public static void main(String[] args) {

		File directory = new File("c:/Marcelo/temp");
//		File file = new File(directory, "/file2.txt");
//		if(!directory.exists()) {
//			directory.mkdir(); // creates a directory if the path exists already
//			directory.mkdirs(); // create the path until the present directory			
//		}

		// This is the file we want to write to
		File file1 = new File(directory, "/file2.txt");

		// create an object that can write text to file
		// add buffer
		boolean append = false; // add to existing content or not
		try (PrintWriter out = new PrintWriter(new FileWriter(file1, append));) {
			out.println("this is the first line,");
			out.println(8);
			out.println(8.3);
			System.out.println("text written");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
