package b.shapes;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape shape = new Shape();
		shape.setColor("RED");

		System.out.println(shape.getColor());

		shape.setColor("BLUE");
		System.out.println(shape.getColor());

		System.out.println("area: " + shape.getArea());
	}

}
