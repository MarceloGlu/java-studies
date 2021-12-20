package g.random;

public class Demo4 {

	public static void main(String[] args) {
		

		int m = (int) (Math.random()*11);
		System.out.println(m);
		
		if(m > 5) {
			System.out.println("BIG");
			} else {
				System.out.println("small");
			}
	}
	

}
//Refactor: alt shift R : refactor, para renombrar todas las instancias de una variable.