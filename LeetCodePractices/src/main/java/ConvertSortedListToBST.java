import com.extraClasses.ListNode;
import com.extraClasses.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class ConvertSortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        // Convert to easily traversable arraylist instead
        List<Integer> list = new ArrayList<>();
        ListNode current = head;
        while(current != null) {
            list.add(current.val);
            current = current.next;
        }
        return sortedArrayToBST(list);
    }

    public TreeNode sortedArrayToBST(List<Integer> nums) {
        // Dynamic programming starting from the middle
        // Create the first node: root

        int leftIndex = 0;
        int rightIndex = nums.size() - 1;
        return sortedArrayToBST(nums, leftIndex, rightIndex);
    }


    public TreeNode sortedArrayToBST(List<Integer> nums, int leftIndex, int rightIndex) {
        // base case here
        if (leftIndex > rightIndex) {
            return null;
        }

        int middle = (rightIndex + leftIndex) / 2;
        TreeNode root = new TreeNode(nums.get(middle));
        root.right = sortedArrayToBST(nums, middle + 1, rightIndex);
        root.left = sortedArrayToBST(nums, leftIndex, middle - 1);

        return root;
    }
}
