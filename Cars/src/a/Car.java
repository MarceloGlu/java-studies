package a;

public class Car {

	private int number;		
	private Speed[] speed = new Speed[0-110];
	
	public Car(int number, Speed[] speed) {
		super();
		this.number = number;
		this.speed = speed;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Speed[] getSpeed() {
		return speed;
	}

	public void setSpeed(Speed[] speed) {
		this.speed = speed;
	}
	

	
}

	