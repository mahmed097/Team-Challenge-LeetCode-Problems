package challenge2;

class SortingSquares {

	public int[] sortedSquares(int[] nums) {

		int temp = 0; // initializing variable that will be used for swaapping in the nested for loop
		for (int i = 0; i < nums.length; i++) { // iterating over entire array to square each element

			nums[i] = nums[i] * nums[i]; // squaring each element

		}

		for (int j = 0; j < nums.length - 1; j++) { // this is used to iterate over the whole array,
													// making sure each number is sorted properly

			for (int k = 0; k < nums.length - 1; k++) { // iterating over array for sorting

				if (nums[k] > nums[k + 1]) { // if the element before is bigger than the one after it:

					temp = nums[k]; // store the bigger one in temp
					nums[k] = nums[k + 1]; // swap them (moving the bigger value to the right and vice versa)
					nums[k + 1] = temp; // the temp value that was at k position is now nums[k+1], completing the swap
										// successfully
				}
			}
		}

		return nums; // returning the array, now that it has been squared and sorted.
	}

	public static void main(String[] args) {
		// testing

		SortingSquares square = new SortingSquares();
		int[] test1 = new int[] { -4, -1, 0, 3, 10 }; // test case 1 in leetcode
		int[] test2 = new int[] { -7, -3, 2, 3, 11 }; // test case 2 in leetcode

		System.out.println("After squaring and sorting, the array becomes: "
				+ java.util.Arrays.toString(square.sortedSquares(test1))); // side note: not too sure why but when i run
																			// it without java.util.Arrays.toString,
																			// it returns a mix of numbers, letter and
																			// special characters.
		System.out.println("After squaring and sorting, the array becomes: "
				+ java.util.Arrays.toString(square.sortedSquares(test2)));

	}

}
