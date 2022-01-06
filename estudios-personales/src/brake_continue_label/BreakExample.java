package brake_continue_label;

public class BreakExample {
	
	
		
	

	// The BREAK STATEMENT terminates the loop or switch statement and transfers
	// execution to the statement immediately following the loop or switch.
	// En este caso imprime solo hasta el 7 y salta al proximo statement.

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i == 8) {
				break;
			}
			System.out.println("......." + i);
	
		}

	}

}
