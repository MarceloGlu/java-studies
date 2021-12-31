package c.constructors;

public class Shirt {  
	
	private String color;						// esta es un atributo de la clase
	private char size;							// esta es un atributo de la clase
	
	public static void putOn() {				// este es un metodo de la clase
		System.out.println("Shirt is on!");
	}
	
	public static void takeOff() {				// este es un metodo de la clase
		System.out.println("Shirt is off!");
	}

	public Shirt(String color, char size) {		// este es un constructor using fields
		super();								// fue generado automaticamente
		this.color = color;
		this.size = size;
	}

	public Shirt() {							// este es un constructor not using fields
		super();								// fue generado automaticamente
	}
	
	
	

}
