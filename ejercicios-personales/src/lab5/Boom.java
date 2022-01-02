package lab5;

public class Boom {
	
	public static void main(String[] args) {
		
		
	   lbl: for (int i = 0; i <100; i++) {
			if (i % 7 == 0) {
				System.out.println("BOOM");
				continue;
				}
			
			int copy = i;
			while (copy != 0 ) {
				if (copy %10 ==7){
					System.out.println("BOOM");
					continue lbl;
				}
				copy /=10;	// en el caso que la cifra anterior no fue 7, sigue
							// chequeando las cifras siguientes hasta que llega
							// a 0 y se acaba el while loop
				
			}
			System.out.println(i);
			
			// Prestar atención a continuación cómo trabaja con continue y label.
			// El caso a resolver es que si hay un numero en el que todas
			// o muchas de sus cifras son 7, no quiero imprimir BOOM por cada cifra
			// sino solo una vez por el número. El "continue" abajo tiene un label
			// que lo lleva al "for" arriba para chequear el próximo número en la
			// lista de números. Si no tuviera el label saltaría una instancia y volvería
			// al while. Si tengo el número 777, por ejemplo, no sirve. Por tanto vuelve
			// al for y sigue con el número siguiente.
			
			
			
			
		}
	}
}


