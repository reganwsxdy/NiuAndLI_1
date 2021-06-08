package com.JianZhiOffer.Easy;


import com.JianZhiOffer.ListNode;

public class 合并有序链表 {
    public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        // write code here
        ListNode newHead = new ListNode();
        ListNode tail = newHead;
        if(l1.val >= l2.val){
            tail.next = l2;
            l2 = l2.next;
            tail = tail.next;
        }else{
            tail.next = l1;
            l1 = l1.next;
            tail = tail.next;
        }
        if(l1==null)tail.next = l2;
        if(l2==null)tail.next = l1;

        return newHead;
    }
}
