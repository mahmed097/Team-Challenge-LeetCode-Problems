package challenge5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeLists {

	public static List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
		// Declare and instantiate a variable to store the merged list
		List<Integer> mergedList = new ArrayList<>();

		// Loop through the elements in the array provided that there's still at least
		// one element in each list for comparison to take place.
		while (!list1.isEmpty() && !list2.isEmpty()) {
			// Compare the first elements of each list(since they're already sorted). Remove
			// the smallest element and add to the mergedList variable
			if (list1.getFirst() <= list2.getFirst()) {
				mergedList.add(list1.removeFirst());
			} else {
				mergedList.add(list2.removeFirst());
			}
		}
		// The while loop above breaks when one or both lists has no element
		// Only one or none of the two while loops below would be executed

		// If there is/are still element(s) in list1, loop through the remainder and add
		// to the mergedList variable
		while (!list1.isEmpty()) {
			mergedList.add(list1.removeFirst());
		}

		// If there is/are still element(s) in list2, loop through the remainder and add
		// to the mergedList variable
		while (!list2.isEmpty()) {
			mergedList.add(list2.removeFirst());
		}

		// Return the merged list
		return mergedList;
	}

	public static void main(String[] args) {

		// Convert an a array of integers to an ArrayList
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 4));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 3, 4));

		// Merge the sorted lists in a sorted order
		System.out.println("Merged List: " + mergeTwoLists(list1, list2));
	}
}
