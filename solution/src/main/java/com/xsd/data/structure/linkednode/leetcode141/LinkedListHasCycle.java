package com.xsd.data.structure.linkednode.leetcode141;

import com.xsd.data.structure.linkednode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class LinkedListHasCycle {


  /*
  Description :
    If every node in the linked list is unique, the linked list does not have any cycle.
    If there is a node can be found in last nodes, the linked list has cycle.
   */
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        List<ListNode> nodeList = new ArrayList<>();
//      pos is needed to show the number of linked node in the cycle
        int pos = -1;
        boolean result = false;
        while (head != null && !nodeList.contains(head)) {
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
