package org.evgen;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
// https://hyperskill.org/learn/step/32040
public class MaximumDepthOfBinaryTree104 {
    public static void run() {
        var tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);

        tree.left.left = new TreeNode(4);
        tree.left.left.left = new TreeNode(5);

        int res = maxDepth(tree);
        System.out.println("Result: " + res);
    }

    private static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        var countLeft = maxDepth(root.left);
        var countRight = maxDepth(root.right);

        return 1 + Math.max(countLeft, countRight);
    }

    static  public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
