package app.beans;

public class Elevator {
	
	int numberOfFloors;
	int currentFlor;
	int capacity;
	
	public Elevator() {
		super();
	}

	public Elevator(int numberOfFloors, int currentFlor, int capacity) {
		super();
		this.numberOfFloors = numberOfFloors;
		this.currentFlor = currentFlor;
		this.capacity = capacity;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}

	public int getCurrentFlor() {
		return currentFlor;
	}

	public void setCurrentFlor(int currentFlor) {
		this.currentFlor = currentFlor;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
	

}
