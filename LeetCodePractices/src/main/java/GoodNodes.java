import com.extraClasses.TreeNode;

import java.util.Stack;

public class GoodNodes {
//    Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.
//    Return the number of good nodes in the binary tree.
    public int goodNodes(TreeNode root) {
        return goodNodes(root, Integer.MIN_VALUE, 0);
    }

    public int goodNodes(TreeNode root, int pathMax, int numOfGoodNodes) {
        if (root == null) {
            return numOfGoodNodes;
        }

        if (root.val >= pathMax) {
            ++numOfGoodNodes;
        }

            // When you need to constantly update maxSum / cumulativeMax (val, val + cumulativeMax)...etc do Math.max
        numOfGoodNodes = goodNodes(root.left, Math.max(root.val, pathMax), numOfGoodNodes);
        numOfGoodNodes = goodNodes(root.right, Math.max(root.val, pathMax), numOfGoodNodes);

        return numOfGoodNodes;
    }

}

