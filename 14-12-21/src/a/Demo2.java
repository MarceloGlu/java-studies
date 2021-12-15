package a;

public class Demo2 {

	public static void main(String[] args) {
		
		//int array of length 100
		int[] grades = new int[100];
				
		// populate array with random data  between 60 and 100 and print				
		for (int i = 0; i < grades.length; i++) {
			grades[i] = (int) (Math.random() * 41) + 60;
			System.out.println(grades[i]);
			
		//En este ejercicio se crea un array de 60 a 100. El array tiene 40 numeros
		//que se generan en forma randomal. Como comienza de 0 se le agrega 1 mas = 41,
		//y para llegar a 100 se le suman 60.
			
			}
		
		}
	}


