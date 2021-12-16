package b;

public class TestCoordinates {

	public static void main(String[] args) {
		
		Coordinates c1 = new Coordinates();
		c1.print();
		
		c1.x = 100;
		c1.y = 50;
		c1.moveRight();
		
		c1.print();

	}

}
