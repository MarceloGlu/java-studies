package c.loopsandarrays;

public class ArrayExample {

	public static void main(String[] args) {
		// this program randoms an array of numbers from 0 to 100
		// and prints the avg and highest value

		int nums[] = new int[100];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 101);
		}

		int totalSum = 0;
		int highest = 0;
		// print the array solo para verlo
		System.out.println("These are the randomed numbers:");
		for (int i = 0; i < nums.length; i++) {

			System.out.print(nums[i] + " ");
			totalSum += nums[i];
			if (nums[i] > highest) {
				highest = nums[i];
			}

		}
		System.out.println("");
		int avg = totalSum / nums.length;

		System.out.println("The highest number was: " + highest);
		System.out.println("The average was: " + avg);
	}

}
