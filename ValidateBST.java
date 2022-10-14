import com.extraClasses.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 98. Validate Binary Search Tree
public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        List<Integer> increasingList = new ArrayList<>();
        isValidBST(root, increasingList);
        boolean isOk = true;
        for (int i = 0; i < increasingList.size(); ++i) {
            if (i - 1 >= 0) {
                if (increasingList.get(i) <= increasingList.get(i - 1)) {
                    isOk = false;
                    break;
                }
            }
        }
        return isOk;
    }

    public boolean isValidBST(TreeNode root, List<Integer> increasingList) {
        if (root == null) {
            return true;
        }
        isValidBST(root.left, increasingList);
        increasingList.add(root.val);
        isValidBST(root.right, increasingList);
        return true;
    }
}
