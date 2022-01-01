package d.lab2;

public class RanNum {

	public static void main(String[] args) {
		
		
		int n = (int)(Math.random()*100);
		System.out.println("The randomed number was... " + n + "!");
		if (n > 50) {
			System.out.println("Big!");
	}	else if (n < 50) {
			System.out.println("Small!");
	}	else System.out.println("Bingo!");
		
		

}
}
