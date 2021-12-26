package a.collections;

import java.util.Scanner;

public class CalculatorUI {

	private Calculator calculator = new Calculator();
	private Scanner sc = new Scanner(System.in);

	public void showMenu() {
		System.out.println("\n==== menu");
		System.out.println("add...............");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}

	public void start() {
		while (true) {
			showMenu();
			String command = sc.nextLine();
			switch (command) {
			case "+":
				doAdd();
				break;
			case "-":
				doSub();
				break;
			}
		}
	}

	private void doSub() {
		System.out.print("enter value to subtract: ");
		double val = Double.parseDouble(sc.nextLine());
		calculator.sub(val);
		System.out.println("subtracted: " + val);

	}

	private void doAdd() {
		System.out.print("enter value to add: ");
		double val = Double.parseDouble(sc.nextLine());
		calculator.add(val);
		System.out.println("added: " + val);
	}
}