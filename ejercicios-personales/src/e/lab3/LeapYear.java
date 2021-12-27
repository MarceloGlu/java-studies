package e.lab3;

public class LeapYear {
	
	public static void main(String[] args) {
		
		int randomyear = (int)(Math.random() * 2021);
		System.out.println("The year is " + randomyear);
		if (randomyear % 4 == 0 && (randomyear % 100 != 0 || randomyear % 400 == 0)) {
			System.out.println("It is a leap year.");
			}
			else {
				System.out.println("It is not a leap year.");
				
		}
	}
}

