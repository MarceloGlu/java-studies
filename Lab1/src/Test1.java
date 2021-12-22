
public class Test1 {

	public static void main(String[] args) {
		
		
		double num = (Math.random() * 250);
		System.out.println(num + " minutes");
		
		double minutes = (num % 60);
		double hours = (num /60);
		
		System.out.println("hours: " + hours + "minutes: " + minutes);
		
		

	}

}
