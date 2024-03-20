package com.xsdLearn.LinkedList.easy;

public class LC206_Reverse_LinkedList {

    public LC206_ListNode reverseList(LC206_ListNode head) {

        LC206_ListNode prev = null;
        LC206_ListNode current = head;
        LC206_ListNode next = null;

        while (current != null) {
            /**
             *  current = 1->2->3->4->null
             *  next = 2 -> 3 -> 4 -> null
             *
             */
            next = current.next;
            /**
             * 让current 指向 prev
             * 在执行此行代码之前的
             * next
             * 执行此行代码之后
             * null <- 1  2 -> 3 -> 4 -> null
             * 其中 prev = null 是1 指向的 元素
             * next = 2 -> 3 -> 4 -> null
             * current = 1 -> null
             */
            current.next = prev;

            /**
             * 将current 赋给 prev
             * next = 2 -> 3 -> 4 -> null
             * current = 1 -> null
             * prev = 1 -> null
             */
            prev = current;

            /**
             * 将next 赋给 current
             * next = 2 -> 3 -> 4 -> null
             * current = 2 -> 3 -> 4 -> null
             * prev = 1 -> null
             */
            current = next;
        }
        return prev;
    }

}
