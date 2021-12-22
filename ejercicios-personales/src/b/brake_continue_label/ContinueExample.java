package b.brake_continue_label;

public class ContinueExample {
	
	// The CONTINUE STATEMENT causes the loop to skip the remainder of its body
	// and immediately retest its condition prior to reiterating.
	// En este caso la tarea es que cuente hasta 9 ( i < 10) pero saltando el 8. 

	public static void main(String[] args) {
		
		
			      for(int i=0; i<10; i++){
			         if (i==8){
			            continue;
			         }
			         System.out.println("......."+i);
			      }
	}

}
