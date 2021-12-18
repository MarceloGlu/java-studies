package a;

public class CarTest {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.setSpeed(25);
		System.out.println(car.getSpeed());
		
		car.setSpeed(250);
		System.out.println(car.getSpeed());
	}

}
