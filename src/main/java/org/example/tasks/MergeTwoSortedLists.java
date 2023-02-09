package org.example.tasks;

import org.example.tasks.models.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode resNode = new ListNode(0);
        ListNode tempNode = resNode;

        while (list1 != null || list2 != null) {

            if (list1 == null) {
                tempNode.next = new ListNode(list2.val);
                list2 = list2.next;
            } else if (list2 == null) {
                tempNode.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                if (list1.val < list2.val) {
                    tempNode.next = new ListNode(list1.val);
                    list1 = list1.next;
                } else {
                    tempNode.next = new ListNode(list2.val);
                    list2 = list2.next;
                }
            }
            tempNode = tempNode.next;
        }
        return resNode.next;
    }


    public ListNode mergeTwoListsWithRecursive(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        ListNode head;
        if (l1.val < l2.val) {
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
        } else {
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }
        return head;
    }

    @Test
    void test() {

        Assertions.assertEquals(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4)))))),
                mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4))), new ListNode(1, new ListNode(3, new ListNode(4)))));
        Assertions.assertNull(mergeTwoLists(null, null));
        Assertions.assertEquals(new ListNode(0), mergeTwoLists(null, new ListNode(0)));
        Assertions.assertEquals(new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(5)))),
                mergeTwoLists(new ListNode(5), new ListNode(1, new ListNode(2, new ListNode(4)))));
    }

    @Test
    void testRecursive() {

        Assertions.assertEquals(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4)))))),
                mergeTwoListsWithRecursive(new ListNode(1, new ListNode(2, new ListNode(4))), new ListNode(1, new ListNode(3, new ListNode(4)))));
        Assertions.assertNull(mergeTwoListsWithRecursive(null, null));
        Assertions.assertEquals(new ListNode(0), mergeTwoListsWithRecursive(null, new ListNode(0)));
        Assertions.assertEquals(new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(5)))),
                mergeTwoListsWithRecursive(new ListNode(5), new ListNode(1, new ListNode(2, new ListNode(4)))));
    }
}