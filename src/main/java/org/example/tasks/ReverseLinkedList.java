package org.example.tasks;

import org.example.tasks.models.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode reversed = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = reversed;
            reversed = curr;
            curr = temp;
        }
        return reversed;
    }

    @Test
    void test(){

        ListNode expected = new ListNode(4, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1, new ListNode(1))))));
        ListNode actual = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));

        Assertions.assertEquals(expected, reverseList(actual));
    }
}
