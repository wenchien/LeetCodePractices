import com.extraClasses.TreeNode;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeepestLeavesSumTest {

    DeepestLeavesSum deepSum = new DeepestLeavesSum();

    @Test
    public void testCase1() {
        TreeNode node1 = new TreeNode();
        node1.val = 1;
        node1.left = new TreeNode();
        node1.right = new TreeNode();

        node1.left.val = 2;
        node1.right.val = 3;

        node1.left.right = new TreeNode();
        node1.left.right.val = 4;

        System.out.println("Deepest Sum: " + deepSum.deepestLeavesSum(node1));

    }

    @Test
    public void testMethod() {
        TreeNode node1 = new TreeNode();
        node1.val = 1;
        node1.left = new TreeNode();
        node1.right = new TreeNode();

        node1.left.val = 2;
        node1.right.val = 3;

        node1.left.right = new TreeNode();
        node1.left.right.val = 4;

        System.out.println("Deepest Sum: " + deepSum.findMaxDepth(node1, 0));
    }

}