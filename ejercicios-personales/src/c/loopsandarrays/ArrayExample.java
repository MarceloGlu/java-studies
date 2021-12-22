package c.loopsandarrays;

public class ArrayExample {

	public static void main(String[] args) {
		// this program randoms an array of numbers from 0 to 100
		// and prints the avg and highest value

		int[] nums = new int[100]; // es un array de 100 numeros integer
		for (int i = 0; i < nums.length; i++) {
			// por cada index (numero ordinal del array) que pasamos desde 0 a 100,
			// aumentamos el index en 1;

			nums[i] = (int) (Math.random() * 101);
			// los numeros de nuestro array son determinados en forma randomal de 0 a 100;
			// se multiplica por 101 porque la cuenta comienza de 0, y si no lo
			// multiplicamos
			// los numeros corren de 0 a casi 1
		}

		int totalSum = 0;
		int highest = 0;
		// print the array solo para verlo
		// System.out.println("These are the randomed numbers:");
		for (int i = 0; i < nums.length; i++) {
			
			//System.out.print(nums[i] + " ");
			totalSum += nums[i];
			if (nums[i]>highest) {
				highest = nums[i];
			}
			

		}
		// System.out.println("");
		int avg = totalSum / nums.length;
		
		System.out.println("The highest number was: " + highest);
		System.out.println("The average was: " + avg);
	}

}
