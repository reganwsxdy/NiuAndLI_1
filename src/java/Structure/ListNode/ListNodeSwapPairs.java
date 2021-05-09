package java.Structure.ListNode;

/**两两交换链表节点，对比反转链表问题
 *
 * 输入：head = [1,2,3,4]
 * 输出：[2,1,4,3]
 * */
public class ListNodeSwapPairs {
    //递归法
    public ListNode swapPairs(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode sec = head.next;
        sec.next = swapPairs(sec.next);
        head.next = sec.next;
        sec.next = head;
        return sec;
    }
}
