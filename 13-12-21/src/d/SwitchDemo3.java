package d;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {

		// input from user

		Scanner sc = new Scanner(System.in); // input from keyboard
		System.out.println("enter day: ");
		String day = sc.nextLine();
		sc.close(); // close the scanner

		System.out.println("you entered: " + day); // print the user input

		String Sunday = "leave at 16:30";
		String Monday = "leave at 16:30";
		String Tuesday = "leave at 12:30";
		String Wednesday = "leave at 16:30";
		String Thursday = "leave at 16:30";
		String Friday = "weekend";
		String Saturday = "weekend";

		switch (day) {
		case "Sunday":
		case "Monday":
		case "Wednesday":
		case "Thursday":
			System.out.println("leave at 16:30");
			break;
		case "Tuesday":
			System.out.println("leave at 12:30");
			break;
		case "Friday":
		case "Saturday":
			System.out.println("weekend");
			break;
			
		default:
			System.out.println(day + " is not a day");	

		}
		
		System.out.println("==== END ====");

	}

}
