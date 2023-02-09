package org.example.tasks;

import org.example.tasks.models.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoSumIV {
    private Set<Integer> set = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {
        // Решение перебором
//        List<Integer> list = new ArrayList<>();
//        treeItemsToList(root, list);
//
//        int index = 0;
//        while (index < list.size()) {
//            int i = index;
//            for (; i < list.size() - 1; i++) {
//                if (list.get(index) + list.get(i + 1) == k) {
//                    return true;
//                }
//            }
//            index++;
//        }
//        return false;

            // Решение рекурсией
            if (root == null)
                return false;
            if (set.contains(k - root.val))
                return true;
            set.add(root.val);
            return findTarget(root.left, k) || findTarget(root.right, k);
    }


    private void treeItemsToList(TreeNode node, List<Integer> list) {
        if (node == null)
            return;
        treeItemsToList(node.left, list);
        list.add(node.val);
        treeItemsToList(node.right, list);
    }

    @Test
    public void test() {
        TreeNode treeRoot = new TreeNode(5,
                new TreeNode(3,
                        new TreeNode(2), new TreeNode(4)),
                new TreeNode(6, null, new TreeNode(7)));

        Assertions.assertTrue(findTarget(treeRoot, 9));
        Assertions.assertFalse(findTarget(treeRoot, 28));
        TreeNode treeRoot2 = new TreeNode(2,
                new TreeNode(1),
                new TreeNode(3));

        Assertions.assertFalse(findTarget(treeRoot2, 1));
        Assertions.assertTrue(findTarget(treeRoot2, 3));
        TreeNode treeRoot3 = new TreeNode(2,
                new TreeNode(1, new TreeNode(-4), null),
                new TreeNode(3, new TreeNode(0), null));

        Assertions.assertTrue(findTarget(treeRoot3, 2));
    }


}
