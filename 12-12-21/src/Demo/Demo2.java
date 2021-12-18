package Demo;

public class Demo2 {
	
	//attributes defined in the class are global
	//global variable are initialized automatically no default values
	private int id;
	private String name;
	private int age;

	
	public int getId() {
		int id; //this is a local to this method - not initialized
		id = 10; //initialization
		System.out.println(id); //10
		System.out.println(this.id); //the value of the Person.id
		return this.id;
	}
	
	public static void main(String[] args) {
		Demo2 p = new Demo2();
		p.getId();
	}
}
