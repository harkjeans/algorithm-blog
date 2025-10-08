/**
 * File: LinkedList.java
 * Created Time: 2025-10-06
 * Author: harkjeans (chengqi172@gmail.com)
 */

package code.chapter_array_and_linkedlist;

import code.utils.*;

public class LinkedList {
    /* 在链表的节点 n0 之后插入节点 P */
    static void insert(ListNode n0, ListNode P) {
        ListNode n1 = n0.next;
        P.next = n1;
        n0.next = P;
    }

    /* 删除链表的节点 n0 之后的首个节点 */
    static void remove(ListNode n0) {
        if (n0.next == null)
            return;
        // n0 -> P -> n1
        ListNode P = n0.next;
        ListNode n1 = P.next;
        n0.next = n1;
    }
            
    public static void main(String[] args) {
        /* 初始化链表 */
        // 初始化各个节点
        ListNode n0 = new ListNode(1);
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(5);
        ListNode n4 = new ListNode(4);
        // 构建节点之间的引用
        n0.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        System.out.println("初始化的链表为:");
        PrintUtil.printLinkedList(n0);

        /* 插入节点 */
        insert(n0, new ListNode(0));
        System.out.println("插入节点后的链表为");
        PrintUtil.printLinkedList(n0);

        /* 删除节点 */
        remove(n0);
        System.out.println("删除节点后的链表为");
        PrintUtil.printLinkedList(n0);
    }
    
}
