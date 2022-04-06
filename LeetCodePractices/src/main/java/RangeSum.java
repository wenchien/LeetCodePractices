import com.extraClasses.TreeNode;

public class RangeSum {
    // Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].
    public int rangeSumBST(TreeNode root, int low, int high) {
        return rangeSumBST(root, low, high, 0);
    }

    // helper
    public int rangeSumBST(TreeNode root, int low, int high, int cumulative) {
        if (root == null) {
            return cumulative;
        }

        if (root.val >= low && root.val <= high) {
            cumulative += root.val;
        }
        cumulative = rangeSumBST(root.left, low, high, cumulative);
        cumulative = rangeSumBST(root.right, low, high, cumulative);

        return cumulative;
    }
}
