package app.store;

public class Store {

	private Fruit[] fruits = new Fruit[100];
	private Vegetable[] vegetables = new Vegetable[100];

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

}
