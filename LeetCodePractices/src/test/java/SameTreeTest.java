import com.extraClasses.TreeNode;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameTreeTest {
    private SameTree sameTree = new SameTree();

    @Ignore
    @Test
    public void testMaxInteger() {
        int num1 = Integer.MAX_VALUE;
        int num2 = Integer.MAX_VALUE;

        assertTrue(num1 == num2);
    }

    @Test
    public void testCase2() {
        TreeNode node1 = new TreeNode();
        node1.val = 1;
        node1.left = new TreeNode();

        node1.left.val = 1;


        TreeNode node2 = new TreeNode();
        node2.val = 1;
        node2.right = new TreeNode();

        node2.right.val = 1;

        assertFalse(sameTree.isSameTree(node1, node2));
    }

    @Test
    public void testCase1() {
        TreeNode node1 = new TreeNode();
        node1.val = 1;
        node1.left = new TreeNode();
        node1.right = new TreeNode();

        node1.left.val = 2;
        node1.right.val = 3;

        TreeNode node2 = new TreeNode();
        node2.val = 1;
        node2.left = new TreeNode();
        node2.right = new TreeNode();

        node2.left.val = 2;
        node2.right.val = 3;

        assertTrue(sameTree.isSameTree(node1, node2));
    }

}