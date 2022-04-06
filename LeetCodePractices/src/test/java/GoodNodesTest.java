import com.extraClasses.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodNodesTest {

    private GoodNodes gn = new GoodNodes();

    @Test
    public void testCase4() {
        TreeNode root = new TreeNode();
        root.val = 2;
        root.right = new TreeNode();
        root.right.val = 4;
        root.right.left = new TreeNode();
        root.right.right = new TreeNode();

        root.right.left.val = 10;
        root.right.right.val = 8;

        root.right.right.left = new TreeNode();
        root.right.right.left.val = 4;

        System.out.println(gn.goodNodes(root));

    }


    @Test
    public void testCase3() {
        TreeNode root = new TreeNode();
        root.val = 3;
        root.left = new TreeNode();
        root.right = new TreeNode();
        root.left.val = 1;
        root.right.val = 4;

        root.left.left = new TreeNode();
        root.left.left.val = 3;

        root.right.right = new TreeNode();
        root.right.left = new TreeNode();

        root.right.right.val = 5;
        root.right.left.val = 1;
        System.out.println(gn.goodNodes(root));
        assertEquals(4, gn.goodNodes(root));
    }

    @Test
    public void testCase2() {
        TreeNode root = new TreeNode();
        root.val = 3;
        root.left = new TreeNode();
        // root.right = new TreeNode();

        root.left.left = new TreeNode();
        root.left.left.val = 3;
        root.left.left.left = new TreeNode();
        root.left.left.right = new TreeNode();

        root.left.left.left.val = 4;
        root.left.left.right.val = 2;

        System.out.println(gn.goodNodes(root));
        assertEquals(3, gn.goodNodes(root));
    }

    @Test
    public void testCase1() {
        TreeNode root = new TreeNode();
        root.val = 1;

        System.out.println(gn.goodNodes(root));
        assertEquals(1, gn.goodNodes(root));
    }

}