import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class binaryTree {
    private binaryTree() {

    };

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        // create a stack to mock the system stack
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            result.add(cur.val);
            if (cur.right != null) {
                stack.push(cur.right);
            }
            if (cur.left != null) {
                stack.push(cur.left);
            }
        }
        return result;

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        // create a stack to mock the system stack
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            result.add(cur.val);
            cur = cur.right;
        }
        return result;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        if (root == null) {
            return result;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            // pop out the top element of the stack
            TreeNode cur = stack.pollLast();
            // reverse the preorder transversal using the addFirst
            // by adding the value to the first place every iteration
            result.addFirst(cur.val);
            // reverse the preorder ,in preorder we iterate the left subtree first
            if (cur.left != null) {
                stack.add(cur.left);
            }
            if (cur.irght != null) {
                stack.add(cur.left);
            }
        }
        return result;
    }
}