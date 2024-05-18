import java.util.ArrayList;
import java.util.Collections;
public class SortList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = findMid(head);
        ListNode newhead = findMid(head).next;
        mid.next = null;
        ListNode head1 = sortList(head);
        ListNode head2 = sortList(newhead);
        return mergetwo(head1,head2);

    }
    public ListNode findMid(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        //hare and rabbit approch (slow and fast pointer)  to find the mid point
        while( fast.next!=null&&fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
    public ListNode mergetwo(ListNode head1,ListNode head2){
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        while(head1!=null && head2!=null){
            if(head1.val<head2.val){
                ans.next=head1;
                head1 = head1.next;
            }else{
                ans.next = head2;
                head2 = head2.next;
            }
            ans = ans.next;
        }
        if (head1 != null) {
            ans.next = head1;
        }
        if (head2!=null){
            ans.next = head2;
        }

        return dummy.next;
    }
//    public ListNode sortList(ListNode head) {
//        ListNode temp = head;
//        ArrayList<Integer> arr = new ArrayList<>();
//        while(temp!=null ){
//            arr.add(temp.val);
//            temp = temp.next;
//        }
//        Collections.sort(arr);
//        ListNode t = head;
//        int i = 0;
//        while(i<arr.size()&&t!=null){
//            t.val = arr.get(i);
//            i++;
//            t = t.next;
//        }
//        return head;
//    }
}
