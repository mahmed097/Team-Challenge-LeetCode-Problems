package challenge3;

class MissingNumber {

	public int missingNumber(int[] nums) {

		int numsMiss = 0; // will hold sum of nums[i]

		int numsFull = 0; // will hold sum of nums[i] with an extra index.
							// Once both are filled and subtracted, the missing number will be left

		for (int i = 0; i < nums.length + 1; i++) {
			// added 1 since there's a missing number. When we subtract from the original
			// array, missing # is found

			numsFull += i;
			// populating it with i
		}

		for (int j = 0; j < nums.length; j++) {

			numsMiss += nums[j];
			// summing up nums and storing in numsMiss

		}

		int missingNumber = numsFull - numsMiss;
		// subtracting the 2 will leave us with the missing number

		return missingNumber;
	}

	public static void main(String[] args) {
		// Test cases for 3 different arrays

		MissingNumber numb = new MissingNumber();
		int[] test1 = new int[] { 3, 0, 1 }; // test case 1 in leetcode
		int[] test2 = new int[] { 0, 1 }; // test case 2 in leetcode
		int[] test3 = new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 }; // test case 3 in leetcode

		System.out.println("The missing number is: " + numb.missingNumber(test1));
		System.out.println("The missing number is: " + numb.missingNumber(test2));
		System.out.println("The missing number is: " + numb.missingNumber(test3));

	}

}