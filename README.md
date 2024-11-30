# LeetCode Algorithm Challenges

This repository contains solutions to various algorithmic challenges from LeetCode, implemented in Java. It serves as a resource for learning, practicing, and mastering data structures and algorithms through practical coding exercises. The project is broken down into different packages with each containing a Java file named after the corresponding LeetCode problem.

Challenge 1: [Average Salary Excluding the Minimum and Maximum Salary](https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/)

For this problem we were tasked to find the average salary from an array of unique salaries excluding the minimum and maximum salaries. We approached this problem by first initializing a sum variable of type double to store the sum of all salaries. Then we initialized a min and max int variable to store our minimum and maximum variable and initialized it to 10^7 for min and 999 for max. We set these variables to these numbers because these were numbers that were outside of our constraints which allows us to guarantee that min and max would be updated on first iteration. Then we loop though the entire array and check if the salary at index i is either greater than max and/or less than min, if so update max and min values. Then add salary at index i to sum. When were finish traversing through the entire array, we return the sum - (max and min) divided by the salary length - 2 (i.e  return (sum-max-min)/(salary.length - 2)). This would return the average salary excluding the minimum and maximum salary. For this algorithm it would be O(n) time complexity because we’re traversing through the entire array of n size. 

Challenge 2: [Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/description/)

Challenge 3: [Missing Number](https://leetcode.com/problems/missing-number/description/)

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
