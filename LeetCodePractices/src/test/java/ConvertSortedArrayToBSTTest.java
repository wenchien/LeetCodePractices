import com.extraClasses.TreeNode;
import org.junit.Test;

import java.util.Arrays;

public class ConvertSortedArrayToBSTTest {

    private ConvertSortedArrayToBST csatb = new ConvertSortedArrayToBST();

    @Test
    public void test() {
        int[] nums = {-10,-3,0,5,9};
        int leftindex = 0;
        int rightIndex = nums.length - 1;
        int middle = (rightIndex - leftindex) / 2;
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, leftindex, middle + 1)));
        middle--;
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, leftindex, middle)));

    }

    @Test
    public void testCase1() {
        int[] nums = {-10,-3,0,5,9};
        TreeNode root = csatb.sortedArrayToBST(nums);
        traverse(root);
    }

    private void traverse(TreeNode root){
        if (root == null) {
            return;
        }

        traverse(root.left);
        System.out.println(root.val);
        traverse(root.right);
    }

}