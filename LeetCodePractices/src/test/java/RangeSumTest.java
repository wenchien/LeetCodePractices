import com.extraClasses.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeSumTest {

    private RangeSum rangeSum = new RangeSum();

    @Test
    public void testCase1() {
        // [10,5,15,3,7,null,18]
        // low = 7, high = 15
        TreeNode root = new TreeNode();
        root.val = 10;
        root.left = new TreeNode();
        root.right = new TreeNode();

        root.left.val = 5;
        root.right.val = 15;

        root.left.left = new TreeNode();
        root.left.right = new TreeNode();
        root.right.left = null;
        root.right.right = new TreeNode();

        root.left.left.val = 3;
        root.left.right.val = 7;
        root.right.right.val = 18;

        System.out.println("Cumulative sum: " + rangeSum.rangeSumBST(root, 7, 15));

    }

}