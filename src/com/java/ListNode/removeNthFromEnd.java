package com.java.ListNode;

/**
 * 题目描述：删除链表倒数第N个节点，一次遍历完成
 *
 * 思路：双指针，让一个先走N步，另一个从头开始，同步前进。当先走的出现==null时，直接将另一个的后继节点删除。
 * (巧妙的解题思路都是从结果倒推)
 * */

public class removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode r = dummy;
        int length = getLength(head);
        for (int i = 1 ;i<length-n+1 ; i++){
            r = r.next;
        }
        r.next = r.next.next;
        return dummy.next;
    }
    public int getLength(ListNode head){
        int length = 0;
        while(head != null){
            ++length;
            head = head.next;
        }
        return length;
    }

    public ListNode removeNthFromEnd_onetime(ListNode head, int n){
        //假设给出的参数都是正确的
        ListNode fast = head;
        while (n > 0){
            fast = fast.next;
            n--;
        }
        if (fast == null)return head;//当走了<=n步就为null的话，说明节点总数为n，那么直接删除第一个节点即可
        ListNode slow = head;
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
