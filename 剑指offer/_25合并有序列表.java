package 剑指offer;

public class _25合并有序列表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode n = new ListNode(0);
        ListNode p3 = n;
        ListNode p1 = l1;
        ListNode p2 = l2;
        while(p1 != null || p2 != null){
            if (p1 == null){
                p3.next = p2;
                p3 = p3.next;
                break;
            }
            if (p2 == null){
                p3.next = p1;
                p3 = p3.next;
                break;
            }
            if (p1.val>p2.val){
                p3.next = p2;
                p2 = p2.next;
            }else{
                p3.next = p1;
                p2 = p2.next;
            }
            p3 = p3.next;



        }
        return n.next;
    }
}
