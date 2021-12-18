package d;

public class Casting {
	
	public static void main(String[] args) {
		
		//casting is converting from one type to another
		//but it can only convert from a smaller to a greater type
		
		byte a = 5;
		int b = a; // implicit casting from byte to int
		
		
		int x = 129; // excede por uno la capacidad de byte
		byte y = (byte)x; //explicit casting from int to byte
		
		float f1 = 5.3F;
		long num = (long)f1; //explicit casting from float to long;
		
		
		//casting operator is a parenthesis
		// (type)value
		// Cuando paso el limite del numero mas pequeno, el numero se convierteen el menor posible
		
	}
	

}
