package constructors;

public class Shirt { 
	
	public static String color;						// esta es un atributo de la clase
	public static char size;							// esta es un atributo de la clase
	
	public static void putOn() {				// este es un metodo de la clase
		System.out.println("Shirt is on!");
	}
	
	public static void takeOff() {				// este es un metodo de la clase
		System.out.println("Shirt is off!");
	}
	
	// Shirt() {}								// este constructor esta vacio, como 
												// el default sin fields
	Shirt(String newColor, char newSize) {
		color = newColor;
		size = newSize;
		
	}

	//public Shirt(String color, char size) {	// este es un constructor using fields
	//	super();								// generado automaticamente
	//	this.color = color;
	//	this.size = size;
	//}

	//public Shirt() {							// este es un constructor not using fields
	//	super();								// generado automaticamente
	//}
	
	
	public static void setColor(String newColor) {
		color = newColor;			
	}
	public static void setSize(char newSize) {
		size = newSize;
	}
	
	

}
