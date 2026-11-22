package org.questions.persistance;

import java.util.LinkedList;
import java.util.Queue;

// Question : write a method to perform level order traversal of binary tree

 class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
    }
}

public class LevelOrderTraversal {

    public static void levelOrder(TreeNode root) {

        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        // Start with root
        queue.offer(root);

        while (!queue.isEmpty()) {

            // Remove current node
            TreeNode current = queue.poll();

            System.out.print(current.value + " ");

            // Add left child
            if (current.left != null) {
                queue.offer(current.left);
            }

            // Add right child
            if (current.right != null) {
                queue.offer(current.right);
            }
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        levelOrder(root);
    }
}
