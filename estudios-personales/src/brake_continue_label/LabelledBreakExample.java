package brake_continue_label;

public class LabelledBreakExample {
	
	// The labeled break statement terminates the outer most loop
	// whereas the normal break statement terminates the innermost loop.
	// El label en este ejemplo es "Task", los ":" son parte de la sintaxis.
	
	 public static void main(String args[]){
	      Task:
	      for(int i=0; i<10; i++){
	         if (i==8){
	            break Task;
	          }
	          System.out.println("......."+i );
	      }
	   }

}
