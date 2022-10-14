import com.extraClasses.TreeNode;

import java.util.Stack;

public class LowestCommonAncestorBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode> stackTreeNode = new Stack<>();
        stackTreeNode.add(root);
        TreeNode answer = null;
        while(!stackTreeNode.isEmpty()) {
            TreeNode current = stackTreeNode.pop();
            // if current node is bigger / smaller than both, traverse accordingly, else return current
            if (current.val > p.val && current.val > q.val) stackTreeNode.add(current.left);
            else if (current.val < p.val && current.val < q.val) stackTreeNode.add(current.right);
            else {answer = current; break;}
        }

        return answer;
    }
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        Stack<TreeNode> stackTreeNode = new Stack<>();
//        stackTreeNode.add(root);
//        TreeNode answer = null;
//        while(!stackTreeNode.isEmpty()) {
//            TreeNode current = stackTreeNode.pop();
//            System.out.println("Loop");
//            if (current.left != null && current.right != null && current.left.val == p.val && current.right.val == q.val) {
//                answer = current;
//                break;
//            }
//
//            if (current.val == p.val && current.right != null && current.right.val == q.val) {
//                answer = current;
//                break;
//            }
//
//            else if (current.val == q.val && current.left != null && current.left.val == p.val) {
//                answer = current;
//                break;
//            } else {
//                if (current.right != null) {
//                    stackTreeNode.add(current.right);
//                }
//                if (current.left != null) {
//                    stackTreeNode.add(current.left);
//                }
//            }
//        }
//
//        return answer;
//    }
}
