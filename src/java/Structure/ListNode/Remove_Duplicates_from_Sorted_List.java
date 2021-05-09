package java.Structure.ListNode;

/**
 * 题目描述：有序链表，删除重复节点输出
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 *
 * 思路：有序链表的重复节点是挨着的
 * */

public class Remove_Duplicates_from_Sorted_List {
    public ListNode deleteDuplicates(ListNode head){
        //递归方式
        if (head == null || head.next == null)return head;
        head.next = deleteDuplicates(head.next);
        return head.val != head.next.val ? head : head.next;

    }
}
