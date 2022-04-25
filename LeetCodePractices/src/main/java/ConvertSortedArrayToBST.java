import com.extraClasses.TreeNode;

import java.util.Arrays;
import java.util.List;

public class ConvertSortedArrayToBST {
    //    Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
//
//    A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
    public TreeNode sortedArrayToBST(int[] nums) {
        // Dynamic programming starting from the middle
        // Create the first node: root

        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        return sortedArrayToBST(nums, leftIndex, rightIndex);
    }


    public TreeNode sortedArrayToBST(int[] nums, int leftIndex, int rightIndex) {
        // base case here
        if (leftIndex > rightIndex) {
            return null;
        }

        int middle = (rightIndex + leftIndex) / 2;
        TreeNode root = new TreeNode(nums[middle]);
        root.right = sortedArrayToBST(nums, middle + 1, rightIndex);
        root.left = sortedArrayToBST(nums, leftIndex, middle - 1);

        return root;
    }
}
