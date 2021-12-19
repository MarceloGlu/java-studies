package b;

public class CarTest {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.setSpeed(25);
		System.out.println(car.getSpeed());
		
		
		car.setSpeed(2500);
		System.out.println(car.getSpeed());
		/* 
		 No imprime "2500" porque en Car.java limitamos la velocidad de esta forma
		 if (newSpeed >= 0 && newSpeed <=90) {
		 speed = newSpeed;			
		 }
		 de modo que si la velocidad es menor que 0 o mayor que 90 no la registra.		
		 */
		
		
		car.setSpeed(0);
		System.out.println(car.getSpeed());
	}

}
