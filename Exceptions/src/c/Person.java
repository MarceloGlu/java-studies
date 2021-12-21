package c;

public class Person {

	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public void setAge(int age) throws PersonAgeException //throws PersonAgeException	
	{
		if (age >= 0 && age <= 120) {
		this.age = age;
		} else {
			throw new PersonAgeException("set age failed " + age + " is illegal" );
		}
		
	} 
}

	