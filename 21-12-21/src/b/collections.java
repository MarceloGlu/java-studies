package b;

import java.util.ArrayList;
import java.util.List;

public class collections {

	public static void main(String[] args) {

		// create a list
		List<String> list = new ArrayList<String>();

		// print list size (number of elements)
		System.out.println("size " + list.size());

		// add elements to list
		list.add("hello");
		list.add("java");
		list.add("world");
		list.add("java");
		list.add("hello");

		// add is a method of collection
		// list inherits the interface add from collection

		// print the list
		System.out.println(list);
		System.out.println("size " + list.size());
		System.out.println(list.get(2)); // get element by index

	}

}
