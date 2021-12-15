package a;

public class Demo1 {

	public static void main(String[] args) {
		//create an array of int
		int [] arr = new int[5];
		System.out.println("length " + arr.length);
		
		//Assignment of 7 to arr[3]
		arr[3] = 7;
		
		//print the array elements
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
				
		//Si escribiera index 5 me responde que esta out of range for length 5
	}


}
