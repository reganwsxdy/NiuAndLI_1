package ExaminationOnly.xiecheng;

import java.util.Scanner;
class Node{
    char val;
    Node pre;
    Node next;
    boolean flag;

    public Node(char val, Node pre, Node next, boolean flag){
        this.val = val;
        this.pre = pre;
        this.next = next;
        this.flag = flag;
    }
}

public class test1 {
    static String buildingHouse(String n) {
        int month = Integer.parseInt(n);
        Node head = new Node('R', null, null, true);
        Node temp = head;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i<=month; i++){
            if (temp.flag){
                Node pre = new Node('G', null, temp, true);
                Node next = new Node('R',head, null,true);
                temp.next = next;
                temp.pre = pre;
                temp.flag = false;
                continue;
            }
            Node temp1 = temp;
            while (temp1.next!=null){
                temp1 = temp1.next;
                if (temp1.flag){
                    Node pre = new Node('G', temp1.pre, temp1,true);
                    Node next = new Node('R', temp1, temp1.next, true);
                    if (temp1.next != null){
                        temp1.next.pre = next;
                    }
                    temp1.pre.next = pre;
                    temp1 = next;
                }
            }
            Node temp2 = temp;
            while (temp2.pre!=null){
                temp2 = temp2.pre;
                if (temp2.flag){
                    Node pre = new Node('G', temp2.pre, temp2,true);
                    Node next = new Node('R', temp2, temp2.next, true);
                    if (temp2.pre!= null){
                        temp2.pre.next = pre;
                    }
                    temp2.next.pre = next;
                    temp2 = pre;
                    }
                }
            }
        Node first = head;
        while (first.pre!= null){
            first = first.pre;
        }
        while (first.next!=null){
            sb.append(first.val);
            first = first.next;
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;
        String _n;
        try {
            _n = in.nextLine();
        } catch (Exception e) {
            _n = null;
        }

        res = buildingHouse(_n);
        System.out.println(res);
    }
}
