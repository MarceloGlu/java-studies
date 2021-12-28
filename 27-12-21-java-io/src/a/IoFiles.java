package a;

import java.io.File;
import java.io.IOException;

public class IoFiles {

	public static void main(String[] args) {
		
		try {
		String path = "c:/Marcelo/temp/file1.txt";
		
		
		// Create a file object that points to our file
		File file = new File(path);
		
		// Checks if the file exists
		System.out.println((file.exists()));

		if (!file.exists()) {
				file.createNewFile();
				System.out.println("file created: " + file);
			} else {
				System.out.println("file exists");
			}
		}
		catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

