package company.meituan;
/**
 * 删除倒数第N个，默认head指向第一个节点而不是空节点
 * */
public class removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < n; i++){
            fast = fast.next;
        }
        if (fast == null) return head;
        while (fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}

class ListNode{
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
