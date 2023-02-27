package org.example.tasks;

import org.example.tasks.models.ListNode;

import java.util.HashSet;
import java.util.Set;


/**
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * <p>
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
 * Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 * <p>
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 */
public class LinkedListCycle {

    /*
        Time complexity: O(N)
        Space: O(N)
     */
    public boolean hasCycle(ListNode head) {

        Set<ListNode> set = new HashSet<>();

        while (head.next != null) {
            if (set.contains(head))
                return false;
            set.add(head);
            head = head.next;
        }
        return true;
    }

    /*
        Time complexity: O(N)
        Space: O(1)
        1) Use two pointers, walker and runner.
        2) walker moves step by step. runner moves two steps at time.
        3) if the Linked List has a cycle walker and runner will meet at some
        point.
     */
    public boolean hasCyclePointers(ListNode head) {
        if (head == null)
            return false;
        ListNode walker = head;
        ListNode runner = head;
        while (runner.next != null && runner.next.next != null) {
            walker = walker.next;
            runner = runner.next.next;
            if (walker == runner)
                return true;
        }
        return false;
    }


}
