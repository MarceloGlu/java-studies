package c;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person ();
		try {
		p.setAge(25);
		}catch(PersonAgeException e) {
			System.out.println(e.getMessage());
		}
	}

}
