package app.store;

public class Store {
	
	private Fruit[] fruits = new Fruit[100];
	private Vegetable[] vegetables = new Vegetable[100];
	
	public void addFruit(Fruit fruta) {
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i]==null) {
				fruits[i] = fruta;
				return;
			}
		}
		
	}
	public void addVegetable(Vegetable verdura) {
		for (int i = 0; i < vegetables.length; i++) {
			if (vegetables[i]==null) {
				vegetables[i] = verdura;
				return;
			}
		}
		
	}
	
	

}
