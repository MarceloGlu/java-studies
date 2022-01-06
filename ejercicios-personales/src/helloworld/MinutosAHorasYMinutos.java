package helloworld;

import java.util.Scanner;

public class MinutosAHorasYMinutos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Create a Scanner object
		System.out.println("¿Cuál es la duración de la película en minutos?");
		int todominutos = sc.nextInt(); // Read user input

		System.out.print("Entonces la película dura"); // First part of output

		int horas = todominutos / 60;
		int minutos = todominutos % 60;

		if (horas == 1) {
			System.out.print(" 1 hora");
		} else
			System.out.print(" " + horas + " horas");

		if (minutos == 1) {
			System.out.print(" y 1 minuto");
		} else
			System.out.print(" y " + minutos + " minutos");

		System.out.println(".");
		// close the scanner
		sc.close();

	}

}
