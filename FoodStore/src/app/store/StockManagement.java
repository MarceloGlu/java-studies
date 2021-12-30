package app.store;

public class StockManagement {

	public static void main(String[] args) {

		Store basta = new Store();
		fillStore(basta);
		basta.showStock();
		
		System.out.println("heaviest apple in store: " + basta.heaviestApple());
		System.out.println("heaviest strawbery in store: " + basta.heaviestPear());
		System.out.println("heaviest fruit in store: " + basta.heaviestFruit());
	}

	public static void fillStore(Store store) {
		boolean notfull = true;
		while (notfull) {
			notfull = store.addFruit(getRandomFruit());
			System.out.println("Add fruits");
		}
		notfull = true;
		while (notfull) {
			notfull = store.addVegetable(getRandomVegetable());
			System.out.println("Add vegetables");
		}
		

	}
	

	public static Fruit getRandomFruit() {
		String color = Food.COLORS[(int) (Math.random() * Food.COLORS.length)]; // colors for both the same
		if (Math.random() < 0.5) {
			int weight = (int) (Math.random() * 201) + 100; // peso entre 200 y 300
			return new Apple(weight, color);
		} else {
			int weight = (int) (Math.random() * 101) + 100; // peso entre 100 y 200
			return new Pear(weight, color);
		}

	}
	public static Vegetable getRandomVegetable() {
		String color = Food.COLORS[(int) (Math.random() * Food.COLORS.length)]; // colors for both the same
		if (Math.random() < 0.5) {
			int weight = (int) (Math.random() * 201) + 100; // peso entre 200 y 300
			return new Tomato(weight, color);
		} else {
			int weight = (int) (Math.random() * 101) + 100; // peso entre 100 y 200
			return new Carrot(weight, color);
		}
}
}
