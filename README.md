# LeetCode Algorithm Challenges

This repository contains solutions to various algorithmic challenges from LeetCode, implemented in Java. It serves as a resource for learning, practicing, and mastering data structures and algorithms through practical coding exercises. The project is broken down into different packages with each containing a Java file named after the corresponding LeetCode problem.

Challenge 1: [Average Salary Excluding the Minimum and Maximum Salary](https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/)

For this problem we were tasked to find the average salary from an array of unique salaries excluding the minimum and maximum salaries. We approached this problem by first initializing a sum variable of type double to store the sum of all salaries. Then we initialized a min and max int variable to store our minimum and maximum variable and initialized it to 10^7 for min and 999 for max. We set these variables to these numbers because these were numbers that were outside of our constraints which allows us to guarantee that min and max would be updated on first iteration. Then we loop though the entire array and check if the salary at index i is either greater than max and/or less than min, if so update max and min values. Then add salary at index i to sum. When were finish traversing through the entire array, we return the sum - (max and min) divided by the salary length - 2 (i.e  return (sum-max-min)/(salary.length - 2)). This would return the average salary excluding the minimum and maximum salary. For this algorithm it would be O(n) time complexity because we’re traversing through the entire array of n size. 

Challenge 2: [Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/description/)

In this challenge, an array of type int was that was sorted in non-decreasing order was provided. The challenge was to return the array after squaring each element and sorting it in non-decreasing(ascending) order. The first step in solving this problem was to initialize an int variable that will be used later for the sorting part of this problem. Then, by creating a for loop that starts at 0 and ends at the length of the array, each index was set to the product of itself and itself (thus squaring each number in the array). In order to sort the array, a nested loop was used. the first for loop was used to iterate over the loop itself. The second for loop included the same logic, however in this loop, an if statement (that stated that if the element on the left is greater than the element on the right, store it in the temp variable, move the bigger element to the right and the smaller one to the left) was added. Once this was done, all that was left to do was return the squared and sorted array.

Challenge 3: [Missing Number](https://leetcode.com/problems/missing-number/description/)

In this challenge, we were given an array of type int that was in the range of [0,n], with n representing the number of elements in the array. Using this information, we were tasked to find the missing number in the array. For example, if the arraay was [3,0,1], the range is from 0-3 since there are 3 elements, meaning the missing number is 2 since 2 is in the range of 0-3 but it isnt in the given array. To begin, 2 int values were initialized. One will be filled with the sum of the filled array and the other will be filled with the sum of the given array. Using a for loop (that goes from 0 to the length of the array + 1 since there's a missing number), the numsFull variable gets each i element added to it. The same is done for numsMiss (but the loop stops at the length of the array and the contents of the given array are added to numsMiss). Now that both have been populated, the difference between the 2 (which would result in the missing number) is stored in the int missingNumber, which is then returned.

Challenge 4: [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/description/)

For this problem we were given two non-empty linked lists representing two numbers in reversed order and we were tasked to return the sum of both numbers as a linked list. For addition, we add the last digit first instead of first digit and because the head of our given linked list is the last digit, all we have to do is start at the head of each node, add them together and store it in a solution linked list to return. We did this by first initializing a solution linked list to store our solution and a placeholder ListNode that is used for traversal. Then we initialize our carry over value and our sum value and set it to 0. Then while either of our linked lists are not empty (the two lists we’re adding), we first add the carry over value to sum. Afterwards we check if l1 is not null then add l1’s value to sum and move to the next l1 node. If l2 is not null then add l2’s value to sum and move to the next l2 node. Then we need to find the carry over value and the sum value that were adding to the solution list by dividing sum by 10 to get the carryover value and remainder 10 of sum for the value will be adding to our solution list (i.e carry = sum / 10; sum = sum % 10;). Then we add the sum to the solution linked list and move to the next node. Finally at the end of the loop we reset the sum value back to 0. After the while loop, if there’s a carry over value, we add that carry over value to the end of our solution linked list. Finally we return the solution linked list. The time complexity of this algorithm is O(n) where n signifies the size of the largest linked list of either l1 or l2. 

Challenge 5: [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/description/)

This algorithm takes two Array lists, list1 and list2, where the elements in each list are sorted in non-decreasing order, the task is to merge them into a single Array list such that the merged list remains sorted. The algorithm achieves this by comparing elements from both lists iteratively.

Constraints:

- The number of elements in both lists is in the range [0, 50].
- -100 <= element <= 100
- Both list1 and list2 are sorted in non-decreasing order.

Examples:

- Input: list1 = [1,2,4], list2 = [1,3,4] Output: [1,1,2,3,4,4]
- Input: list1 = [], list2 = [] Output: []
- Input: list1 = [], list2 = [0] Output: [0]

## Pseudocode

[Challenges Pseudocodes](https://docs.google.com/document/d/1Xv0JEAQ_iV23AVGZ-_7Qs5zuD6jVJuTI5lfFbbY_c1I/edit?tab=t.0)

## Authors

- [@Umukulthum Arowolo](https://www.github.com/Umukulthum)
- [@Mohamed Abdi](https://www.github.com/MohamedAbdi6743)
- [@(Mohammed) Maxed Ahmed](https://www.github.com/mahmed097)

## Run Locally

Clone the project

```bash
  git clone https://github.com/mahmed097/Team-Challenge-LeetCode-Problems.git
```
