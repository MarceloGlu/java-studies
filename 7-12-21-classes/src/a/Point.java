package a;

public class Point {

	// atributos
	int x;
	int y;

	// funcion
	void print() {
		System.out.print("(");
		System.out.print(x);
		System.out.print(", ");
		System.out.print(y);
		System.out.println(")");
	}

	// funcion
	void moveRight() {
		x++;
	}

	// funcion
	void moveLeft() {
		x--;
	}
}
