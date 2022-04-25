import com.extraClasses.ListNode;

import java.util.Arrays;
import java.util.Set;

public class SumOfTwoLinkedList {
    // 2. Add Two Numbers
    //    You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
    //
    //    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
    // Solution only works if number is < Long.MAX_VALUE
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultListNodes = null;

        if (l1 != null && l2 != null) {
            long l1AsInteger = parseListNodeAsInteger(l1);
            long l2AsInteger = parseListNodeAsInteger(l2);
            long result = l1AsInteger + l2AsInteger;
            System.out.println(l1AsInteger);
            System.out.println(l2AsInteger);
            System.out.println("result : " + result);
            long[] converted = convertIntArrayToInt(result);
            resultListNodes = createListNodes(converted);
        }

        return resultListNodes;
    }

    public ListNode betterAddTwoSum(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode current = root;
        ListNode currentL1 = l1;
        ListNode currentL2 = l2;
        int carryOver = 0;
        while(currentL1 != null || currentL2 != null) {

            int l1Value = currentL1 != null ? currentL1.val : 0;
            int l2Value = currentL2 != null ? currentL2.val : 0;
            int sum = l1Value + l2Value + carryOver;

            // Two single digit number's sum will always be < 20
            carryOver = sum / 10; // either 0 or 1, we carry over. since it's an int the result will always either 0 or 1 after data type conversion

            // Create new next node
            current.next = new ListNode(sum % 10); // using the remainder as current node's value, if any
            current = current.next;
            if (currentL1 != null) {
                currentL1 = currentL1.next;
            }
            if (currentL2 != null) {
                currentL2 = currentL2.next;
            }

        }
        if (carryOver > 0) {
            current.next = new ListNode(carryOver);
        }//last digit

        return root.next; // the real root is the one next to the root
    }

    private long parseListNodeAsInteger(ListNode listNode) {
        ListNode root = listNode;
        ListNode current = root;
        long base = 1;
        long result = 0;
        while (current != null) {
            // Parse as integer
            if (base == 1) {
                result += base * current.val;

            } else {

                result += base * current.val;
                System.out.println(base * current.val);
            }
            System.out.println("PLNAI: " + result);
            base = base * 10;
            current = current.next;
        }

        return result;
    }

    // needs to be reversed order
    private ListNode createListNodes(long[] nums) {
        ListNode root = new ListNode();
        ListNode current = root;
        for (int i = nums.length - 1; i >= 0; --i) {

            ListNode temp = new ListNode();
            current.val = (int)nums[i];
            if (i == 0) {
                break;
            }
            current.next = temp;
            current = temp;


        }

        return root;
    }

    private long[] convertIntArrayToInt(long num) {
        String temp = Long.toString(num);
        long[] result = new long[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            result[i] = temp.charAt(i) - '0';
        }
        return result;
    }

}
