import com.extraClasses.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // if p and q are both null then they're both missing a node
        // which is structurally correct
        if (p == null && q == null) return true;
        // one of p and q is null, structurally incorrect
        if (q == null || p == null) return false;
        // if val is not the same, theyre not the same
        if (p.val != q.val) return false;

        // Traverse right and left
        return isSameTree(p.right, q.right) &&
                isSameTree(p.left, q.left);
    }


}
