package org.questions.persistance;

class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1(int val) {
        this.val = val;
    }
}

public class BalancedBinaryTree {

    public static boolean isBalanced(TreeNode1 root) {
        return checkHeight(root) != -1;
    }

    private static int checkHeight(TreeNode1 node) {

        // Base condition
        if (node == null) {
            return 0;
        }

        // Check left subtree
        int leftHeight = checkHeight(node.left);

        if (leftHeight == -1) {
            return -1;
        }

        // Check right subtree
        int rightHeight = checkHeight(node.right);

        if (rightHeight == -1) {
            return -1;
        }

        // Check balance condition
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        // Return current node height
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {

        TreeNode1 root = new TreeNode1(1);

        root.left = new TreeNode1(2);
        root.right = new TreeNode1(3);

        root.left.left = new TreeNode1(4);
        root.left.right = new TreeNode1(5);

        System.out.println(isBalanced(root));
    }
}
