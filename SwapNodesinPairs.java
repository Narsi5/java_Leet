public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while(prev.next != null && prev.next.next != null){
            ListNode first = prev.next;
            ListNode second = first.next;

            prev.next = second;
            first.next = second.next;
            second.next = first;

            prev = first;
        }
        return dummy.next;
    }

}
