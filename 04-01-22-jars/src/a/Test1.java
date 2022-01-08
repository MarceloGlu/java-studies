package a;

import converters.currency.CurrencyConverter;
import converters.temperature.TemperatureConverter;

public class Test1 {

	public static void main(String[] args) {

System.out.println("start test");

double nis = 100;
double dollar = CurrencyConverter.convertNISToDollar(nis);
System.out.println(dollar);
System.out.println(nis + " nis are " + dollar + "$");

double celsius = 10;
double farenheit = TemperatureConverter.convertCelsiusToFarenheit(celsius);
System.out.println(celsius + " celsius is " + farenheit + " farenheit");

// to p[rint in a formatted style
System.out.format("%.2f", dollar);
	}

}
