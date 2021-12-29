package app.store;

public abstract class Food {

	private int weight;
	private String color;

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Food(int weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Food [weight=" + weight + ", color=" + color + "]";
	}

	public static final String[] COLORS =

			{ "BLACK", "RED", "GREEN", "BLUE", "WHITE", "ORANGE" };

}