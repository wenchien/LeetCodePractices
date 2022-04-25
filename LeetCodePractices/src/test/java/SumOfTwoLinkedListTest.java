import com.extraClasses.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoLinkedListTest {

    private SumOfTwoLinkedList listNode = new SumOfTwoLinkedList();

    @Test
    public void testCase5() {
        int[] nums1 = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
        int[] nums2 = {5,6,4};

        // [0,0,0,0,0,0,0,0,0,0,1]
        ListNode result = listNode.betterAddTwoSum(createTestListNodes(nums1), createTestListNodes(nums2));
        printLinkedNodes(result);
    }

    @Test
    public void testCase4() {
        int[] nums1 = {9};
        int[] nums2 = {1,9,9,9,9,9,9,9,9,9};

        // [0,0,0,0,0,0,0,0,0,0,1]
        ListNode result = listNode.addTwoNumbers(createTestListNodes(nums1), createTestListNodes(nums2));
        printLinkedNodes(result);
        // listNode.parseListNodeAsInteger(createListNodes(nums1));
    }

    @Test
    public void testCase3() {
        int[] nums1 = {9,9,9,9,9,9,9};
        int[] nums2 = {9,9,9,9};

        // 8,9,9,9,0,0,0,1
        ListNode result = listNode.addTwoNumbers(createTestListNodes(nums1), createTestListNodes(nums2));
        printLinkedNodes(result);
        // listNode.parseListNodeAsInteger(createListNodes(nums1));
    }

    @Test
    public void testCase2() {
        int[] nums1 = {0};
        int[] nums2 = {0};

        ListNode result = listNode.addTwoNumbers(createTestListNodes(nums1), createTestListNodes(nums2));
        printLinkedNodes(result);
        // listNode.parseListNodeAsInteger(createListNodes(nums1));
    }

    @Test
    public void testCase1() {
        int[] nums1 = {2,4,3};
        int[] nums2 = {5,6,4};

        ListNode result = listNode.addTwoNumbers(createTestListNodes(nums1), createTestListNodes(nums2));
        printLinkedNodes(result);
        // listNode.parseListNodeAsInteger(createListNodes(nums1));
    }


    // Utilities..........
    private ListNode createTestListNodes(int[] nums) {
        ListNode root = new ListNode();
        ListNode current = root;
        root.val = nums[0];
        int index = 0;
        for(int num : nums) {
            if (index == 0) {
                ++index;
                continue;
            } else {
                ListNode temp = new ListNode();
                current.next = temp;
                temp.val = num;
                current = temp;
            }
            ++index;
        }

        return root;
    }

    private void printLinkedNodes(ListNode listNode) {
        System.out.println("----------result-----------");
        System.out.println(listNode);
    }

}