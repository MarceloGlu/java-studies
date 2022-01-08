package converters.currency;

public class CurrencyConverter {
	
	public static double convertDolarToNIS(double dollar) {
		double nis = dollar * 3.12;
		return nis;
	}
	public static double convertNISToDollar(double nis) {
		double dollar = nis / 3.12;
		return dollar;
	}

}
