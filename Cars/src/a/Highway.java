package a;



public class Highway {
	
	private String name;
	private Car[] cars = new Car[100];
	
	public void addCar(Car car) {
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] == null) {
				cars[i] = car;
				
			}
		}

}
}

