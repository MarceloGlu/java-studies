package a;

public class Point {
	
	int x;
	int y;
	
	
	void print() {
		System.out.print("(");
		System.out.print(x);
		System.out.print(", ");
		System.out.print(y);
		System.out.println(")");
	}
		
	void moveRight(){
		x++;
	}
	void moveLeft(){
		x--;
	}
	
	
	/*public static void main(String[] args) {
		
		Point p = new Point();
		p.print();
		p.x = 25;
		p.y = 5;
		p.print();
		
		Point p2 = new Point();
		p2.print();
		p2.x = 30;
		p2.y = 60;
		p2.print();
	}
		
	
	
	public static void main(String[] args) {
		Point pt; //variable declaration: type + identifier
		point = new Point; //variable initialization;
		Point pt2 = new Point; //declaration + initialization
		
		int x; //declaration
		x = 25; //initialization
		
		int y = 300; //declaration + initialization		
		
	}*/

}
