package b;

public class Coordinates {
	int x;
	int y;

	void print() {
		
		System.out.print("(");
		System.out.print(x);
		System.out.print(", ");
		System.out.print(y);
		System.out.println(")");
		
		}
	void moveRight() {
		x++;
	}

}
