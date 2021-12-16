package d;

import java.util.Scanner;

public class ExerciseSwitch2 {
		

	public static void main(String[] args) {
		// input from user
		
		Scanner sc = new Scanner(System.in); //input from keyboard
		System.out.println("enter day: ");
		String day = sc.nextLine();
		sc.close(); //close the scanner
		
		
		
		String Sunday = "leave at 16:30";
		String Monday = "leave at 16:30";
		String Tuesday = "leave at 12:30";
		String Wednesday = "leave at 16:30";
		String Thursday = "leave at 16:30";
		String Friday = "weekend";
		String Saturday = "weekend";
		
		switch(day) 		{
		case "Sunday":			
		case "Monday":
		case "Wednesday":
		case "Thursday":
			System.out.println("leave at 16:30");
		case "Tuesday":
			System.out.println("leave at 12:30");	
		case "Friday":
		case "Saturday":
			System.out.println("weekend");

		
		}
		

	}

}
