package org.evgen;


import java.util.*;

// https://leetcode.com/problems/average-of-levels-in-binary-tree/
// https://www.youtube.com/watch?v=uv7HgZa1yTk
public class AverageOfLevelsInBinaryTree637 {
    public static void run() {
        var tree = new TreeNode(3);
        tree.left = new TreeNode(9);
        tree.right = new TreeNode(20);

        tree.left.left = new TreeNode(15);
        tree.left.right = new TreeNode(7);


        var res = getAverage(tree);
        System.out.println("Result: " + res);
    }

    public static List<Double> getAverage(TreeNode root) {
        List<Double> resultList = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0.0;

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (node == null) {
                   throw new RuntimeException("Node is null");
                }

                sum += node.val;

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            double average = sum / size;
            resultList.add(average);
        }

        return resultList;
    }

    static public class TreeNode {
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
