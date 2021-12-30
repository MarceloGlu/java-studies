package app.store;

public class Store {

	private Fruit[] fruits = new Fruit[5];
	private Vegetable[] vegetables = new Vegetable[5];

	public boolean addFruit(Fruit fruta) {
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i] == null) {
				fruits[i] = fruta;
				return true;
			}
		}
		return false;

	}

	public boolean addVegetable(Vegetable verdura) {
		for (int i = 0; i < vegetables.length; i++) {
			if (vegetables[i] == null) {
				vegetables[i] = verdura;
				return true;
			}
		}
		return false;

	}

	public void showStock() {
		System.out.println("=============================");
		System.out.println("Store stock:");
		System.out.println("Fruits:");
		for (Fruit fruit : fruits) {
			System.out.println(fruit);
		}
		System.out.println("Vegetables:");
		for (Vegetable veg : vegetables) {
			System.out.println(veg);
		}
		System.out.println("=============================");
	}
	public int heaviestApple() {
		int max = 0;
		for (Fruit fruit : fruits) {
			if (fruit instanceof Apple) {
				if (fruit.getWeight() > max) {
					max = fruit.getWeight();
				}
			}
		}
		return max;
	}
	public int heaviestPear() {
		int max = 0;
		for (Fruit fruit : fruits) {
			if (fruit instanceof Pear) {
				if (fruit.getWeight() > max) {
					max = fruit.getWeight();
				}
			}
		}
		return max;
	}

	public int heaviestFruit() {
		int a = heaviestApple();
		int b = heaviestPear();
		return a > b ? a : b;
		
	//  "a > b ? a : b" means "if a is bigger than b then a else b".
	//	O: ¿'a' es más grande que 'b'? Si sí "a", si no "b".
	}

	}

