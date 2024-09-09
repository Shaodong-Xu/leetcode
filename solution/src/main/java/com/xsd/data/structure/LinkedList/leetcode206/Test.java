package com.xsd.data.structure.LinkedList.leetcode206;

import com.xsd.data.structure.LinkedList.ListNode;

public class Test {

    public static ListNode constructNodeList() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        return node1;
    }

    public static void main(String[] args) {
        ListNode head = constructNodeList();
        Reverse_LinkedList reverse = new Reverse_LinkedList();

        ListNode result = reverse.reverseList(head);
    }

}
