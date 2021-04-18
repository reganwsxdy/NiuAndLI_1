package com.java.ListNode;

/**
 * 题目：反转链表
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *
 * 思路：1 所有关于链表的插入删除一定要知道某个节点的前驱结点
 *  2 只要涉及链表的遍历必须要有至少一个跟踪节点。
 * */

public class reverse_ListNode {
    public ListNode reverseList(ListNode head){
        //头插法
        ListNode newhead = new ListNode(-1);
        while (head != null){
            ListNode next = head.next;
            head.next = newhead.next;
            newhead.next = head;
            head = next;
        }
        return newhead.next;
    }

    public ListNode reverseList_1(ListNode head){
        //递归,本质上是尾插法
        if (head == null || head.next == null) return head;
        //newHead指向反转后的链表的头结点，next依旧指向之前的第二个现在的最后一个结点
        ListNode next = head.next;
        ListNode newHead = reverseList_1(next);
        next.next = head;
        head.next = null;

        return newHead;

    }

    public static void main(String[] args) {

    }
}
