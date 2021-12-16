
public class Test1 {

	public static void main(String[] args) {
		
		double num = (Math.random() * 250);
		System.out.println(num + " minutes");
		
		int minutes = (num % 60);
		int hours = (num /60);
		
		System.out.println("hours: " + hours + "minutes: " + minutes);
		
		

	}

}
