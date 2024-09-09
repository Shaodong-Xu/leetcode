package com.xsd.data.structure.LinkedList.leetcode141;

import com.xsd.data.structure.LinkedList.ListNode;

import java.util.ArrayList;
import java.util.List;

public class LinkedListHasCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        List<ListNode> nodeList = new ArrayList<>();
        int pos = -1;
        boolean result = false;
        while (head.next != null && !nodeList.contains(head)) {
            nodeList.add(head);
            head = head.next;
        }
        if (head.next != null) {
            result = true;
            pos = nodeList.size() + 1 - nodeList.indexOf(head);
        }
        return result;
    }

}
