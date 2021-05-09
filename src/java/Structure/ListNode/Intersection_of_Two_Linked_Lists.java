package java.Structure.ListNode;

/***
 * 题目描述，给定两个链表，返回其相交的节点值val,如果不存在，则返回null
 * 思路：链表相交，则当两链表循环遍历时必会出现节点相同的情况
 */


public class Intersection_of_Two_Linked_Lists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode l1 = headA , l2 = headB;
        while (l1 != l2){
            //下面的判断是l1==null而不是l1.next==null，因为要保证l1\l2同时为空的情况，如果l1l2都把对方也遍历完了，就会同时指向空，二者相等，
            // 从而退出循环，否则将无限循环
            l1 = l1 == null? headB:l1.next;
            l2 = l2 == null? headA:l2.next;
        }
        return l1;
    }
}
