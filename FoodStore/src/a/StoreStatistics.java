package a;

public class StoreStatistics {

	public static void main(String[] args) {

		Store store = new Store();
			
		for (int i = 0; i <= 50; i++)
			store.addFruit(new Apple(100, "Sweet"));
		
		for (int i = 0; i <= 50; i++)
			store.addFruit(new Strawberry(100, "Sweet"));
		
		for (int i = 0; i <= 50; i++)
			store.addVegetable(new Carrot(100, "Sweet"));
		
		for (int i = 0; i <= 50; i++)
			store.addVegetable(new Tomato(100, "Sweet"));
		
		
		
		
		

		
		
		
		
		
		

	}
}
