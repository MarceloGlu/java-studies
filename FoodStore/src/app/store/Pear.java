package app.store;

public class Pear extends Fruit {

	public Pear() {
		// TODO Auto-generated constructor stub
	}

	public Pear(int weight, String color) {
		super(weight, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pear [Weight=" + getWeight() + ", Color=" + getColor() + "]";
	}
	

}
