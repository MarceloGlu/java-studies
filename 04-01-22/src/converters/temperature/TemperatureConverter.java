package converters.temperature;

public class TemperatureConverter {

	public static double convertCelsiusToFarenheit(double celsius) {
		double farenheit = celsius * 1.8 + 32;
		return farenheit;
	}

	public static double convertFarenheitToCelsius(double farenheit) {
		double celsius = (farenheit - 32) * .5556;
		return celsius;
	}

}
