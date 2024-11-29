package challenge4;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode list = new ListNode(); // Initialize solution linked list
        ListNode placeHolder = list; // Initialize place holder node used for traversal

        /* Set default values for carry and sum */
        int carry = 0;
        int sum = 0;

        while (l1 != null || l2 != null) { // While either list is not empty
            sum += carry; // Add carry to sum

            if (l1 != null) { // If l1 is not empty
                sum += l1.val; // Add l1 value to sum
                l1 = l1.next; // Move to next l1 node
            }

            if (l2 != null) { // If l2 is not empty
                sum += l2.val; // Add l2 value to sum
                l2 = l2.next; // Move to next l2 node
            }

            carry = sum / 10; // Set carry to be the first digit
            sum = sum % 10; // Set sum to be the second digit

            placeHolder.next = new ListNode(sum); // Add sum to solution list
            placeHolder = placeHolder.next; // Move to next node
            sum = 0; // Reset sum to 0
        }
        if (carry > 0) {
            placeHolder.next = new ListNode(carry); // Add the carry to the end of the list
        }
        return list.next; // Return the solution
    }
}
