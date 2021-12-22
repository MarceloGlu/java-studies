package b.brake_continue_label;

public class BreakExample {
	
	// The BREAK STATEMENT terminates the loop or switch statement and transfers execution
	// to the statement immediately following the loop or switch.
	// En este caso la tarea es imprimir de 0 a 9 pero salteando el 8.
		 

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++){
	         if (i==8){
	            break;
	         }
	         System.out.println("......."+i);
	      }		

	}

}
