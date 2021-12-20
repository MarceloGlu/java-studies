package d;

import a.Point;

public class BasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// integers - literal integer is int by default
		byte n1 = 5;
		short n2 = 10;
		int n3 = 15;
		int n33 = 20;
		long n4 = 9999999999L;

		// decimals - literal decimal is double by default
		float f1 = 5.3f; // change default literal type to float
		double f2 = 5D; // change default literal type to double

		// byte 8
		// short 16
		// int 32
		// long 64
		// float 32
		// double 64

		// the expression calculated value has type
		// the type is determined by the members
		float sum = n4 + n3 + f1; // the type of the result will be the bigger type but...
		// float or double win over integers, and double win over float.

		// p is a reference to a point object
		Point p = new Point(5, 3);
		// we use the reference to access the objects members
		//System.out.println(p.getX());
		
		

	}

}
