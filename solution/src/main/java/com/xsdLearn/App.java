package com.xsdLearn;

import com.xsdLearn.LinkedList.easy.LC206_ListNode;
import com.xsdLearn.LinkedList.easy.LC206_Reverse_LinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        LC206_Reverse_LinkedList solution = new LC206_Reverse_LinkedList();

        // 创建链表 1->2->3->4->5
        LC206_ListNode head = new LC206_ListNode(1);
        head.next = new LC206_ListNode(2);
        head.next.next = new LC206_ListNode(3);
        head.next.next.next = new LC206_ListNode(4);
        head.next.next.next.next = new LC206_ListNode(5);

        // 打印原始链表
        System.out.println("原始链表：");
        LC206_ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();

        // 反转链表
        head = solution.reverseList(head);

        // 打印反转后的链表
        System.out.println("反转后的链表：");
        current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
