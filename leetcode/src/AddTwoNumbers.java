import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Kyle.Wang
 * 2018/1/30 0030 14:36
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(4);
        node1.next=node2;
        node2.next=node3;
        node4.next=node5;
        node5.next=node6;

        System.out.println(addTwoNumbers(node1,node4));;
    }


    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(l1.val+l2.val);
        if(l1.next!=null){


        }
        return result;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "ListNode{" + "val=" + val + ", next=" + next + '}';
    }
}
