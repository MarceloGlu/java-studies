package getters_setters;

public class Account {

	// Getters and Setters let you get and set variables inside a Class
	// a Class represents an object
	// an object has attributes and behaviors (methods)

	String name;
	int age;

	public static void main(String[] args) {

		Account a = new Account();

		a.setName("Pablo");
		a.setAge(34);
		System.out.println(a.getName());
		System.out.println(a.getAge());

		a.printDetails();

	}

	public void printDetails() {
		System.out.println(getName() + ", " + getAge());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
