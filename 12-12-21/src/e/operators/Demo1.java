package e.operators;

public class Demo1 {

	public static void main(String[] args) {
		
		// ?:		
		int x = 5;
		int y = 9;
		int sum = x + y; //binary operator +
		int max = x > y ? x : y; //ternary operator
		
		//++
		x = x + 1;
		x +=1;
		x++;
		
		System.out.println(x++);
		System.out.println(++x);
		
		// si el ++ esta detras de la variable en la orden print,
		//primero hace la asignacion para imprimir y despues la operacion de la suma;
		// si esta antes primero hace la suma y despues la asignacion
		


	}

}
