package b;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class collections2 {

	public static void main(String[] args) {

		// create a list
		Set<String> set = new HashSet<String>();

		// print list size (number of elements)
		System.out.println("size " + set.size());

		// add elements to list
		set.add("hello");
		set.add("java");
		set.add("world");
		set.add("java");
		set.add("hello");

		// add is a method of collection
		// list inherits the interface add from collection

		// print the list
		System.out.println(set);
		System.out.println("size " + set.size());
		
	}

}
