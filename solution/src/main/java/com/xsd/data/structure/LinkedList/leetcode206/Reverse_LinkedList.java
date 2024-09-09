package com.xsd.data.structure.LinkedList.leetcode206;

import com.xsd.data.structure.LinkedList.ListNode;

public class Reverse_LinkedList {

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

}
