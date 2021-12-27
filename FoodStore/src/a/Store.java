package a;

public class Store {
	
	private Fruit[] fruits = new Fruit[100];
	private Vegetable[] vegetables = new Vegetable[100];
	public Store(Fruit[] fruits, Vegetable[] vegetables)
	
	{
		super();
		this.fruits = fruits;
		this.vegetables = vegetables;
	}
	public Store() {
		super();
	}
	public Fruit[] getFruits() {
		return fruits;
	}
	public void setFruits(Fruit[] fruits) {
		this.fruits = fruits;
	}
	public Vegetable[] getVegetables() {
		return vegetables;
	}
	public void setVegetables(Vegetable[] vegetables) {
		this.vegetables = vegetables;
	}
	
public void addFruit (Fruit fruit) {
	
	for  (int i = 0 ; i < fruits.length; i++) {
		if (fruits[i] == null) {
			fruits[i] = fruit;
			return;
		} 
	}
}

public void addVegetable(Vegetable vegetable) {
	
	for  (int i = 0 ; i < vegetables.length; i++) {
		if (vegetables[i] == null) {
			vegetables[i] = vegetable;
			return;
		} 
	}
}


	
}
	


