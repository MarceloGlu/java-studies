package c.constructors;

public class DogMain {

	public static void main(String[] args) {
		
		Dog myDog = new Dog("Crino", 10);
		
		System.out.println(myDog.name);						// prints the name
		System.out.println(myDog.age);						// prints the age
		System.out.println(myDog.name + ", " + myDog.age);	// prints both
		System.out.println(myDog);							// prints toString
		
		
	}
	

}
