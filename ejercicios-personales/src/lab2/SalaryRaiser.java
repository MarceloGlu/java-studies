package lab2;

public class SalaryRaiser {

	public static void main(String[] args) {
		
		int salary = (int)(Math.random()*1000) + 5000;
		System.out.println("The old salary is " + salary + " U$D");
		
		if ((salary * 1.1) <= 6000) {
			salary = (int)(salary *1.1);
			System.out.println("The new salary is " + salary + " U$D");
	}	else  {
		salary = (int)(salary * 1.05);
			System.out.println("The new salary is " + salary + " U$D");
	}	
}
}

