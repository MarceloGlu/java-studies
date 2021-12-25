package a.helloworld;

import java.util.Scanner;

public class IfGrades {

	public static void main(String[] args) {

		/*
		 * El problema: el director de una escuela primaria decide que en vez de notas
		 * dara evaluaciones verbales de la siguiente manera> menos de 55 - insuficiente
		 * de 55 a 64 - suficiente de 65 a 74 - casi bien de 75 a 84 - bien de 85 a 94 -
		 * muy bien más de 95 - excelente Recibe la nota de un alumno y muestra la
		 * evalucación verbal,
		 */

		Scanner sc = new Scanner(System.in); // Create a Scanner object
		System.out.println("¿Qué nota obtuviste?");

		int nota = sc.nextInt(); // Read user input
		System.out.print("Tu nota es "); // First part of output

		if (nota < 55) {
			System.out.println("insuficiente para aprobar, debes esforzarte más.");
		} else if (nota < 65) {
			System.out.println("suficiente para aprobar, pero tú puedes más.");
		} else if (nota < 75) {
			System.out.println("casi buena, con un pequeño esfuerzo será realmente buena.");
		} else if (nota < 85) {
			System.out.println("buena, ¡bravo! Ahora aspira a una nota muy buena.");
		} else if (nota < 95) {
			System.out.println("muy buena, ¡fantástico! Estás a un paso de lograr la excelencia.");
		} else if (nota >= 95) {
			System.out.println("excelente, ¡magnífico! ¡Sigue así!");
		}
		// close the scanner
		sc.close();

	}

}
