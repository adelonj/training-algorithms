package org.example.tasks;

import org.example.tasks.models.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;


public class SumOfLeftLeaves {

    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if (root == null)
            return 0;
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.push(root);

        while (!q.isEmpty()) {
            TreeNode node = q.pop();
            if (node.left != null) {
                if (node.left.left == null && node.left.right == null)
                    sum += node.left.val;
                else
                    q.push(node.left);
            }
            if (node.right != null)
                q.push(node.right);
        }
        return sum;
    }

    public int sumOfLeftLeavesRecursion(TreeNode root) {
        sumOfLeftLeaves(root, false);
        return sum;
    }

    private void sumOfLeftLeaves(TreeNode node, boolean isLeft) {
        if (node == null)
            return;
        if (node.left == null && node.right == null && isLeft) {
            sum += node.val;
            return;
        }
        sumOfLeftLeaves(node.left, true);
        sumOfLeftLeaves(node.right, false);
    }

    @Test
    public void test() {
    /*  #Test 1

             5
          /     \
        3         6
       / \      /   \
     2    4   null   7
    */
        TreeNode treeRoot1 = new TreeNode(5,
                new TreeNode(3,
                        new TreeNode(2), new TreeNode(4)),
                new TreeNode(6, null, new TreeNode(7)));
        Assertions.assertEquals(2, sumOfLeftLeaves(treeRoot1), "Sum using Queue");
        Assertions.assertEquals(2, sumOfLeftLeavesRecursion(treeRoot1), "Sum by Recursion");
        sum = 0;

    /*  #Test 2

     [0,2,4,1,null,3,-1,5,1,null,6,null,8]

              0
          /       \
        2           4
       / \       /     \
     1   null   3       -1
    / \       /  \     /   \
  5    1    null   6  null  8
    */
        TreeNode treeRoot2 =
                new TreeNode(0,
                        new TreeNode(2, new TreeNode(1, new TreeNode(5), new TreeNode(1)), null),
                        new TreeNode(4,
                                new TreeNode(3, null, new TreeNode(6)),
                                new TreeNode(-1, null, new TreeNode(8))));
        Assertions.assertEquals(5, sumOfLeftLeavesRecursion(treeRoot2), "Sum by Recursion");
        Assertions.assertEquals(5, sumOfLeftLeaves(treeRoot2), "Sum using Queue");
    }
}
