package helloworld;

public class NumeroParSiguiente {

	public static void main(String[] args) {
		
// Dado un numero n, encontrar el numero par siguiente
		
		int n = 6;
		
		n = n + 1;
		n = n + n % 2;
		
		System.out.println(n);
		

	}

}
