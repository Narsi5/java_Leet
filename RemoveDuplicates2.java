public class RemoveDuplicates2 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null||head.next == null){
            return head;
        }
        ListNode curr = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while(curr!=null&&curr.next!=null){
            boolean flag = false;
            while(curr.next!=null && curr.val == curr.next.val){
                curr=curr.next;
                flag = true;
            }
            if(flag){
                prev.next = curr.next;
            }else{
                prev = prev.next;
            }
            curr=curr.next;
        }
        return dummy.next;
    }

}
