package com.java.ListNode;

/**
 * 两链表相加问题：通过java链表进行操作，其中head指向（代表）头节点或者首元节点，tail是尾节点，指向（代表）最后一个元素
 * 解题思路：初始化一个空链表作为接收结果的链表，其难点有两个，一个是两个相加的链表可能长度不同，另一个是相加的进位值要加到下一个节点中
 * 注意：在写while循环时（和for循环属于遍历，相对有所不同），要注意一般来说每一次循环过来会产生不同的情况（如果属于触发条件类型则改用switch非循环），
 * 因此要使用到多次if
 * l1 l2均为跟踪节点
 *
 * 代码在while中分为两个阶段，第一个阶段是l1l2还未遍历完时，第二个为两个链表都遍历完时
 *
 * */

public class merge_two_listNode {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode i1 = l1 , i2 = l2;
        ListNode head = new ListNode();
        ListNode tail = head;
        while (i1 != null && i2 != null){
            if (i1.val >= i2.val){
                tail.next = i2;
                tail = tail.next;
                i2 = i2.next;
            }else {
                tail.next = i1;
                tail = tail.next;
                i1 = i1.next;
            }
        }
        if (i1 != null)tail.next = i1;
        if (i2 != null)tail.next = i2;

        return head.next;
    }
}
