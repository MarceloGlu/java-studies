package d.lab1;

public class Test2 {

	public static void main(String[] args) {

		int minutes = (int) (Math.random() * 250) + 100;
		System.out.println("The time in minutes is: " + minutes);
		System.out.println("The time in hours and minutes is: " + (minutes / 60) + ":" + (minutes % 60));
	}

}
