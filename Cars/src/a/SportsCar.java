package a;

public class SportsCar extends Car {

	public SportsCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SportsCar(int number, int speed) {
		super(number, speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SportsCar [getNumber()=" + getNumber() + ", getSpeed()=" + getSpeed() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	

	
}
