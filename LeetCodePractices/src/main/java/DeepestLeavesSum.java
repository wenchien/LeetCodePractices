import com.extraClasses.TreeNode;

public class DeepestLeavesSum {
    public int deepestLeavesSum(TreeNode root) {
        return deepestLeavesSum(root, 0, findMaxDepth(root, 0), 0);
    }

    // if i update my cumulative and max in one function should be a lot faster

    public int findMaxDepth (TreeNode root, int depth) {
        if (root == null) {
            return depth;
        }
        ++depth;
        return Math.max(findMaxDepth(root.left, depth), findMaxDepth(root.right, depth));
    }

    public int deepestLeavesSum(TreeNode root, int depth, int maxDepth, int cumulative) {

        if (root == null) {
            return cumulative;
        }

        ++depth;
        System.out.println("Depth: " + depth);
        System.out.println("Cumulative : " + cumulative);
        System.out.println("Max Depth: " + maxDepth);

        if (depth == maxDepth) {
            cumulative += root.val;
        }
        System.out.println("Final Cumulative : " + cumulative);

        cumulative = deepestLeavesSum(root.left, depth, maxDepth, cumulative);
        System.out.println("Left Cumulative : " + cumulative);
        cumulative = deepestLeavesSum(root.right, depth, maxDepth, cumulative);
        System.out.println("Right Cumulative : " + cumulative);
        return  cumulative;
    }

}
