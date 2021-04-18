package com.JianZhiOffer.Hard;
/**
 * 链表从后向前输出
 * 方法1：反转链表后输出
 * 方法2：顺序入栈，然后出栈
 * */
import java.util.ArrayList;

public class reverseListNodePrint {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> al = new ArrayList<>();
        ListNode newHead = reverseListNode(listNode);
        while (newHead != null){
            al.add(newHead.val);
            newHead = newHead.next;
        }
        return al;
    }

    public static ListNode reverseListNode(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode newHead = reverseListNode(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
