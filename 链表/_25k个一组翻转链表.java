package 链表;

import java.util.Deque;
import java.util.LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class _25k个一组翻转链表 {
    public ListNode reverseKGroup(ListNode head, int k) {
        Deque<ListNode> stake = new LinkedList<>();
        ListNode p = head;
        ListNode nhead = new ListNode();
        nhead.next = head;
        ListNode pre = nhead;
        while(p != null){
            ListNode temp = p;
            int count = 0;
            while(temp != null && count < k){
                stake.push(temp);
                temp =temp.next;
                count++;
            }
            if(count<k){
                break;
            }
            while(stake.size()>0){

                pre.next = stake.peek();
                stake.pop();
                pre = pre.next;
            }
            p = temp;
            pre.next = p;
        }
        return pre.next;
    }

}
