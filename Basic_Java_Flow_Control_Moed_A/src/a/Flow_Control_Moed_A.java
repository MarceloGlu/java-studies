package a;

public class Flow_Control_Moed_A {

	public static void main(String[] args) {

		// Question 1

		int[] nums1 = new int[15];
		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = (int) (Math.random() * 10);
		}

		int[] nums2 = new int[15];
		for (int j = 0; j < nums2.length; j++) {
			nums2[j] = (int) (Math.random() * 10);
		}
			
		//---------------------------------------------------------------------

		// Question 2
		
		System.out.println("This is the array nums1:");
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i] + " ");
		}
		System.out.println();
		System.out.println("This is the array nums2:");
		for (int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] + " ");
		}
		System.out.println();
		
		//---------------------------------------------------------------------

		// Question 3 - Find maximum 3 consecutive digits number in array nums1

		// Initialize maximum 3 digits number in the array
		int max = -1;

		// Traverse array elements and compare every three consecutive digits number
		// with current max
		for (int i = 0; i < nums1.length-2; i++)
			if (nums1[i] * 100 + nums1[i+1] * 10 + nums1[i+2] > max) {
				max = nums1[i] * 100 + nums1[i + 1] * 10 + nums1[i + 2];
			}

		System.out.println("The biggest three consecutive digits number in nums1 is: " + max);
		
		//---------------------------------------------------------------------

		// Question 4 - distinct array
		
		//The array is created and initialized to -1		
		
		int [] distinct = new int[10];
		System.out.println("This is the array distinct initialized to -1:");
			for (int j = 0; j < distinct.length; j++) {	
				distinct[j] = -1;
				System.out.print(distinct[j] + " ");
			}
			
			
				
		}

	}


