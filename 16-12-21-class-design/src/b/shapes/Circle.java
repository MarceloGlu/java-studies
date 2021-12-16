package b.shapes;

public class Circle extends Shape {

	private double radius;

		public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
		public Circle(double radius) {
			this("Black", radius);
		}

		public Circle() {
			super();		
	}
		
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
