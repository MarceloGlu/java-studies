package app.store;

public class Strawberry extends Fruit {

	public Strawberry() {
		// TODO Auto-generated constructor stub
	}

	public Strawberry(int weight, String color) {
		super(weight, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Strawberry [Weight=" + getWeight() + ", Color=" + getColor() + "]";
	}
	

}
