package b.shapes;

public class Rectangle extends Shape {
	
	private double length;
	private double width;
	
		
	public Rectangle(String color, double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
	}
	public Rectangle(double length, double width) {
		this("Black", length, width);
	}

	public Rectangle() {
		super();
	}
	
	

}
