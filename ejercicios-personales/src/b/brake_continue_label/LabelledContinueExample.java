package b.brake_continue_label;

public class LabelledContinueExample {
	
	// The labelled continue statement skips the current iteration of the outer most loop
	// whereas the normal continue skips the current iteration of the innermost loop.


	
	public static void main(String args[]){
	      Task:
	      for(int i=0; i<10; i++){
	          if (i==8){
	             continue Task;
	          }
	          System.out.println("......."+i );
	       }  
	   }  

}
