package a;

public class Car {

	private int number;		
	private int speed;	
	public static final int Min_Speed = 0;
	public static final int Max_Speed = 110;
	
	
	
	public Car() {
		super();
	}

	public Car(int number, int speed) {
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

	public int getSpeed() {
		return speed;
	}

	public boolean setSpeed(int speed) {
		if (speed >= Min_Speed && speed <= Max_Speed) {
		this.speed = speed;
		return true;
		}else {
			return false;}
	}
	

	public static int getMinSpeed() {
		return Min_Speed;
	}

	public static int getMaxSpeed() {
		return Max_Speed;
	}
	
	
	
	
	
	
}
	
	
	
		