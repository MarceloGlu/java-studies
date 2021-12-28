package b;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextToFile {

	public static void main(String[] args) {
		
	File directory = new File("c:/Marcelo/temp");
		File file = new File(directory, "/file2.txt");
		if(!directory.exists()) {
			directory.mkdir(); // creates a directory if the path exists already
			directory.mkdirs(); // create the path until the present directory			
		}
		
		// This is the file we want to write to
		File file1 = new File(directory, "/file2.txt");
		
		// create an object that can write text to file
		// add buffer
		boolean append = true; //add to existing content or not
		try (BufferedWriter out = new BufferedWriter(new FileWriter(file1, append));){
			out.write("this is the first line,");
			out.newLine();
			out.write("this is the second line,");
			out.newLine();
			System.out.println("text written");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
