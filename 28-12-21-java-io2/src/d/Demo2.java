package d;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) {
		
		// 1. define a file to read from
		
		// 2. create a DataInputStream object
		File file = new File("files/primitives.data");
		// 3. read the data - we must know the format of the file
		try (DataInputStream in = new DataInputStream(new FileInputStream(file));){
		// data to file
		// the format we used it:
		// int
		// byte
		// double
		// boolean
		// long
		int x1 = in.readInt();
		byte x2 = in.readByte();
		double x3 = in.readDouble();
		boolean b = in.readBoolean();
		long x4 = in.readLong();
		
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(b);
		System.out.println(x4);
		
		
			

	} catch (IOException e ) {
		e.printStackTrace();
	}
	}

}
