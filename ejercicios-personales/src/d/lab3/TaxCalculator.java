package d.lab3;

import java.math.*;

public class TaxCalculator {

	public static void main(String[] args) {

		int sal = (int) (Math.random() * 1000000);
		int temp = 0;
		int tax = 0;
		int taxedsal = 0;

		if (sal < 23000) {
			tax = (int) (sal * 0.1);
			taxedsal = sal - tax;
		} else if (sal < 50000) {
			temp = sal - 23000;
			tax = (int) (temp * 0.2 + 2300);
			taxedsal = sal - tax;
		} else if (sal < 100000) {
			temp = sal - 50000;
			tax = (int) (temp * 0.3 + 7700);
			taxedsal = sal - tax;
		} else if (sal >= 100000) {
			temp = sal - 100000;
			tax = (int) (temp * 0.4 + 22700);
			taxedsal = sal - tax;

		}
		System.out.println("Salary before tax: " + sal);
		System.out.println("Tax:               " + tax);
		System.out.println("Salary after tax:  " + taxedsal);

	}

}
