package d;

import java.util.Scanner;

public class SwitchDemo2 {
	
	public static void main(String[] args) {
			String day = "Tuesday";
			System.out.println(day);
		

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



