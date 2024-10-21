package com.xsd.data.structure.linkednode.leetcode023;

import com.xsd.data.structure.linkednode.ListNode;

import java.util.ArrayList;

public class GetIntecrsectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ArrayList nodeList = new ArrayList();
        ListNode intecsrectionNode = null;
        if (headA.next != null) {
            nodeList.add(headA);
            headA = headA.next;
        }
        while (headB.next != null ){
            for (int i = 0; i < nodeList.size(); i++) {
                if (nodeList.get(i) == headB){
                    intecsrectionNode = headB;
                    break;
                }
                headB = headB.next;
            }
        }
        return intecsrectionNode;
    }
}
