package loopsandarrays;

public class RandomCount {

	public static void main(String[] args) {

		// this program generates 100 random values between 0 and 9
		// and then prints how many of them are equals to number 5

		int fiveCounter = 0;
		for (int i = 0; i < 100; i++) {
			int random = (int) (Math.random() * 10);
			if (random == 5) {
				fiveCounter++;
			}

		}
		System.out.println("the number of 5 in the array was " + fiveCounter);
	}

}
