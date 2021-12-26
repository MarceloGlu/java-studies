package e.lab3;

import java.math.*;

public class TaxCalculator {

	
	
	public static void main(String[] args) {
		
		int sal = (int)(Math.random()*1000000);		
		System.out.println("Salary before taxes: " + sal);
		
		if (sal < 23000) {
			sal = sal - sal/10;
		}
		else if (sal < 50000) {
			sal = sal - sal/20;
		}
		else if (sal < 100000) {
			sal = sal - sal/30;
		}
		else if (sal > 100000) {
			sal = sal - sal/40;
		}
		System.out.println("Salary after taxes: " + sal);
		

	}

}
