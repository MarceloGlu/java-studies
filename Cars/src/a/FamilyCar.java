package a;

public class FamilyCar extends Car {

	public FamilyCar() {
		super();	
	}

	public FamilyCar(int number, int speed) {
		super(number, speed);		
	}

	@Override
	public String toString() {
		return "FamilyCar [getNumber()=" + getNumber() + ", getSpeed()=" + getSpeed() + ", getClass()=" + getClass()
				+ "]";
	}
	

}
