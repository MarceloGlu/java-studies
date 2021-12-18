package e;

public class ForLoop {

	public static void main(String[] args) {
		
		for (int i = 1; i<=10; i++) {
			System.out.print(i+" ");						
		}
		System.out.println();
		
		for (int i = 100; i>=50; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for (int i = 100; i<=200; i=i+2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for (int i = 0; i<=100; i=i+7) {
			System.out.print(i+" ");			
		}
		System.out.println();
		
		for (char c = 'A'; c<='Z'; c++) {
			System.out.print(c+" ");
		}
		System.out.println();
		
		for (int i = 0, j = 10; i<=10; i++, j--) {
			System.out.println(i+" - " + j);			
		}
		System.out.println();
		
	}

}
